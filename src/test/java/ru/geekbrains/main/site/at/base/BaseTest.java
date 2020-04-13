package ru.geekbrains.main.site.at.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected ChromeDriver chromeDriver;

    @BeforeEach
    public void setUp() {
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterEach
    public void tearDown() {
        chromeDriver.quit();
    }


    protected void checkHeader() {
        // хидер
        chromeDriver.findElement(By.cssSelector(".gb-header"));
        // Поиск
        chromeDriver.findElement(By.cssSelector(".gb-top-menu__item .show-search-form"));

        WebElement login = chromeDriver.findElement(By.cssSelector(".gb-top-menu__item a[href=\"/login\"]"));
        Assertions.assertEquals("Вход", login.getText().trim());

        WebElement register = chromeDriver.findElement(By.cssSelector(".gb-top-menu__item a[href=\"/register\"]"));
        Assertions.assertEquals("Регистрация", register.getText().trim());
    }

    protected void checkFooter() {
        // футер
        chromeDriver.findElement(By.cssSelector(".site-footer"));

        WebElement feedbacks = chromeDriver.findElement(By.cssSelector(".site-footer__links a[href=\"/feedbacks\"]"));
        Assertions.assertEquals("Отзывы", feedbacks.getText().trim());

        WebElement company = chromeDriver.findElement(By.cssSelector(".site-footer__links a[href=\"/company\"]"));
        Assertions.assertEquals("О проекте", company.getText().trim());

        WebElement career = chromeDriver.findElement(By.cssSelector(".site-footer__links a[href=\"/career/682\"]"));
        Assertions.assertEquals("Вакансии", career.getText().trim());

        WebElement phone = chromeDriver.findElement(By.cssSelector(".site-footer__phone"));
        Assertions.assertEquals("8 800 700-68-41", phone.getText().trim());
    }
}
