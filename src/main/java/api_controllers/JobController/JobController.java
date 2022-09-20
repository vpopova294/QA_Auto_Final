package api_controllers.JobController;

import PageObjects.JobPage;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;

public class JobController {

    public void postDeleteJob(String jobId, String token) throws IOException {

        JSONObject jsonObject1 = new JSONObject();
        RequestBody body = RequestBody.create(jsonObject1.toString().getBytes());
        Request request = new Request.Builder()
                .post(body)
                .url("https://freelance.lsrv.in.ua/api/job/delete/" + jobId)
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization",token)
                .build();

        Response response = new OkHttpClient().newCall(request).execute();

        System.out.println(response.code());
        String responseBody = response.body().string();
    }

    public void postCreateJob(String title, String description, String price,String token) throws IOException {

            JSONObject jsonObject2 = new JSONObject();
            jsonObject2.put("title", title);
            jsonObject2.put("description", description);
            jsonObject2.put("price", price);


            RequestBody body = RequestBody.create(jsonObject2.toString().getBytes());
            Request request = new Request.Builder()
                    .post(body)
                    .url("https://freelance.lsrv.in.ua/api/job/create")
                    .addHeader("Content-Type", "application/json")
                    .addHeader("Authorization", token)
                    .build();

            Response response = new OkHttpClient().newCall(request).execute();

            System.out.println(response.code());
            String responseBody = response.body().string();
    }

    public void getJobById(String id,String token) throws IOException {
        Request request = new Request.Builder()
                .get()
                .url("https://freelance.lsrv.in.ua/api/job/22" + id)
                .addHeader("Authorization", token)
                .build();

        Response response = new OkHttpClient().newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.body().string());
    }

    public void getJobsByUser(String token) throws IOException {
        Request request = new Request.Builder()
                .get()
                .url("https://freelance.lsrv.in.ua/api/job/user/jobs")
                .addHeader("Authorization", token)
                .build();

        Response response = new OkHttpClient().newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.body().string());
    }

    public void getAllJobs(String token) throws IOException {
        Request request = new Request.Builder()
                .get()
                .url("https://freelance.lsrv.in.ua/api/job/all")
                .addHeader("Authorization",token)
                .build();

        Response response = new OkHttpClient().newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.body().string());
    }


}
