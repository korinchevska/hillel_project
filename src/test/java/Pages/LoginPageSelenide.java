package Pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class LoginPageSelenide {
    public void clickGuestLogin() {
        $("button.header-link.-guest").shouldBe(visible).click();
    }
}
