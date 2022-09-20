package api_tests;

import api_controllers.AuthController.SignIn;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignInTest {

    @Test
    public void signIn() throws IOException {
        SignIn authController = new SignIn();
        authController.signIn("lera26","12345678");
    }
}
