package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class LoginPage {
    private  WebDriver driver;
    private final By guestLoginButton = By.xpath("//button[contains(@class, 'header-link') and contains(text(), 'Guest log in')]");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickGuestLogin() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(guestLoginButton))
                .click();
    }
}
