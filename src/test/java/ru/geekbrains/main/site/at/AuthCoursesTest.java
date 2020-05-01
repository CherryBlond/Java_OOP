package ru.geekbrains.main.site.at;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.CoursesPage;
import ru.geekbrains.main.site.at.HomePage;
import ru.geekbrains.main.site.at.LoginPage;
import ru.geekbrains.main.site.at.base.BaseTest;

public class AuthCoursesTest extends BaseTest {
    @Test
    @Description(value = "Проверка отображения бесплатных курсов тестировщиков после авторизации на сайте")
    public void checkCourses() {
        chromeDriver.get("https://geekbrains.ru/login");

        HomePage homePage = PageFactory.initElements(chromeDriver, LoginPage.class)
            .login("hao17583@bcaoo.com", "hao17583");

        homePage.getNavigationBlock().checkActiveMenuElementName("");
        homePage.getHeaderBlock().checkHeaderTitle("Главная");
        homePage.getNavigationBlock().clickButton("Курсы");

        CoursesPage coursesPage = PageFactory.initElements(chromeDriver, CoursesPage.class);
        coursesPage.getHeaderTabsBlock().selectTab("Курсы");
        coursesPage.getFilterBlock().selectFilter("Бесплатные");
        coursesPage.getFilterBlock().selectFilter("Тестирование");
        coursesPage.getResultBlock().checkFreeTestCards();
    }
}
