package HW17;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class OpenBrowserTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        Thread.sleep(2000);

        WebElement getLoginButton = driver.findElement(By.xpath("//button[normalize-space()='Guest log in']"));
        getLoginButton.click();
        Thread.sleep(5000);

        List<WebElement> menuItems = driver.findElements(By.cssSelector(".sidebar-wrapper a.btn-white"));

        for (WebElement item : menuItems) {
            System.out.println(item.getText());
        }
        Thread.sleep(3000);
        driver.quit();
    }

}