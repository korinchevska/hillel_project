package HW23;


import Pages.GaragePage;
import Pages.LoginPage;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Epic("Garage")
@Feature("Add Car")
@Story("Guest adds Audi TT")
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
    //@Severity(SeverityLevel.NORMAL)
    @Owner("korinchevska")
    @Description("Adding an Audi TT car for a guest with checking the name, mileage, date, and image")
    @Link(name = "QAuto task", url = "https://qauto.forstudy.space")

    public void testAddCar() {
        SoftAssert softAssert = new SoftAssert();

        loginPage.clickGuestLogin();
        softAssert.assertEquals(driver.getCurrentUrl(),
                "https://guest:welcome2qauto@qauto.forstudy.space/panel/garage", "Incorrect URL after login");

        garagePage.clickAddCar();
        garagePage.fillCarData("Audi", "TT", 20);
        garagePage.clickAddButton();

        garagePage.verifyAddedCarData(softAssert);
        softAssert.assertAll();

    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
