package api_tests;

import api_controllers.AuthController.SignIn;
import api_controllers.AuthController.SignUp;
import org.testng.annotations.Test;

import java.io.IOException;

public class SignUpTest {
    @Test
    public void signUp() throws IOException {
        SignUp signUp = new SignUp();
        signUp.signUp("lera05", "popova12345678","popova12345678");

    }
}
