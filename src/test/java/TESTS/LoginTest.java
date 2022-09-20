package tests;

import PageObjects.LoginPage;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest {
    @Test

    public void LoginTest() throws IOException, InterruptedException {
        Configuration.baseUrl = "https://freelance.lsrv.in.ua";
        Configuration.holdBrowserOpen = true;

        open("/login");

        LoginPage loginPage = new LoginPage();

        //incorrect login(username)
        loginPage.setLogin("lerasfnksdfj")
                .setPassword("12345678")
                .clickLoginButton();

        TimeUnit.SECONDS.sleep(3);

        // correct login(username)


        loginPage.setLogin("lera26")
                .setPassword("12345678")
                .clickLoginButton();

    }
}
