package api_controllers.AuthController;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;

public class SignUp {

    public void signUp(String username, String password, String confirmPassword) throws IOException {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("username", username);
        jsonObject.put("password", password);
        jsonObject.put("confirmPassword", confirmPassword);

        RequestBody body = RequestBody.create(jsonObject.toString().getBytes());

        Request request = new Request.Builder()
                .post(body)
                .url("https://freelance.lsrv.in.ua/api/auth/signup")
                .addHeader("Content-Type", "application/json")
                .build();

        Response response = new OkHttpClient().newCall(request).execute();

        System.out.println(response.code());
        String responseBody = response.body().string();

    }



}
