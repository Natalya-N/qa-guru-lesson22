package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginDrawerComponent {

    private final static String LOGIN_BY_SBER_ID = "Войти по Сбер ID",
            LOGIN_BY_PHONE_NUMBER = "Войти по номеру телефона";

    private final SelenideElement drawer = $("div[class^='Drawer_content']"),
            loginByPhoneNumberButton = $x("//span[contains(text(),'Войти по номеру')]"),
            loginBySberId = $("div[class*='SberIdButton']"),
            closeButton = $("div[class*='Drawer_closeButton']");



    public void checkLoginDrawer() {
        drawer.shouldBe(visible);
        closeButton.shouldBe(visible);
        loginByPhoneNumberButton.shouldHave(text(LOGIN_BY_PHONE_NUMBER));
        loginBySberId.shouldHave(text(LOGIN_BY_SBER_ID));

    }

    public void closeLoginDrawer() {
        closeButton.click();
        drawer.shouldNotBe(visible);

    }
}
