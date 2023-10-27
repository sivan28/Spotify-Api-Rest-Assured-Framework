package com.spotify.apis;

import com.spotify.utils.ConfigLoader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.IOException;
import java.time.Instant;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class TokenManager {
    static String access_token;
    static Instant expiry_time;

    private static Response renewAccessToken() {
        HashMap<String, String> formParms = new HashMap<>();
            formParms.put("grant_type", ConfigLoader.getInstance().getGrantType());
            formParms.put("refresh_token",ConfigLoader.getInstance().getRefreshToken());
            formParms.put("client_id",ConfigLoader.getInstance().getClientId());
            formParms.put("client_secret",ConfigLoader.getInstance().getClientSecret());

            Response response = RestApi.postAccount(formParms);

            if(response.getStatusCode() != 200){
                System.out.println("Token renewal failed!");
            }
            return response;
    }

    public synchronized static String getAccessToken() {
        if(access_token == null || Instant.now().isAfter(expiry_time)){
            access_token = renewAccessToken().path("access_token");
            expiry_time = Instant.now().plusSeconds(3600 - 200);
        }
        else {
            System.out.println("Token is good to use");
        }
        return access_token;
    }
}
