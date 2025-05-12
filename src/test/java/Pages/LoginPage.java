package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class LoginPage {
    private  WebDriver driver;
    private final By guestLoginButton = By.xpath("//button[contains(@class, 'header-link') and contains(text(), 'Guest log in')]");
    private final By signInButton = By.cssSelector("button.btn.btn-outline-white.header_signin");
    private final By emailInput = By.cssSelector("#signinEmail");
    private final By passwordInput = By.cssSelector("#signinPassword");
    private final By errorMessage = By.cssSelector("p.alert.alert-danger");
    private final By loginButton = By.cssSelector("div.modal-footer.d-flex.justify-content-between > button.btn.btn-primary");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickGuestLogin() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(guestLoginButton))
                .click();
    }

    public void clickSignIn(){
        driver.findElement(signInButton).click();
    }
    public void enterCredentials(String email, String password) {
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
    }
    public String getErrorMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement errorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p.alert.alert-danger")));
            return errorElement.getText();
        } catch (TimeoutException e) {
            return "Error message not found";
        }
    }
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
}
