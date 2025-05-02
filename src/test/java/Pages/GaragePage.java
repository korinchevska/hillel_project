package Pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GaragePage {
    public GaragePage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;
    private final By addCarButton = By.xpath("//app-garage//button");
    private final By brandDropdown = By.xpath("//*[@id=\"addCarBrand\"]");
    private final By modelDropdown = By.xpath("//*[@id=\"addCarModel\"]");
    private final By mileageInput = By.xpath("//*[@id=\"addCarMileage\"]");
    private final By addButton = By.xpath("//app-add-car-modal//button[text()='Add']");

    private final By carTitle = By.cssSelector("div.car-group > p");
    private final By mileageParagraph = By.cssSelector("p.car_update-mileage");
   private final By mileageField = By.xpath("//app-update-mileage-form//input");
    private final By carImage = By.cssSelector("div.car_logo img");
    public void clickAddCar() {
        driver.findElement(addCarButton).click();
    }
    public void fillCarData(String brand, String model, int mileage) {
        new Select(driver.findElement(brandDropdown)).selectByVisibleText(brand);
        new Select(driver.findElement(modelDropdown)).selectByVisibleText(model);
        driver.findElement(mileageInput).sendKeys(String.valueOf(mileage));
    }
    public void clickAddButton() {
        driver.findElement(addButton).click();
    }
    public String getCarTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".car_name")));
        return driver.findElement(By.cssSelector(".car_name")).getText();
    }

    public String getMileageDate() {
        return driver.findElement(mileageParagraph).getText();
    }

    public String getMileageValue() {
        return driver.findElement(mileageField).getAttribute("value");
    }

    public boolean isCarImageVisible() {
        return driver.findElement(carImage).isDisplayed();
    }

    public String getImageSrc() {
        return driver.findElement(carImage).getAttribute("src");
    }

    public String getTodayDateFormatted() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }


}
