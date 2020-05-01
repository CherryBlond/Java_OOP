package ru.geekbrains.main.site.at.courses;

import io.qameta.allure.Step;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderTabsBlock {
    @FindBy(css = "#prof-link")
    private WebElement professionsLink;

    @FindBy(css = "#free-link")
    private WebElement freeLink;

    @FindBy(css = "#cour-link")
    private WebElement coursesLink;

    @Step("Нажатие в шапке сайта на заголовок по имени: {tab}")
    public void selectTab(String tab) {
        switch (tab) {
            case "Профессии":
                professionsLink.click();
                break;

            case "Бесплатные интенсивы":
                freeLink.click();
                break;

            case "Курсы":
                coursesLink.click();
                break;

            default:
                throw new NotFoundException("Элемент " + tab + "не используется в методе");
        }
    }
}
