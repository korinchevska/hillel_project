package Pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class GaragePage {
    private WebDriver driver;
    private  WebElement instructionsMenu;
    public GaragePage(WebDriver driver) {
        this.driver = driver;
    }
    private final By addCarButton = By.xpath("//app-garage//button");
    private final By brandDropdown = By.xpath("//*[@id=\"addCarBrand\"]");
    private final By modelDropdown = By.xpath("//*[@id=\"addCarModel\"]");
    private final By mileageInput = By.xpath("//*[@id=\"addCarMileage\"]");
    private final By addButton = By.xpath("//app-add-car-modal//button[text()='Add']");
    //private final By addInstructionButton = By.xpath("//a[@routerlink='instructions']");

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
    private WebElement getInstructionsMenu() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@routerlink='instructions']")));
    }
    public void goToInstructions() {
        instructionsMenu = getInstructionsMenu();
        instructionsMenu.click();
    }
    public void downloadFile() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement fileLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//p[contains(@class, 'instruction-link_description') and contains(text(), 'Front windshield wipers on Audi TT')]/following-sibling::a[@class='instruction-link_download']")
        ));

        fileLink.click();
    }
    public void saveAvailableCarsToTxt() throws IOException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement dropdownButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("brandSelectDropdown")));
        dropdownButton.click();

        List<WebElement> carOptions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".brand-select-dropdown_menu .dropdown-item")));

        BufferedWriter writer = new BufferedWriter(new FileWriter("cars_list.txt"));

        for (WebElement car : carOptions) {
            if (!car.getAttribute("class").contains("disabled")) {
                writer.write(car.getText());
                writer.newLine();
            }
        }

        writer.close();
    }
    public void verifyAddedCarData(SoftAssert softAssert) {
        softAssert.assertEquals(getCarTitle(), "Audi TT", "The name of the car is wrong");
        softAssert.assertTrue(getMileageDate().contains(getTodayDateFormatted()), "Mileage date is not current");
        softAssert.assertEquals(getMileageValue(), "20", "Mileage is incorrect");
        softAssert.assertTrue(isCarImageVisible(), "Car image is not visible");
        softAssert.assertTrue(getImageSrc().endsWith("audi.png"), "Image not audi.png");
    }
}
