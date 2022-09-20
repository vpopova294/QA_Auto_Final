package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ProfilePage {


    //profile
    public final SelenideElement editInfoButton = $(By.xpath("//div/app-profile/div/div[1]/button[1]"));
    public final SelenideElement editNameInput = $("#mat-input-2");
    public final SelenideElement editLastNameInput = $("#mat-input-3");
    private final SelenideElement updateInfoButton = $(By.xpath("//*[@id=\"mat-dialog-0\"]/app-edit-profile/div/form/div/button[2]"));

    private final SelenideElement closeProfileButton = $(By.xpath("//div[1]/button[2]"));


    //jobs
    public final SelenideElement addJobButton = $(By.xpath("//app-root/div/app-profile/div/div[2]/app-my-jobs/div/div/button"));
    private final SelenideElement titleInput = $("#mat-input-2");
    private final SelenideElement descriptionInput = $("#mat-input-3");
    private final SelenideElement priceInput = $("#mat-input-4");
    private final SelenideElement createJobButton = $("div.row > app-add-job > div > form > div > button");
    private final SelenideElement removeJobButton = $("div > mat-card > mat-card-actions > button");

    private final ElementsCollection myJobsCards = $$("div > mat-card");
    private final SelenideElement cardTitle = $(By.cssSelector("div > mat-card-title"));



    public ProfilePage clickEditInfoButton() {
        editInfoButton.click();
        return this;
    }
    public ProfilePage setNewName(String newName) {
        editNameInput.clear();
        editNameInput.sendKeys(newName);
        return this;
    }

    public ProfilePage setNewLastName(String newLastName) {

        editLastNameInput.clear();
        editLastNameInput.sendKeys(newLastName);
        return this;
    }

    public ProfilePage clickUpdateButton() {
        updateInfoButton.click();
        return this;
    }

    public ProfilePage clickAddJobButton() {
        addJobButton.click();
        return this;
    }

    public ProfilePage setTitle(String title) {
        //titleInput.clear();
        titleInput.sendKeys(title);
        return this;
    }

    public ProfilePage setDescription(String description) {
        descriptionInput.clear();
        descriptionInput.sendKeys(description);
        return this;
    }

    public ProfilePage setPrice(String price) {
        priceInput.clear();
        priceInput.sendKeys(price);
        return this;
    }

    public ProfilePage clickCreateJobButton() {
        createJobButton.click();
        return this;
    }

    public ProfilePage clickRemoveJobButton() {
        removeJobButton.click();
        Alert alert = switchTo().alert();
        alert.accept();
        return this;
    }

    public ProfilePage chooseCard() {
        myJobsCards.findBy(Condition.text("aqa"));
        return this;
    }

    public String getCardTitle() {
        return cardTitle.getText();
    }

}
