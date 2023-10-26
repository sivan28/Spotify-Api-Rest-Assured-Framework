package com.spotify.apis;

import io.restassured.response.Response;

import java.io.IOException;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class RestApi {
    public static Response post(String path, Object playlistRequest) {
        return given(SpecBuilder.getRequestSpecification())
                .body(playlistRequest).
                when()
                .post(path).
                then()
                .spec(SpecBuilder.getResponseSpecification())
                .extract().response();
    }

    public static Response get(String path) {
        return given(SpecBuilder.getRequestSpecification())
                .when()
                .get(path)
                .then()
                .spec(SpecBuilder.getResponseSpecification())
                .extract().response();
    }

    public static Response postAccount(HashMap<String,String> formParms){
        return given(SpecBuilder.getAccountRequestSpecification()).
                formParams(formParms).
                when().
                post("/api/token").
                then().
                spec(SpecBuilder.getResponseSpecification()).
                extract().response();
    }
}
