package ru.geekbrains.main.site.at.common;

import io.qameta.allure.Step;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.CommonPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToCompressingWhiteSpace;

public class NavigationBlock {
    private WebDriver driver;

    public NavigationBlock(WebDriver driver) {
        this.driver=driver;
    }

    @FindBy(css = "#nav .gb-left-menu__current")
    private WebElement activeMenuElement;

    @FindBy(css = "[class*=\"main-page-hidden\"] [href=\"/courses\"]")
    private WebElement buttonCourses;

    @FindBy(css = "[class*=\"main-page-hidden\"] [href=\"/events\"]")
    private WebElement buttonEvents;

    @FindBy(css = "[class*=\"main-page-hidden\"] [href=\"/topics\"]")
    private WebElement buttonTopics;

    @FindBy(css = "[class*=\"main-page-hidden\"] [href=\"/posts\"]")
    private WebElement buttonPosts;

    @FindBy(css = "[class*=\"main-page-hidden\"] [href=\"/tests\"]")
    private WebElement buttonTests;

    @FindBy(css = "[class*=\"main-page-hidden\"] [href=\"/career\"]")
    private WebElement buttonCareer;

    @Step("Проверка активного элемента навигации по имени: {elementName}")
    public void checkActiveMenuElementName(String elementName) {
        assertThat(activeMenuElement.getText(), equalToCompressingWhiteSpace(elementName));
    }

    @Step("Нажатие в навигации на элемент: {nameButton}")
    public CommonPage clickButton(String nameButton) {
        switch (nameButton) {
            case "Курсы": {
                buttonCourses.click();
            break;
            }
            case "Вебинары": {
                buttonEvents.click();
                break;
            }

            case "Форум": {
                buttonTopics.click();
                break;
            }

            case "Блог": {
                buttonPosts.click();
                break;
            }

            case "Тесты": {
                buttonTests.click();
                break;
            }

            case "Карьера": {
                buttonCareer.click();
                break;
            }

            default: {
                throw new NotFoundException ("Элемент " + nameButton + "не используется в методе  ");
            }
        }

        return PageFactory.initElements(driver, CommonPage.class);
    }
}



