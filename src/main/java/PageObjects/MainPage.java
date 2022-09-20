package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    private final SelenideElement profileDropdownButton = $(By.xpath("/html/body/app-root/div/app-navigation/mat-toolbar/button"));
    private final SelenideElement profileOptionButton = $(By.xpath("//*[@id=\"mat-menu-panel-0\"]/div/button[1]"));
    private final SelenideElement viewInfoButton =  $("mat-card:nth-child(19) > mat-card-actions > button");
    private final ElementsCollection jobTitleInCard = $$("mat-card > mat-card-header > div > mat-card-title");



    public ProfilePage clickProfileButton() {
        profileDropdownButton.click();
        profileOptionButton.click();
        return new ProfilePage();
    }

    public JobPage clickViewInfoButton() {
        jobTitleInCard.findBy(Condition.text("Senior Backend Engineer"));
        viewInfoButton.click();
        return new JobPage();
    }

}
