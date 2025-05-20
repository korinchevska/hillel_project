package utils;
import com.codeborne.selenide.Configuration;
public class DriverFactory {

    public static void setupBrowser(String browser) {

        Configuration.browser = browser;

        Configuration.remote = "http://localhost:4444/wd/hub";
    }
}