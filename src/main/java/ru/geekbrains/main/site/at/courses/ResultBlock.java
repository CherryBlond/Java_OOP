package ru.geekbrains.main.site.at.courses;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultBlock {
    @FindBy(xpath = "//div[@id='courses-tab']//div[@class='gb-course-card js-course-card' and not(@hidden)]//span[text()='Тестирование ПО. Уровень 1']")
    private WebElement testLevelOneCard;

    @FindBy(xpath = "//div[@id='courses-tab']//div[@class='gb-course-card js-course-card' and not(@hidden)]//span[text()='Тестирование ПО. Уровень 2']")
    private WebElement testLevelTwoCard;

    @Step("Проверка отображения бесплатных курсов тестировщиков")
    public void checkFreeTestCards() {
        testLevelOneCard.isDisplayed();
        testLevelTwoCard.isDisplayed();
    }
}
