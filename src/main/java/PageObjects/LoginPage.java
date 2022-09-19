package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends RegisterPage {

    private final SelenideElement loginInput = $("#mat-input-0");

    private final SelenideElement passwordInput = $("#mat-input-1");
    private final SelenideElement loginButton = $("#controls > button");
    private final SelenideElement registerLink = $("#controls > a");


    public LoginPage setLogin(String login) {

      loginInput.clear();
      loginInput.sendKeys(login);
      return new LoginPage();
    }

    public LoginPage setPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password );
        return this;
    }

    public MainPage clickLoginButton(){
        loginButton.click();
        return new MainPage();
    }

}
