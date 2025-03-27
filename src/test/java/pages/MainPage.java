package pages;

import pages.components.*;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    HeaderMenuComponent headerMenuComponent = new HeaderMenuComponent();
    SideMenuComponent sideMenuComponent = new SideMenuComponent();
    LoginDrawerComponent loginDrawerComponent = new LoginDrawerComponent();
    ChaptersComponent chaptersComponent = new ChaptersComponent();
    FooterMenuComponent footerMenuComponent = new FooterMenuComponent();

    public MainPage openPage() {
        open("/");
        return this;
    }

    public MainPage checkHeaderMenu() {
        headerMenuComponent.checkHeaderMenu();
        return this;
    }

    public MainPage checkSideMenu() {
        sideMenuComponent.checkSideMenu();
        return this;
    }

    public MainPage checkSocialIcons() {
        footerMenuComponent.checkSocialIcons();
        return this;
    }

    public MainPage checkStoreIcons() {
        footerMenuComponent.checkStoreIcons();
        return this;
    }

    public MainPage checkMainChapters() {
        chaptersComponent.checkMainChapters();
        return this;
    }

    public MainPage searchForProduct(String query) {
        headerMenuComponent.clickOnSearchMenu();
        headerMenuComponent.textSearchStringAndPressEnter(query);
        return this;
    }

    public MainPage openLoginDrawer() {
        headerMenuComponent.clickOnLoginMenu();
        loginDrawerComponent.checkLoginDrawer();
        return this;
    }

    public MainPage closeLoginDrawer() {
        loginDrawerComponent.closeLoginDrawer();
        return this;
    }

}
