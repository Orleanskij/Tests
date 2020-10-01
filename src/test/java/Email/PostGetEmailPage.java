package Email;

import com.codeborne.selenide.Selectors;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PostGetEmailPage {

    public void send(String x){
$(By.xpath("")).selectOptionByValue();
        //$(By.xpath(".b-toolbar__item")).shouldHave(text("Написать письмо"));
       // $(By.className("compose-button__txt").shouldHave(text("Написать письмо")).waitUntil(appear, 20000);
        //$(byText("Написать письмо")).shouldBe(visible).waitUntil(appear, 20000);
//$(By.xpath("//div[@class='sidebar__compose-btn-box sidebar__compose-btn-box_with-dropdown']")).shouldBe(visible).waitUntil(appear, 20000);
        // $(By.xpath("//a[@class='compose-button compose-button_white compose-button_base compose-button_compact compose-button_with-dropdown js-shortcut']")).shouldHave(title()).waitUntil(appear, 200000);

sleep(20000);  //тут поправить
        $(By.xpath("//a[@class='compose-button compose-button_white compose-button_base compose-button_compact compose-button_with-dropdown js-shortcut']")).click();

        $(By.xpath("//div[@class='container--ItIg4']//input[@class='container--H9L5q size_s_compressed--2c-eV']")).setValue(x);
        $(By.xpath("//div[@class='editable-container-3t5h']")).setValue("Test t");
        $(By.xpath("//input[@name='Subject']")).setValue("Test t");

        $(By.xpath("//span[@class='button2 button2_base button2_primary button2_compact button2_hover-support js-shortcut']")).click();
sleep(10000);//вместо добавить shouldhave(text())
    }

    public void checkSentEmail(){


    }

}
