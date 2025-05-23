package HW30;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import Pages.TestConfig;

public class LogoutTest {

    @BeforeClass
    public void setup() {
        TestConfig.setup();
    }
    @Test
    public void testLogoutResponse() {
        Response response = RestAssured
                .given()
                .when()
                .get("/api/auth/logout");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getStatusCode(), 200, "Status code should be 200");
        String expectedBody = "{\"status\":\"ok\"}";
        softAssert.assertEquals(response.getBody().asString(), expectedBody, "Response body should be {\"status\":\"ok\"}");
        softAssert.assertAll();
    }
}
