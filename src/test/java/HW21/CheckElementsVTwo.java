package HW21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CheckElementsVTwo {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    @Test(description = "Test case 1: Checking the display of the logo")
    public void testLogoDisplayed() {
        WebElement logo = driver.findElement(By.cssSelector(".header_left a > svg"));
        boolean isDisplayed = logo.isDisplayed();

        Assert.assertTrue(isDisplayed, "Logo does not displayed");
        System.out.println("Logo is displayed");
    }

    @Test(description = "Test case 2: Checking the background colour of the “Sign up” button")
    public void testSignUpButtonColor() {
        WebElement signUpButton = driver.findElement(By.xpath("//button[text()='Sign up']"));
        String actualColor = signUpButton.getCssValue("background-color");

        // rgba(2, 117, 216, 1) — це #0275d8
        String expectedColor = "rgba(2, 117, 216, 1)";

        Assert.assertEquals(actualColor, expectedColor, "Background color of Sign up button is incorrect");
        System.out.println("Background color of Sign up button is correct");
    }
}
