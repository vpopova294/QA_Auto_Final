package api_tests;

import api_controllers.UserController.UserController;
import org.testng.annotations.Test;

import java.io.IOException;

public class UserControllerTest {
    @Test
    public void userControllerTests() throws IOException {
        UserController userController = new UserController();
        userController.postUserUpdate("qa engineer", "qa", "auto", "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIyMiIsIm5hbWUiOm51bGwsImlkIjoiMjIiLCJ1c2VybmFtZSI6ImxlcmEyNiIsImxhc3RuYW1lIjpudWxsLCJpYXQiOjE2NjM1ODU1NTAsImV4cCI6MTY2MzU4OTE1MH0.QRNt47NMFWSfc9qq9GTuUZT6Yy6WK0XysV5R0MI6Hx-vtYdlWsjFbxZkJtoi6IZQWs3LIDcVirkocC1Hfye-wQ");

        userController.getUser();

        userController.getUserById("1");


    }

}
