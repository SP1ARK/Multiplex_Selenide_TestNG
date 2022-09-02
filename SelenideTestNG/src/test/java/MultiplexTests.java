import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideConfig;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static java.awt.SystemColor.menuText;

public class MultiplexTests extends BaseTest{

    MainPage mainPage = new MainPage();

    @BeforeTest
    public void closePopUp() {
        mainPage.openStarterPage();
        //Закрываем попап нажатием на кнопку "Так".
        mainPage.popupYesBtnClick();
    }

    @Test
    //Проверяем текст бокового меню.
    public void checkMenuText() {

        //Открываем старотовую страницу.
        mainPage.openStarterPage();
        //Открывем боковое меню.
        mainPage.menuBtnClick();

        //Проверяем, что объект ".menu_list > a:nth-child(7)" на странице полностью соответсвует названию "Допомога".
        mainPage.helpLinkCheckText("Допомога");
    }
    @Test
    //Проверяем объект на соответствие типу.
    public void checkSignInPage() {

        //Открываем старотовую страницу.
        mainPage.openStarterPage();
        //Открывем боковое меню.
        mainPage.menuBtnClick();
        //Нажимем на кнопку "Увійти" в боковом меню.
        mainPage.signInBtnClick();

        //Выполняем проверку, что поле для ввода номера телефона соответствует типу "tel".
        mainPage.phoneNumberIptCheckType("tel");
    }
    @Test
    //Проверяем вход в систему.
    public void checkLoginSyst() {

        //Открываем старотовую страницу.
        mainPage.openStarterPage();
        //Открывем боковое меню.
        mainPage.menuBtnClick();
        //Нажимем на кнопку "Увійти" в боковом меню.
        mainPage.signInBtnClick();

        //Вводим номер телефона "123456789".
        mainPage.sendNumberIptCheck("123456789");
        //Нажимаем на кнопку "Продовжити".
        mainPage.ContinueBtnClick();
    }
    @Test
    //Проверяем id елемента IMAX на странице "Скоро у прокаті".
    public void checkLinkSoon() {

        //Открываем старотовую страницу.
        mainPage.openStarterPage();
        //Открывем боковое меню.
        mainPage.menuBtnClick();
        //Нажимаем на ссылку "Скоро у прокаті".
        mainPage.CheckFollowSoonLink();

        //Проверка соответствия id на странице.
        mainPage.CheckIdImaxSwitch("tocinemas");
    }
}
