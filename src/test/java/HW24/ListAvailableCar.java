package HW24;
import Pages.GaragePage;
import Pages.LoginPage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class ListAvailableCar {
    public static WebDriver createChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        String downloadDirectory = System.getProperty("user.dir");
        options.addArguments("download.default_directory=" + downloadDirectory);

        return new ChromeDriver(options);
    }
    private WebDriver driver;
    private LoginPage loginPage;
    private GaragePage garagePage;

    @Before
    public void setUp() {
        driver = createChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        loginPage = new LoginPage(driver);
        garagePage = new GaragePage(driver);
    }
    @Test
    public void testFileDownload() throws IOException {
        loginPage.clickGuestLogin();
        Assert.assertEquals("Incorrect URL after login", "https://guest:welcome2qauto@qauto.forstudy.space/panel/garage", driver.getCurrentUrl());

        garagePage.goToInstructions();

        garagePage.saveAvailableCarsToTxt();

        File file = new File("cars_list.txt");
        Assert.assertTrue("File not created", file.exists());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
