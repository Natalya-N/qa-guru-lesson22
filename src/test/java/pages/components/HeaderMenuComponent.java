package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class HeaderMenuComponent {

    private final SelenideElement samokatIcon = $("[src=\"https://samokat.ru/images/logo.svg\"]"),
            searchMenu = $("input[class^='SearchInput']"),
            searchMenuFocused = $("div[class*='SearchField_container_focused']"),
            signInButton = $("button[class*='ProfileButton']"),
            chatButton = $("div[class*='supportButton']");

    public void checkHeaderMenu() {
        samokatIcon.shouldBe(visible);
        searchMenu.shouldBe(visible);
        signInButton.shouldBe(visible);
        chatButton.shouldBe(visible);
    }

    public void clickOnSearchMenu() {
        searchMenu.click();
        searchMenuFocused.shouldBe(visible);
    }

    public void textSearchStringAndPressEnter(String query) {
        searchMenu.val(query).pressEnter();
        searchMenu.shouldHave(value(query));
    }

    public void clickOnLoginMenu() {
        signInButton.click();
    }
}
