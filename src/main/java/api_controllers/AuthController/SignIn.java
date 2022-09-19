package api_controllers.AuthController;

import dev.failsafe.internal.util.Assert;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;

public class SignIn {

        public String signIn(String username, String password) throws IOException {

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("username", username);
            jsonObject.put("password", password);

            RequestBody body = RequestBody.create(jsonObject.toString().getBytes());

            Request request = new Request.Builder()
                    .post(body)
                    .url("https://freelance.lsrv.in.ua/api/auth/signin")
                    .addHeader("Content-Type","application/json")
                    .build();

            Response response = new OkHttpClient().newCall(request).execute();

            System.out.println(response.code());
            String responseBody = response.body().string();


            JSONObject responseJson = new JSONObject(responseBody);
            String token = String.valueOf(responseJson.get("token"));
            //System.out.println(responseJson.get("token"));
            return token;

        }
    }

