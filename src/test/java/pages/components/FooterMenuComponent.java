package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class FooterMenuComponent {

    private final SelenideElement tikTokIcon = $x("//a[@href=\"https://www.tiktok.com/@samokat_15min\"]"),
            vkIcon = $x("//a[@href=\"https://vk.com/samokat_15min\"]"),
            okIcon = $x("//a[@href=\"https://ok.ru/group/57902269595836\"]"),
            youTubeIcon = $x("//a[@href=\"https://www.youtube.com/channel/UCM7ZxT51jX1LfdjMJYqgI7w\"]"),
            appleStore = $("a[title*='Загрузите в App Store']"),
            googlePlay = $("a[title*='Доступно в Google Play']"),
            appGallery = $("a[title*='Откройте в App Gallery']"),
            ruStore = $("a[title*='Доступно в RuStore']");


    public void checkSocialIcons() {
        tikTokIcon.shouldBe(visible);
        vkIcon.shouldBe(visible);
        okIcon.shouldBe(visible);
        youTubeIcon.shouldBe(visible);
    }

    public void checkStoreIcons() {
        googlePlay.shouldBe(visible);
        appleStore.shouldBe(visible);
        appGallery.shouldBe(visible);
        ruStore.shouldBe(visible);
    }

}
