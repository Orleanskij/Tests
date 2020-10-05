package Email;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class EmailPage {

    public String writeEmailButton = "//a[@class='compose-button compose-button_white compose-button_base compose-button_compact compose-button_with-dropdown js-shortcut']";
    public String sendToField = "//div[@class='container--ItIg4']//input[@class='container--H9L5q size_s_compressed--2c-eV']";
    public String subjectFiled = "//input[@name='Subject']";
    public String textFiled = "//div[@class='editable-container-3t5h']";
    public String sendButton = "/span[@class='button2 button2_base button2_primary button2_compact button2_hover-support js-shortcut']";
    public String confirmationWindow = ".layer__link";
    public String closeWindow = "//div[@class='controls_container--17SRg']//button[3]//div[1]//div[1]//*[local-name()='svg']";
    public String selectAll = "span.button2_select-all > .button2__wrapper";
    public String totalCount = "span.button2_select-all .button2__txt";
    public long letters = 3;

    public void send(String emails) {



        $(By.xpath(writeEmailButton)).click();
        $(By.xpath(sendToField)).setValue(emails);
        $(By.xpath(textFiled)).setValue("Test t");
        $(By.xpath(subjectFiled)).setValue("Test t");
        $(By.xpath(sendButton)).click();
        sleep(10000);
    }

    public boolean checksending() {
        if ($(confirmationWindow).exists()) {
            throw new IllegalStateException();
        }
        $(closeWindow).click();
        return true;
    }

    public Long countOfLetters() {
        $(selectAll).click();
        String number = $(totalCount).should(Condition.visible).innerText();
        return Long.parseLong(number.trim());
    }

}
