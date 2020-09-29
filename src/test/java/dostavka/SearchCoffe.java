package dostavka;

import com.codeborne.selenide.Selenide;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

//import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchCoffe {
    @Test
    public void test1() {
       open("https://e-dostavka.by/");
        $(By.xpath(" //div[@class='main_menu__inner']//i[@class='fa fa-search']")).click();
        $(By.xpath("//input[@id='searchtext']")).setValue("Кофе натуральный молотый «Barista Mio» 100% арабика, 250");
        $(By.xpath("//a[contains(text(),'«Barista Mio» 100%')]")).click();
        $(By.xpath("//h2[contains(text(),'«Barista Mio» 100%')]")).shouldHave(text("«Barista Mio» 100%"));

    }
}
