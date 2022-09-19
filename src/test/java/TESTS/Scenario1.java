package tests;

import PageObjects.LoginPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Scenario1 {

    //changing user data

    @Test
    public void Scenario1Test() throws IOException, InterruptedException {
        Configuration.baseUrl = "https://freelance.lsrv.in.ua";
        Configuration.holdBrowserOpen = false;

        open("/login");

        LoginPage loginPage = new LoginPage();
        loginPage.setLogin("lera26")
                .setPassword("12345678")
                .clickLoginButton()
                .clickProfileButton()
                .clickEditInfoButton()
                .setNewName("qa")
                .setNewLastName("engineer")
                .clickUpdateButton();

        TimeUnit.SECONDS.sleep(3);

        SelenideElement text = $(By.xpath("//app-root/div/app-profile/div/div[2]/div[2]/h3"));
        Assert.assertTrue(text.getText().equals("new updated user"));

    }
}
