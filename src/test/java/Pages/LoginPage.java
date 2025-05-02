package Pages;

import org.openqa.selenium.*;

public class LoginPage {
    private  WebDriver driver;
    private final By guestLoginButton = By.xpath("//button[normalize-space()='Guest log in']");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickGuestLogin() {
        driver.findElement(guestLoginButton).click();
    }
}
