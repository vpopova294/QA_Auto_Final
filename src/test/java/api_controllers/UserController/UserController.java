package api_controllers.UserController;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;

public class UserController {

    public void postUserUpdate(String username, String name, String lastname, String token) throws IOException {

        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("username", username);
        jsonObject1.put("name", name);
        jsonObject1.put("lastname", lastname);



        RequestBody body = RequestBody.create(jsonObject1.toString().getBytes());
        Request request = new Request.Builder()
                .post(body)
                .url("https://freelance.lsrv.in.ua/api/user/update")
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization","Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIyMiIsIm5hbWUiOm51bGwsImlkIjoiMjIiLCJ1c2VybmFtZSI6ImxlcmEyNiIsImxhc3RuYW1lIjpudWxsLCJpYXQiOjE2NjM1OTE1ODcsImV4cCI6MTY2MzU5NTE4N30.BBq1aGCcqgyIIGRBxsHAd9Lh3hsSN7cZqXA8ar3eCMy3UJjd8-uLBlepp5mqCzGPuu2eWzkC6YiLYqX_Z6yT8g")
                .build();

        Response response = new OkHttpClient().newCall(request).execute();

        System.out.println(response.code());
        String responseBody = response.body().string();
    }

    public void getUserById(String id) throws IOException {
        Request request = new Request.Builder()
                .get()
                .url("https://freelance.lsrv.in.ua/api/user/1" + id)
                // думала добавить айди юзера уже в тесте, но неверный статус код получается - 404 вместо 200
                .addHeader("Authorization","Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIyMiIsIm5hbWUiOm51bGwsImlkIjoiMjIiLCJ1c2VybmFtZSI6ImxlcmEyNiIsImxhc3RuYW1lIjpudWxsLCJpYXQiOjE2NjM1OTE1ODcsImV4cCI6MTY2MzU5NTE4N30.BBq1aGCcqgyIIGRBxsHAd9Lh3hsSN7cZqXA8ar3eCMy3UJjd8-uLBlepp5mqCzGPuu2eWzkC6YiLYqX_Z6yT8g")
                .build();

        Response response = new OkHttpClient().newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.body().string());
    }

    public void getUser() throws IOException {
        Request request = new Request.Builder()
                .get()
                .url("https://freelance.lsrv.in.ua/api/user/")
                .addHeader("Authorization","Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIyMiIsIm5hbWUiOm51bGwsImlkIjoiMjIiLCJ1c2VybmFtZSI6ImxlcmEyNiIsImxhc3RuYW1lIjpudWxsLCJpYXQiOjE2NjM1OTE1ODcsImV4cCI6MTY2MzU5NTE4N30.BBq1aGCcqgyIIGRBxsHAd9Lh3hsSN7cZqXA8ar3eCMy3UJjd8-uLBlepp5mqCzGPuu2eWzkC6YiLYqX_Z6yT8g")

                .build();

        Response response = new OkHttpClient().newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.body().string());
    }

}
