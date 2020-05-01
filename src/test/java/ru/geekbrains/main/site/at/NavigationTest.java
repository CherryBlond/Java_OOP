package ru.geekbrains.main.site.at;

import io.qameta.allure.Description;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.CommonPage;
import ru.geekbrains.main.site.at.base.BaseTest;

import java.util.stream.Stream;

public class NavigationTest extends BaseTest {
    private static Stream<String> stringProvider () {
        return Stream.of("Курсы", "Карьера", "Вебинары", "Форум", "Блог", "Тесты");
    }

    @ParameterizedTest(name = "проверка: {0}")
    @MethodSource("stringProvider")
    @Description(value = "Проверка загрузки страницы после нажатия в навигации")
    void checkNavigation(String namePage) {
        chromeDriver.get("https://geekbrains.ru/career");

        CommonPage page = PageFactory.initElements(chromeDriver, CommonPage.class)
            .getNavigationBlock()
            .clickButton(namePage);

        page.getHeaderBlock().checkHeaderTitle(namePage);
        page.getHeaderBlock().checkElements();
        page.getFooterBlock().checkElements();
    }
}
