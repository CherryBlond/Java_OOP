package ru.geekbrains.main.site.at.pages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.geekbrains.main.site.at.pages.base.BaseTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SearchTest extends BaseTest {
    @Test
    void name() {
        chromeDriver.get("https://geekbrains.ru/career");

        chromeDriver.findElement(By.cssSelector("#top-menu .show-search-form")).click();

        WebElement inputSearch = chromeDriver.findElement(By.cssSelector("input[class=\"search-panel__search-field\"]"));
        inputSearch.sendKeys("java");

        WebDriverWait waitVisible = new WebDriverWait(chromeDriver, 60);
        waitVisible.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/h2[text()='Проекты и компании']")));

        chromeDriver.findElement(By.xpath("//header/h2[text()='Профессии']"));
        chromeDriver.findElement(By.xpath("//header/h2[text()='Курсы']"));
        chromeDriver.findElement(By.xpath("//header/h2[text()='Вебинары']"));
        chromeDriver.findElement(By.xpath("//header/h2[text()='Блоги']"));
        chromeDriver.findElement(By.xpath("//header/h2[text()='Форум']"));
        chromeDriver.findElement(By.xpath("//header/h2[text()='Тесты']"));
        chromeDriver.findElement(By.xpath("//header/h2[text()='Проекты и компании']"));
        chromeDriver.findElement(By.xpath("//div[@class=\"search-page-block\"]//div[@class=\"company-items\"]//a[text()='Образовательный портал GeekBrains']"));

        String professionsCount = chromeDriver.findElement(By.cssSelector(".search-page-block a[data-tab=\"professions\"] span")).getText().trim();
        assertThat(Integer.parseInt(professionsCount), greaterThanOrEqualTo(2));


        String coursesCount = chromeDriver.findElement(By.cssSelector(".search-page-block a[data-tab=\"courses\"] span")).getText().trim();
            assertThat(Integer.parseInt(coursesCount), greaterThan(15));


        String webinarsCount = chromeDriver.findElement(By.cssSelector(".search-page-block a[data-tab=\"webinars\"] span")).getText().trim();
        assertThat(Integer.parseInt(webinarsCount), greaterThan(180));
        assertThat(Integer.parseInt(webinarsCount), lessThan(300));


        String blogsCount = chromeDriver.findElement(By.cssSelector(".search-page-block a[data-tab=\"blogs\"] span")).getText().trim();
        assertThat(Integer.parseInt(blogsCount), greaterThan(300));


        String forumsCount = chromeDriver.findElement(By.cssSelector(".search-page-block a[data-tab=\"forums\"] span")).getText().trim();
        assertThat(Integer.parseInt(forumsCount), not(equalTo(350)));


        String testsCount = chromeDriver.findElement(By.cssSelector(".search-page-block a[data-tab=\"tests\"] span")).getText().trim();
        assertThat(Integer.parseInt(testsCount), not(equalTo(0)));

    }
}
