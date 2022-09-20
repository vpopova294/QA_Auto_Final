package tests;

import PageObjects.LoginPage;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class Scenario3 {

    //leaving a comment to the job
    @Test
    public void Scenario3Test() throws IOException, InterruptedException {
        Configuration.baseUrl = "https://freelance.lsrv.in.ua";
        Configuration.holdBrowserOpen = false;

        open("/login");
        LoginPage page = new LoginPage();

        page.setLogin("lera26")
                .setPassword("12345678")
                .clickLoginButton()
                .clickViewInfoButton()
                .setTextArea("some details")
                .clickLeaveCommentButton()
                .clickCloseJobDetailsButton();


    }
}
