package HW24;

import Pages.GaragePage;
import Pages.LoginPage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class DownloadFile {
    public static WebDriver createChromeDriver() {
        ChromeOptions options = new ChromeOptions();
        String downloadDirectory = "C:\\Users\\okorynchevska\\Downloads";  // Путь к папке для скачивания
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
    public void testFileDownload() throws InterruptedException {
        loginPage.clickGuestLogin();
        Assert.assertEquals("Incorrect URL after login", "https://guest:welcome2qauto@qauto.forstudy.space/panel/garage", driver.getCurrentUrl());
        garagePage.goToInstructions();
        garagePage.downloadFile();
        Thread.sleep(5000);
        File downloadedFile = new File("C:\\Users\\okorynchevska\\Downloads");
        Assert.assertTrue("File not downloaded", downloadedFile.exists());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
