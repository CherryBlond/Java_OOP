package ru.geekbrains.main.site.at;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToCompressingWhiteSpace;

public class Page {
    WebDriver driver;

    public Page(WebDriver driver) {
        this.navigation = PageFactory.initElements(driver, Navigation.class);
        this.searchPage = PageFactory.initElements(driver, SearchPage.class);
    }

    @FindBy(css = "[class=\"gb-header__title\"]")
    private WebElement headerPageTitle;

    @FindBy(css = "div button svg[class=\"svg-icon icon-popup-close-button \"]")
    private WebElement buttonClosedPopUp;

    @FindBy(css = ".gb-header")
    private WebElement headerBlock;

    @FindBy(css = ".gb-top-menu__item .show-search-form")
    private WebElement headerSearchForm;

    @FindBy(css = ".gb-top-menu__item a[href=\"/login\"]")
    private WebElement headerLoginButton;

    @FindBy(css = ".gb-top-menu__item a[href=\"/register\"]")
    private WebElement headerRegisterButton;

    @FindBy(css = ".site-footer")
    private WebElement footerBlock;

    @FindBy(css = ".site-footer__links a[href=\"/feedbacks\"]")
    private WebElement footerFeedbacksLink;

    @FindBy(css = ".site-footer__links a[href=\"/company\"]")
    private WebElement footerCompanyLink;

    @FindBy(css = ".site-footer__links a[href=\"/career/682\"]")
    private WebElement footerCareerLink;

    @FindBy(css = ".site-footer__phone")
    private WebElement footerPhoneNumber;

    private Navigation navigation;
    private SearchPage searchPage;

    public Navigation getNavigation() {
        return navigation;
    }

    public SearchPage getSearchPage() {
        return searchPage;
    }

    public Page checkHeaderTitle(String expectedHeaderTitle) {
        String actualHeaderTitle = headerPageTitle.getText();
        assertThat(actualHeaderTitle, equalToCompressingWhiteSpace(expectedHeaderTitle));
        return this;
    }

    public Page checkHeader() {
        headerBlock.isDisplayed();
        headerSearchForm.isDisplayed();

        assertThat(headerLoginButton.getText(), equalToCompressingWhiteSpace("Вход"));
        assertThat(headerRegisterButton.getText(), equalToCompressingWhiteSpace("Регистрация"));
        return this;
    }

    public Page checkFooter() {
        footerBlock.isDisplayed();
        assertThat(footerFeedbacksLink.getText(), equalToCompressingWhiteSpace("Отзывы"));
        assertThat(footerCompanyLink.getText(), equalToCompressingWhiteSpace("О проекте"));
        assertThat(footerCareerLink.getText(), equalToCompressingWhiteSpace("Вакансии"));
        assertThat(footerPhoneNumber.getText(), equalToCompressingWhiteSpace("8 800 700-68-41"));
        return this;
    }
}
