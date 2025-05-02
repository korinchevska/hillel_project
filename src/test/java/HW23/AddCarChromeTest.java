package HW23;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import Pages.LoginPage;
import Pages.GaragePage;

import java.time.Duration;

public class AddCarChromeTest {
    public static WebDriver createChromeDriver() {
        return new ChromeDriver();}
    WebDriver driver;
    LoginPage loginPage;
    GaragePage garagePage;

    @BeforeMethod
    public void setUp() {
        driver = createChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        loginPage = new LoginPage(driver);
        garagePage = new GaragePage(driver);
    }
    @Test(description = "Checking the addition of a car through a guest login in Chrome")
    public void testAddCar() {
        loginPage.clickGuestLogin();

        Assert.assertEquals(driver.getCurrentUrl(),
                "https://guest:welcome2qauto@qauto.forstudy.space/panel/garage",
                "Incorrect URL after login");

        garagePage.clickAddCar();
        garagePage.fillCarData("Audi", "TT", 20);
        garagePage.clickAddButton();

        Assert.assertEquals(garagePage.getCarTitle(), "Audi TT", "The car is not displayed");
        Assert.assertTrue(garagePage.getMileageDate().contains(garagePage.getTodayDateFormatted()), "The mileage date does not match the current one");
        Assert.assertEquals(garagePage.getMileageValue(), "20", "The mileage value is not 20");
        Assert.assertTrue(garagePage.isCarImageVisible(), "Car image is not displayed");
        Assert.assertTrue(garagePage.getImageSrc().endsWith("audi.png"), "Image has no ending in audi.png");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
