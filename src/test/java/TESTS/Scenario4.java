package tests;

import PageObjects.LoginPage;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;

public class Scenario4 {

    //removing the job
    @Test
    public void Scenario4Test() throws IOException, InterruptedException {
        Configuration.baseUrl = "https://freelance.lsrv.in.ua";
        Configuration.holdBrowserOpen = false;

        open("/login");
        LoginPage page = new LoginPage();

        page.setLogin("lera26")
                .setPassword("12345678")
                .clickLoginButton()
                .clickProfileButton()
                .chooseCard()
                .clickRemoveJobButton();

        Alert alert = switchTo().alert();
        alert.accept();


    }
}
