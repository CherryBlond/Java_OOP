package ru.geekbrains.main.site.at.courses;

import io.qameta.allure.Step;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterBlock {
    @FindBy(css = "form.courses-filter input[value=\"free\"]")
    private WebElement freeCourses;

    @FindBy(css = "form.courses-filter input[value=\"tester\"]")
    private WebElement testerCourses;

    @Step("Выбор пункта фильтра по имени: {name}")
    public void selectFilter(String name) {
        switch (name) {
            case "Бесплатные":
                freeCourses.click();
                break;

            case "Тестирование":
                testerCourses.click();
                break;

            default:
                throw new NotFoundException("Элемент " + name + "не используется в методе");
        }
    }
}
