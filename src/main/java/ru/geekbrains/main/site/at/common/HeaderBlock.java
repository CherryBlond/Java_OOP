package ru.geekbrains.main.site.at.common;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToCompressingWhiteSpace;

public class HeaderBlock {
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

    @Step("Проверка заголовка страницы по имени: {expectedHeaderTitle}")
    public void checkHeaderTitle(String expectedHeaderTitle) {
        String actualHeaderTitle = headerPageTitle.getText();
        assertThat(actualHeaderTitle, equalToCompressingWhiteSpace(expectedHeaderTitle));
    }

    @Step("Проверка отображения элементов хедера")
    public void checkElements() {
        headerBlock.isDisplayed();
        headerSearchForm.isDisplayed();

        assertThat(headerLoginButton.getText(), equalToCompressingWhiteSpace("Вход"));
        assertThat(headerRegisterButton.getText(), equalToCompressingWhiteSpace("Регистрация"));
    }
}
