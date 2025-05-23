package Pages;

import io.restassured.RestAssured;

public class TestConfig {
    public static String setup() {
        return RestAssured.baseURI = "https://qauto.forstudy.space";
    }
}
