package ui_tests;

import PageObjects.LoginPage;
import PageObjects.ProfilePage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Scenario2 {

    //creating a new job
    @Test
    public void Scenario2Test() throws IOException, InterruptedException {
        Configuration.baseUrl = "https://freelance.lsrv.in.ua";
        Configuration.holdBrowserOpen = false;

        open("/login");
        LoginPage page = new LoginPage();

        page.setLogin("lera26")
                .setPassword("12345678")
                .clickLoginButton()
                .clickProfileButton()
                .clickAddJobButton()
                .setTitle("AQA Engineer")
                .setDescription("updated job")
                .setPrice("1500")
                .clickCreateJobButton();

        ProfilePage profilePage = new ProfilePage();
        String title = profilePage.getCardTitle();


        Assert.assertTrue(title.equals("AQA Engineer"),"Passed");
    }

}
