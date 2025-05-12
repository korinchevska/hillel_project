package HW26;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Pages.LoginPage;
import io.qameta.allure.*;

@Epic("Login")
@Feature("Authentication")
@Story("Invalid Login Attempts")
public class LoginTest {
    public static WebDriver createChromeDriver() {
        return new ChromeDriver();
    }
    WebDriver driver;
    LoginPage loginPage;
    @BeforeMethod
    public void setUp() {
        driver = createChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        loginPage = new LoginPage(driver);
    }
    @Test(dataProvider = "testData", description = "Checking invalid login attempts with different credentials")
    @Owner("korinchevska")
    @Description("Verifying the error message for invalid login attempts")
    @Link(name = "QAuto task", url = "https://qauto.forstudy.space")
    public void testInvalidLogin(String email, String password) {
        loginPage.clickSignIn();
        loginPage.enterCredentials(email, password);
        loginPage.clickLoginButton();

        String errorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(errorMessage, "Wrong email or password", "Error message mismatch");

    }
    @DataProvider(name = "testData")
    public Object[][] getLoginData() {
        return new Object[][]{
                {"test@hillel.ua", "1111"},
                {"test@hillel.ua", "1234"}
        };
    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
