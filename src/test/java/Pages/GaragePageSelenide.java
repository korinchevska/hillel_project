package Pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GaragePageSelenide {
    public void clickAddCar() {
        $("button.btn.btn-primary").shouldBe(visible).click();
    }

    public void fillCarForm(String brand, String model, int mileage) {
        $("#addCarBrand").selectOption(brand);
        $("#addCarModel").selectOption(model);
        $("#addCarMileage").setValue(String.valueOf(mileage));
    }

    public void clickAddButton() {
        $("div.modal-footer.d-flex.justify-content-end > button.btn.btn-primary").shouldBe(enabled).click();
    }

    public void verifyCarData() {
        $(".car_name").shouldHave(text("Audi TT"));
        $("p.car_update-mileage").shouldHave(text(getTodayDate()));
        $("app-update-mileage-form form > input").shouldHave(value("20"));
        $("div.car_logo img").shouldBe(visible)
                .shouldHave(attributeMatching("src", ".*audi\\.png$"));
    }

    private String getTodayDate() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}
