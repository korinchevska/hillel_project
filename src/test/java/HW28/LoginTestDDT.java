package HW28;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTestDDT {

    private String baseUrl = "https://guest:welcome2qauto@qauto.forstudy.space/";

    @BeforeEach
    public void setup() {
        String browser = System.getProperty("browser", "chrome");

        if ("chrome".equals(browser)) {
            Configuration.browser = "chrome";
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            Configuration.browserCapabilities = options;
        } else if ("firefox".equals(browser)) {
            Configuration.browser = "firefox";
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("-headless");
            Configuration.browserCapabilities = options;
        }

        Configuration.remote = "http://localhost:4444/wd/hub";
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/loginData.csv", numLinesToSkip = 1)

    public void testLoginErrorMessage(String email, String password) {
        Selenide.open(baseUrl);
        $("button.btn.btn-outline-white.header_signin").click();
        $("#signinEmail").setValue(email);
        $("#signinPassword").setValue(password);
        $("div.modal-footer.d-flex.justify-content-between > button.btn.btn-primary").click();

        String errorMessage = $("app-signin-form form > p").getText();
        assertTrue(errorMessage.contains("Wrong email or password"));
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
