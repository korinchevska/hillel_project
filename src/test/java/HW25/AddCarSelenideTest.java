package HW25;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.LoginPageSelenide;
import Pages.GaragePageSelenide;

import static com.codeborne.selenide.Selenide.*;
public class AddCarSelenideTest {
    LoginPageSelenide loginPage = new LoginPageSelenide();
    GaragePageSelenide garagePage = new GaragePageSelenide();
    @BeforeClass
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        open("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    @Test(description = "Checking the addition of a car through a guest login in Chrome via Selenide")
    public void testAddCar() {
        loginPage.clickGuestLogin();
        garagePage.clickAddCar();
        garagePage.fillCarForm("Audi", "TT", 20);
        garagePage.clickAddButton();
        garagePage.verifyCarData();
    }
}
