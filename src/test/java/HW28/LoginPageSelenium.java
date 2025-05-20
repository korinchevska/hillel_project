package HW28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPageSelenium {
    private WebDriver driver;

    // Елементи на сторінці
    private By emailInput = By.cssSelector("#signinEmail");
    private By passwordInput = By.cssSelector("#signinPassword");
    private By signInButton = By.cssSelector("button.btn.btn-outline-white.header_signin");
    private By errorMessage = By.cssSelector("app-signin-form form > p");
    private By loginInButton = By.cssSelector("div.modal-footer.d-flex.justify-content-between > button.btn.btn-primary");


    public LoginPageSelenium(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    public void enterCredentials(String email, String password) {
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void submit() {
        driver.findElement(signInButton).click();
    }

    public String getErrorMessage() {
        WebElement error = driver.findElement(errorMessage);
        return error.getText();
    }
}
