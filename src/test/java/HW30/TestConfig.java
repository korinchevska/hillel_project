package HW30;

import io.restassured.RestAssured;

public class TestConfig {
    public static void setup() {
        RestAssured.baseURI = "https://qauto.forstudy.space";
    }
}
