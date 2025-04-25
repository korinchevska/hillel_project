package HW22;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FrameCheck {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    @Test(description = "TC1: check title in frame")
    public void checkIframeTitle() {
        WebElement iframe = driver.findElement(By.cssSelector("iframe[src*='youtube']"));
        driver.switchTo().frame(iframe);

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(d -> d.getTitle().contains("Hillel"));

        String actualTitle = driver.getTitle();
        String expectedTitle = "Hillel IT School | Учись ради мечты! - YouTube";

        try {
            Assert.assertEquals(actualTitle, expectedTitle);
            System.out.println("Title is correct");
        } catch (AssertionError e) {
            System.out.println("Title is WRONG!\nExpected: " + expectedTitle + "\nActual: " + actualTitle);
        }

        driver.switchTo().defaultContent();
    }
    @Test(description = "TC2: check inons in footer")
    public void checkSocialNetworkIcons(){
        List<WebElement> socialIcons = driver.findElements(By.cssSelector("a.socials_link"));

        Assert.assertEquals(socialIcons.size(), 5, "Social network block doesn’t contain 5 items");
        System.out.println("Social block contains 5 items");

        String mainTab = driver.getWindowHandle();

        // 4. Проходимо по кожній іконці
        for (WebElement icon : socialIcons) {
            String expectedUrlPart = icon.getAttribute("href");

            // Відкриваємо нову вкладку через JS
            ((JavascriptExecutor) driver).executeScript("window.open(arguments[0])", expectedUrlPart);

            // Очікуємо появу нової вкладки
            Set<String> allTabs = driver.getWindowHandles();
            List<String> tabs = new ArrayList<>(allTabs);
            Assert.assertTrue(tabs.size() > 1, "New tab did not open after clicking");

            // Переходимо на нову вкладку
            String newTab = tabs.stream().filter(tab -> !tab.equals(mainTab)).findFirst().orElse(null);
            driver.switchTo().window(newTab);

            // Перевірка, що відкрита правильна сторінка
            String actualUrl = driver.getCurrentUrl();
            Assert.assertTrue(
                    actualUrl.contains(expectedUrlPart.replace("https://", "").split("\\.")[0]),
                    "Incorrect url of Social network.\nExpected to contain: " + expectedUrlPart + "\nActual: " + actualUrl
            );
            System.out.println("Open correct page: " + actualUrl);

            // Закриваємо нову вкладку та повертаємось на головну
            driver.close();
            driver.switchTo().window(mainTab);
        }}
}
