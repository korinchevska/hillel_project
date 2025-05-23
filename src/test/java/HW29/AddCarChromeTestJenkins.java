package HW29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.LoginPage;
import Pages.GaragePage;
import io.qameta.allure.*;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


@Epic("Garage")
@Feature("Add Car")
@Story("Guest adds Audi TT")
public class AddCarChromeTestJenkins  {

    public static WebDriver createChromeDriver() {
        return new ChromeDriver();
    }
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
    @Test
    @Owner("korinchevska")
    @Description("Adding an Audi TT car for a guest with checking the name, mileage, date, and image")
    @Link(name = "QAuto task", url = "https://lms.ithillel.ua/groups/67406e2394b2c83dff14cbaf/homeworks/680fe3bdad66d86c0cff8a04")
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
