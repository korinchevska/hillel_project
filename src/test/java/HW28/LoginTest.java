package HW28;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    @Parameters({"browser"})
    public void testWrongLoginCredentials(String browser) throws Exception {
        driver = WebDriverPage.getDriver(browser);

        LoginPageSelenium loginPage = new LoginPageSelenium(driver);
        loginPage.open();
        loginPage.enterCredentials("test@hillel.ua", "1111");
        loginPage.submit();

        String errorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(errorMessage, "Wrong email or password");
    }
}
