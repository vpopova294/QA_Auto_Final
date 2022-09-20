package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


public class RegisterPage {

    private final SelenideElement usernameInput = $("#mat-input-0");
    private final SelenideElement nameInput = $("#mat-input-1");
    private final SelenideElement lastNameInput = $("#mat-input-2");
    private final SelenideElement passwordInput = $("#mat-input-3");
    private final SelenideElement confirmPasswordInput = $("#mat-input-4");

    private final SelenideElement registerButton = $("#controls > button");


    public RegisterPage setUsername(String username) {

        usernameInput.shouldBe(Condition.visible)
                .shouldBe(Condition.interactable)
                .sendKeys(username);
        return this;
    }

    public RegisterPage setName(String name) {

        nameInput.shouldBe(Condition.visible)
                .sendKeys(name);
        return this;
    }

    public RegisterPage setLastName(String lastname) {

        lastNameInput.shouldBe(Condition.visible)
                .sendKeys(lastname);
        return this;
    }

    public RegisterPage setPassword(String password) {

        passwordInput.shouldBe(Condition.visible)
                .sendKeys(password);
        return this;
    }

    public RegisterPage confirmPassword(String confirmPassword) {

        confirmPasswordInput.shouldBe(Condition.visible)
                .sendKeys(confirmPassword);
        return this;
    }


    public LoginPage clickRegisterButton() {

         registerButton.shouldBe(Condition.visible)
               .click();
            return new LoginPage();
        }

    }

