package ru.geekbrains.main.site.at.common;

import io.qameta.allure.Step;
import org.hamcrest.Matcher;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;

public class SearchBlock {
    private WebDriverWait waiter;

    private By projectsHeaderSelector = By.xpath("//header/h2[text()='Проекты и компании']");

    @FindBy(css = "#top-menu .show-search-form")
    private WebElement searchButton;

    @FindBy(css = "input[class=\"search-panel__search-field\"]")
    private WebElement searchBox;

    @FindBy(xpath = "//header/h2[text()='Профессии']")
    private WebElement professionsHeader;

    @FindBy(xpath = "//header/h2[text()='Курсы']")
    private WebElement coursesHeader;

    @FindBy(xpath = "//header/h2[text()='Вебинары']")
    private WebElement webinarsHeader;

    @FindBy(xpath = "//header/h2[text()='Блоги']")
    private WebElement blogsHeader;

    @FindBy(xpath = "//header/h2[text()='Форум']")
    private WebElement forumsHeader;

    @FindBy(xpath = "//header/h2[text()='Тесты']")
    private WebElement testsHeader;

    @FindBy(xpath = "//header/h2[text()='Проекты и компании']")
    private WebElement projectsHeader;

    @FindBy(xpath = "//div[@class=\"search-page-block\"]//div[@class=\"company-items\"]//a[text()='Образовательный портал GeekBrains']")
    private WebElement geekbrainCompany;


    @FindBy(css = ".search-page-block a[data-tab=\"professions\"] span")
    private WebElement professionsCount;

    @FindBy(css = ".search-page-block a[data-tab=\"courses\"] span")
    private WebElement coursesCount;

    @FindBy(css = ".search-page-block a[data-tab=\"webinars\"] span")
    private WebElement webinarsCount;

    @FindBy(css = ".search-page-block a[data-tab=\"blogs\"] span")
    private WebElement blogsCount;

    @FindBy(css = ".search-page-block a[data-tab=\"forums\"] span")
    private WebElement forumsCount;

    @FindBy(css = ".search-page-block a[data-tab=\"tests\"] span")
    private WebElement testsCount;

    public SearchBlock(WebDriver driver) {
        waiter = new WebDriverWait(driver, 60);
    }

    public void searchPhrase(String phrase) {
        searchButton.click();
        searchBox.sendKeys(phrase);
        waiter.until(ExpectedConditions.visibilityOfElementLocated(projectsHeaderSelector));
    }
//    @Description(value = "Проверка отображения блоков по имени: {block}")

    public void checkSearchResultBlocks() {
        professionsHeader.isDisplayed();
        coursesHeader.isDisplayed();
        webinarsHeader.isDisplayed();
        blogsHeader.isDisplayed();
        forumsHeader.isDisplayed();
        testsHeader.isDisplayed();
        projectsHeader.isDisplayed();
        geekbrainCompany.isDisplayed();
    }

    @Step(value = "Получение количества позиций в блоке: {block}")
    public void checkSearchBlockCount(String block, Matcher matcher) {
        String count;
        switch (block) {
            case "Профессии":
                count = professionsCount.getText().trim();
                break;

            case "Курсы":
                count = coursesCount.getText().trim();
                break;

            case "Вебинары":
                count = webinarsCount.getText().trim();
                break;

            case "Блоги":
                count = blogsCount.getText().trim();
                break;

            case "Форум":
                count = forumsCount.getText().trim();
                break;

            case "Тесты":
                count = testsCount.getText().trim();
                break;

            default:
                throw new NotFoundException("Элемент " + block + "не используется в методе");
        }

        assertThat(Integer.parseInt(count), matcher);
    }
}



