import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

@Tag("simple")
public class SamokatTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Tag("smoke")
    @DisplayName("Проверить элементы в хедере страницы")
    @Test
    void checkHeaderComponentTest() {
        step("Открыть главную страницу", () -> {
            mainPage.openPage();
        });
        step("Проверить, что в хедере отображаются: иконка Самоката, меню поиска, " +
                "кнопка логина и кнопка открытия чата с поддержкой ", () -> {
            mainPage.checkHeaderMenu();
        });
    }

    @Tag("smoke")
    @DisplayName("Проверить элементы в боковом меню страницы")
    @Test
    void checkSideMenuComponentTest() {
        step("Открыть главную страницу", () -> {
            mainPage.openPage();
        });
        step("Проверить, что в боковом меню отображается список разделов с продуктами", () -> {
            mainPage.checkSideMenu();
        });
    }

    @Tag("smoke")
    @DisplayName("Проверить основные разделы страницы")
    @Test
    void checkMainChaptersTest() {
        step("Открыть главную страницу", () -> {
            mainPage.openPage();
        });
        step("Проверить, что в теле главной страницы отображаются разделы сайта", () -> {
            mainPage.checkMainChapters();
        });
    }

    @Tag("smoke")
    @DisplayName("Проверить элементы в футере страницы")
    @Test
    void checkFooterComponentTest() {
        step("Открыть главную страницу", () -> {
            mainPage.openPage();
        });
        step("Проверить, что отображаются иконки соц сетей", () -> {
            mainPage.checkSocialIcons();
        });
        step("Проверить, что отображаются иконки магазинов приложений", () -> {
            mainPage.checkStoreIcons();
        });
    }

    @ValueSource(strings = {
            "Хлеб",
            "Молоко",
            "Сыр"
    })
    @ParameterizedTest(name = "Для поискового запроса {0} должен возвращаться не пустой список найденных продуктов")
    @Tag("simple")
    void searchForProductTest(String query) {
        step("Открыть главную страницу", () -> {
            mainPage.openPage();
        });
        step("Выполнить поиск по продукту", () -> {
            mainPage.searchForProduct(query);
        });
    }

    @Tag("simple")
    @DisplayName("Открыть \"Войти\" и проверить способы залогиниться")
    @Test
    void checkSignInDrawerTest() {
        step("Открыть главную страницу", () -> {
            mainPage.openPage();
        });
        step("Открыть дровер и проверить, что отображаются элементы для логина", () -> {
            mainPage.openLoginDrawer();
        });
        step("Закрыть дровер", () -> {
            mainPage.closeLoginDrawer();
        });
    }

}
