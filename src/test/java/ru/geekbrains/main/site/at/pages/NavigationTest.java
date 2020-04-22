package ru.geekbrains.main.site.at.pages;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.Page;
import ru.geekbrains.main.site.at.pages.base.BaseTest;

import java.util.stream.Stream;

@DisplayName("Проверка блока навигации")

public class NavigationTest extends BaseTest {
    public static Stream<String> stringProvider () {
        return Stream.of("Курсы", "Карьера", "Вебинары", "Форум", "Блог", "Тесты");
    }

    @DisplayName("Проверка загрузки страницы после нажатия в навигации")
    @ParameterizedTest(name = "проверка: {0}")
    @MethodSource("stringProvider")
    void checkNavigation(String namePage) {
        chromeDriver.get("https://geekbrains.ru/career");

        PageFactory.initElements(chromeDriver, Page.class)
            .getNavigation().clickButton(namePage)
            .checkHeaderTitle(namePage)
            .checkHeader()
            .checkFooter();
    }
}
