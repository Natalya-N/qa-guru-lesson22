package pages.components;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

public class SideMenuComponent {

    private final ElementsCollection sideMenuComponents = $$("span[class*='CatalogTreeSectionCard_name']");
    private final List<String> elements = List.of("Собрали для вас", "От Самоката", "Готовая еда", "Овощи и фрукты",
            "Молоко, яйца и сыр", "Хлеб и выпечка", "Мясо и рыба", "Вода и напитки", "Сладкое", "Снеки", "Бакалея", "Морозилка",
            "ЗОЖ и вегетарианство", "Для детей", "Красота и здоровье", "Одежда, обувь и аксессуары",
            "Для животных", "Всё для дома", "Канцелярия, хобби и спорт", "Техника и электроника", "Для автомобиля");


    public void checkSideMenu() {
        sideMenuComponents.shouldHave(CollectionCondition.textsInAnyOrder(elements));
    }
}
