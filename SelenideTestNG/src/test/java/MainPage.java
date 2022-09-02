import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    SelenideElement signInBtn = $(".menu-block > a");
    SelenideElement popupYesBtn = $(".yes");
    SelenideElement menuBtn = $(".menu-btn");
    SelenideElement helpLink = $(".menu_list > a:nth-child(7)");
    SelenideElement phoneNumberIpt = $("#tel");
    SelenideElement continueBtn = $("#app > div > main > div > div.wd.login__wd > div.login__left > div > div.login__step1 > div > div > div");
    SelenideElement soonLink = $(".menu_list > a:nth-child(2)");
    SelenideElement imaxSwitch = $("#tocinemas");

    public void openStarterPage() {
        open("https://multiplex.ua");
    }
    public void signInBtnClick() {
        signInBtn.shouldBe(Condition.visible).click();
    }

    public void popupYesBtnClick() {
        popupYesBtn.shouldBe(Condition.visible).click();

    }
    public void menuBtnClick() {

        menuBtn.shouldBe(Condition.visible).click();
    }
    public void helpLinkCheckText(String txt) {
        helpLink.shouldHave(exactText(txt));
    }
    public void phoneNumberIptCheckType(String type) {
        phoneNumberIpt.shouldHave(type(type));
    }
    public void sendNumberIptCheck(String number) {
        phoneNumberIpt.sendKeys(number);
    }
    public void ContinueBtnClick() {
        continueBtn.shouldBe(enabled).click();
    }
    public void CheckFollowSoonLink() {
        soonLink.shouldBe(visible).click();
    }
    public void CheckIdImaxSwitch(String idImax) {
        imaxSwitch.shouldHave(id(idImax));
    }
}
