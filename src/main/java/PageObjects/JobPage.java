package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class JobPage {

    private final SelenideElement textArea = $("#mat-input-2");
    private final SelenideElement leaveCommentButton = $(" mat-card > div > button");
    private final SelenideElement closeJobDetailsButton = $("div:nth-child(1) > button");



    public JobPage setTextArea(String text) {
        textArea.clear();
        textArea.sendKeys(text);
        return this;
    }

    public JobPage clickLeaveCommentButton() {
        leaveCommentButton.click();
        return this;
    }

    public MainPage clickCloseJobDetailsButton() {
        closeJobDetailsButton.click();
        return new MainPage();
    }
}
