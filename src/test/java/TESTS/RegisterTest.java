package TESTS;

import PageObjects.RegisterPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class RegisterTest {
    @Test
    public void RegisterTest() throws IOException, InterruptedException {
        Configuration.baseUrl = "https://freelance.lsrv.in.ua";
        //Configuration.holdBrowserOpen = true;

        open("/register");

        RegisterPage registerPage = new RegisterPage();


        //correct username
        registerPage.setUsername("lera26")
                .setName("valeriia")
                .setLastName("popova")
                .setPassword("12345678")
                .confirmPassword("12345678")
                .clickRegisterButton();

        TimeUnit.SECONDS.sleep(3);

//        SelenideElement text = $(By.cssSelector("#controls > button > span.mat-button-focus-overlay"));
//        Assert.assertTrue(text.getText().equals("Registered successfully!"));
    }
}
