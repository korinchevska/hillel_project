package HW20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;

public class TryExecutor {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
            System.out.println("The page is open");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.titleIs("Hillel Qauto"));
            System.out.println("Checked - Title = 'Hillel Qauto'");

            WebElement guestLoginBtn = driver.findElement(By.xpath("//button[normalize-space()='Guest log in']"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", guestLoginBtn);
            System.out.println("Pressed 'Guest log in' via JavaScript");


            WebElement addCarButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add car']"))
            );
            System.out.println("The button 'Add car' is clickable");

            } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            } finally {
            driver.quit();
            System.out.println("Browser is closed");
        }
    }
}
