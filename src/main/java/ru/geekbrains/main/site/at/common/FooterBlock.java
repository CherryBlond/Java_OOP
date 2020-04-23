package ru.geekbrains.main.site.at.common;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToCompressingWhiteSpace;

public class FooterBlock {
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

    @Step("Проверка отображения элементов футера")
    public void checkElements() {
        footerBlock.isDisplayed();
        assertThat(footerFeedbacksLink.getText(), equalToCompressingWhiteSpace("Отзывы"));
        assertThat(footerCompanyLink.getText(), equalToCompressingWhiteSpace("О проекте"));
        assertThat(footerCareerLink.getText(), equalToCompressingWhiteSpace("Вакансии"));
        assertThat(footerPhoneNumber.getText(), equalToCompressingWhiteSpace("8 800 700-68-41"));
    }
}
