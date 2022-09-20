package api_tests;

import api_controllers.JobController.JobController;
import org.testng.annotations.Test;

import java.io.IOException;

public class JobControllerTest {
    @Test
    public void userControllerTests() throws IOException {
        JobController jobController = new JobController();

        jobController.postCreateJob("automation qa", "new job","1700", "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIyMiIsIm5hbWUiOm51bGwsImlkIjoiMjIiLCJ1c2VybmFtZSI6ImxlcmEyNiIsImxhc3RuYW1lIjpudWxsLCJpYXQiOjE2NjM1OTE1ODcsImV4cCI6MTY2MzU5NTE4N30.BBq1aGCcqgyIIGRBxsHAd9Lh3hsSN7cZqXA8ar3eCMy3UJjd8-uLBlepp5mqCzGPuu2eWzkC6YiLYqX_Z6yT8g");

        jobController.postDeleteJob("22", "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIyMiIsIm5hbWUiOm51bGwsImlkIjoiMjIiLCJ1c2VybmFtZSI6ImxlcmEyNiIsImxhc3RuYW1lIjpudWxsLCJpYXQiOjE2NjM1OTE1ODcsImV4cCI6MTY2MzU5NTE4N30.BBq1aGCcqgyIIGRBxsHAd9Lh3hsSN7cZqXA8ar3eCMy3UJjd8-uLBlepp5mqCzGPuu2eWzkC6YiLYqX_Z6yT8g");

        jobController.getJobById("12");

        jobController.getJobsByUser();

        jobController.getAllJobs();
    }
}
