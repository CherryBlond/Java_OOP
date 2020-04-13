package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import ru.geekbrains.main.site.at.base.BaseTest;


public class NavigationTest extends BaseTest {
    //Курсы
    @Test
    public void checkCourses() {
        chromeDriver.get("https://geekbrains.ru/career");

        chromeDriver.findElement(By.cssSelector(".gb-left-menu a[href=\"/courses\"]")).click();

        String coursesHeader = chromeDriver.findElement(By.cssSelector(".gb-header__title")).getText().trim();
        Assertions.assertEquals("Курсы", coursesHeader);

        checkHeader();
        checkFooter();
    }
    //Вебинары
    @Test
    public void checkEvents() {
        chromeDriver.get("https://geekbrains.ru/career");

        chromeDriver.findElement(By.cssSelector(".gb-left-menu a[href=\"/events\"]")).click();

        String eventsHeader = chromeDriver.findElement(By.cssSelector(".gb-header__title")).getText().trim();
        Assertions.assertEquals("Вебинары", eventsHeader);

        checkHeader();
        checkFooter();
    }
    //Форум
    @Test
    public void checkTopics() {
        chromeDriver.get("https://geekbrains.ru/career");

        chromeDriver.findElement(By.cssSelector(".gb-left-menu a[href=\"/topics\"]")).click();

        String topicsHeader = chromeDriver.findElement(By.cssSelector(".gb-header__title")).getText().trim();
        Assertions.assertEquals("Форум", topicsHeader);

        checkHeader();
        checkFooter();
    }
    //Блог
    @Test
    public void checkPosts() {
        chromeDriver.get("https://geekbrains.ru/career");

        chromeDriver.findElement(By.cssSelector(".gb-left-menu a[href=\"/posts\"]")).click();

        String postsHeader = chromeDriver.findElement(By.cssSelector(".gb-header__title")).getText().trim();
        Assertions.assertEquals("Блог", postsHeader);

        checkHeader();
        checkFooter();
    }
    //Тесты
    @Test
    public void checkTests() {
        chromeDriver.get("https://geekbrains.ru/career");

        chromeDriver.findElement(By.cssSelector(".gb-left-menu a[href=\"/tests\"]")).click();

        String testsHeader = chromeDriver.findElement(By.cssSelector(".gb-header__title")).getText().trim();
        Assertions.assertEquals("Тесты", testsHeader);

        checkHeader();
        checkFooter();
    }
    //Карьера
    @Test
    public void checkCareer() {
        chromeDriver.get("https://geekbrains.ru/tests");

        chromeDriver.findElement(By.cssSelector(".gb-left-menu a[href=\"/career\"]")).click();

        String careerHeader = chromeDriver.findElement(By.cssSelector(".gb-header__title")).getText().trim();
        Assertions.assertEquals("Карьера", careerHeader);

        checkHeader();
        checkFooter();
    }
}
