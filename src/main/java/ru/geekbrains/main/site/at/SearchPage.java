package ru.geekbrains.main.site.at;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
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

    public SearchPage(WebDriver driver) {
        waiter = new WebDriverWait(driver, 60);
    }

    public void searchPhrase(String phrase) {
        searchButton.click();
        searchBox.sendKeys(phrase);
        waiter.until(ExpectedConditions.visibilityOfElementLocated(projectsHeaderSelector));
    }

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

    public int getSearchBlockCount(String block) {
        String count;
        switch (block) {
            case "professions":
                count = professionsCount.getText().trim();
                break;

            case "courses":
                count = coursesCount.getText().trim();
                break;

            case "webinars":
                count = webinarsCount.getText().trim();
                break;

            case "blogs":
                count = blogsCount.getText().trim();
                break;
            case "forums":
                count = forumsCount.getText().trim();
                break;

            case "tests":
                count = testsCount.getText().trim();
                break;

            default:
                throw new NotFoundException("Элемент " + block + "не используется в методе");

        }
        return Integer.parseInt(count);
    }
}



