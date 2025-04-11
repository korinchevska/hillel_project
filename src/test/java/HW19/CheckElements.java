package HW19;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        try {
            WebElement logo = driver.findElement(By.cssSelector(".header_left a > svg"));
            assert logo.isDisplayed() : "Logo is NOT displayed!";
            System.out.println("Logo displayed");

            WebElement signUpButton = driver.findElement(By.xpath("//button[@class='btn btn-outline-white header_signin']"));
            String backgroundColor = signUpButton.getCssValue("background-color");
            String expectedColor = "rgba(2, 117, 216, 1)";
            assert backgroundColor.equals(expectedColor) : "Background color of Sign up button is incorrect. Actual: " + backgroundColor;
            System.out.println("Background color of Sign up button is correct");

        } catch (AssertionError | Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            driver.quit();

        }
    }
    }

