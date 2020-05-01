package ru.geekbrains.main.site.at;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.HomePage;
import ru.geekbrains.main.site.at.LoginPage;
import ru.geekbrains.main.site.at.base.BaseTest;

public class AuthorizationTest extends BaseTest {
    @Test
    @Description(value = "Авторизация на сайте")
    public void testAuth() {
        chromeDriver.get("https://geekbrains.ru/login");

        HomePage homePage = PageFactory.initElements(chromeDriver, LoginPage.class)
            .login("hao17583@bcaoo.com", "hao17583");

        homePage.getNavigationBlock().checkActiveMenuElementName("");
        homePage.getHeaderBlock().checkHeaderTitle("Главная");
    }
}
