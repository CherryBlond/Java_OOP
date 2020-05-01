package ru.geekbrains.main.site.at;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonPage {
    private WebDriver driver;

    @FindBy(css = "#user_email")
    private WebElement loginInput;

    @FindBy(css = "#user_password")
    private WebElement passwordInput;

    @FindBy(css = "#new_user [type=\"submit\"]")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Step("Авторизация пользователя {login}")
    public HomePage login(String login, String password) {
        loginInput.sendKeys(login);
        passwordInput.sendKeys(password);
        loginButton.click();
        return PageFactory.initElements(driver, HomePage.class);
    }
}
