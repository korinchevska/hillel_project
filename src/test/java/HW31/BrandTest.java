package HW31;

import Pages.TestConfig;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import java.net.URI;
import java.net.http.*;

public class BrandTest {
    @BeforeClass
    public void setup() {
        TestConfig.setup();
    }

    @Test
    public void testBrandCar()throws Exception {
        String endpoint = "/api/cars/brands";
        String baseUri = TestConfig.setup();
        String fullUrl = baseUri + endpoint;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(fullUrl))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.statusCode(), 200, "Status code should be 200");
        String responseBody = response.body();
        softAssert.assertTrue(responseBody.contains("\"id\":1"), "Response body should contain '\"id\":1'");
        softAssert.assertTrue(responseBody.contains("\"title\":\"Audi\""), "Response body should contain '\"title\":\"Audi\"'");
        softAssert.assertAll();

    }
    }

