package HW28;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class BaseTest {
    protected org.openqa.selenium.WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        String browser = System.getProperty("browser", "chrome"); // За замовчуванням Chrome
        driver = WebDriverPage.getDriver(browser);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
