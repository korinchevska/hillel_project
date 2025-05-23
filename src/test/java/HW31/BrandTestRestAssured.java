package HW31;

import Pages.TestConfig;
import io.restassured.RestAssured;
import org.testng.annotations.*;
import static org.hamcrest.CoreMatchers.*;

public class BrandTestRestAssured {
    @BeforeClass
    public void setup() {
        TestConfig.setup();
    }
    @Test
    public void testCarBrandsResponse() {
        RestAssured
                .given()
                .when()
                .get("/api/cars/brands")
                .then()
                .statusCode(200)
                .body("data.id", hasItem(1))
                .body("data.title", hasItem("Audi"));
}}
