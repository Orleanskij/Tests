package Email;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class EmailPage {



    public By locatowriteEmailButton = By.xpath("//a[@class='compose-button compose-button_white compose-button_base compose-button_compact compose-button_with-dropdown js-shortcut']");
    public SelenideElement writeEmailButton=$(locatowriteEmailButton);

    public By locatorsendToField = By.xpath("//div[@class='container--ItIg4']//input[@class='container--H9L5q size_s_compressed--2c-eV']");
    public SelenideElement sendToField=$(locatorsendToField);

    public By licatorsubjectFiled = By.xpath("//input[@name='Subject']");
    public SelenideElement subjectFiled=$(licatorsubjectFiled);

    public By locatortextFiled = By.xpath("//div[@class='editable-container-3t5h']");
    public SelenideElement textFiled=$(locatortextFiled);

    public By locatorsendButton = By.xpath("/span[@class='button2 button2_base button2_primary button2_compact button2_hover-support js-shortcut']");
    public SelenideElement sendButton=$(locatorsendButton);

    public By locatorconfermSendLabel = By.xpath("//a[@class='layer__link']");
    public SelenideElement confermSendLabel=$(locatorconfermSendLabel);

    public By locatorSelectSendEmailLink = By.xpath("//a[@class='nav__item js-shortcut nav__item_active nav__item_shortcut nav__item_expanded_true nav__item_child-level_0']");
    public SelenideElement selectSendEmailLink=$(locatorSelectSendEmailLink);

    public SelenideElement closeConfermWindow = $x("//div[@class='controls_container--17SRg']//button[3]//div[1]//div[1]//*[local-name()='svg']");
    public SelenideElement totalCount = $x("span.button2_select-all .button2__txt");
    public String textSubject="xxxxxxxxxxxxx";
    public String textForTextArea="xxxxxxxxxxxxx";

    public long letters = 3;

    public void send(String emails) {
        writeEmailButton.click();
        sendToField.setValue(emails);
        subjectFiled.setValue(textSubject);
        textFiled.setValue(textForTextArea);
        sendButton.click();
        confermSendLabel.exists();


    }

    public boolean checksending() {
        if (confermSendLabel.exists()) {
            throw new IllegalStateException();
        }
        closeConfermWindow.click();
        return true;
    }

    public Long countOfLetters() {
        selectSendEmailLink.click();
        String number = totalCount.should(Condition.visible).innerText();
        return Long.parseLong(number.trim());
    }

}
