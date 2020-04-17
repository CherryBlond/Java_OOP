package ru.geekbrains.main.site.at.pages;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import ru.geekbrains.main.site.at.pages.base.BaseTest;

import java.util.stream.Stream;


public class NavigationTest extends BaseTest {

    @ParameterizedTest
    @MethodSource("navigationProvider")
    public void checkNavigation(String url, String buttonSelector, String expectedHeaderName) {
        chromeDriver.get(url);

        chromeDriver.findElement(By.cssSelector(buttonSelector)).click();

        String careerHeader = chromeDriver.findElement(By.cssSelector(".gb-header__title")).getText().trim();
        Assertions.assertEquals(expectedHeaderName, careerHeader);

        checkHeader();
        checkFooter();
    }

    private static Stream<Arguments> navigationProvider() {
        return Stream.of(
            Arguments.of("https://geekbrains.ru/career", ".gb-left-menu a[href=\"/courses\"]", "Курсы"),
            Arguments.of("https://geekbrains.ru/tests", ".gb-left-menu a[href=\"/career\"]", "Карьера"),
            Arguments.of("https://geekbrains.ru/career", ".gb-left-menu a[href=\"/events\"]", "Вебинары"),
            Arguments.of("https://geekbrains.ru/career", ".gb-left-menu a[href=\"/topics\"]", "Форум"),
            Arguments.of("https://geekbrains.ru/career", ".gb-left-menu a[href=\"/posts\"]", "Блог"),
            Arguments.of("https://geekbrains.ru/career", ".gb-left-menu a[href=\"/tests\"]", "Тесты")

        );
    }
}
