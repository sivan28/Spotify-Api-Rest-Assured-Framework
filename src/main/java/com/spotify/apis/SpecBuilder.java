package com.spotify.apis;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import java.io.IOException;

public class SpecBuilder {
    RequestSpecification requestSpecification;
    ResponseSpecification responseSpecification;
   // static String access_token = "BQBzkhICPGb0H8ooJmTh4v_ZhTdr7JBHWYZETEia24j3pmueWn9NCAADeZdweSIDeV5wnjKB035odm-dnFxt9WS1X_F0DlDt5sco_byvi6ahvmP_pdS98CG09f9cU_eGGg1PhtFXGaOJkq7nXnpN_7kHRAZe0hKCSuGE2ZmLB8qE77Bvv4Xh_8QGCq7CG-mLP2xLaCfEuHgygpR14_h-x6t12PtreZUSmhuDtYCxeM7Tg2jJEkqhevDuf8eg2K6Ypni8TtkRn3sGAr5z";

    public static RequestSpecification getRequestSpecification() {
        return new RequestSpecBuilder()
                .setBaseUri("https://api.spotify.com")
                .setBasePath(EndPoints.BASE_PATH)
                .addHeader("Authorization", "Bearer " + TokenManager.getAccessToken())
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
    }

    public static ResponseSpecification getResponseSpecification(){
        return new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
    }

    public static RequestSpecification getAccountRequestSpecification(){
        return new RequestSpecBuilder().
                setBaseUri("https://accounts.spotify.com").
                setContentType(ContentType.URLENC).
                build();
    }
}
