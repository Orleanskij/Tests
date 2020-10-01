package Email;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Login_outPage {

    public void login(String userName, String password){
        open("https://mail.ru/");
        $(By.name("login")).setValue(userName);
        $(By.xpath("//input[@class='o-control']")).click();
        $(By.name("password")).setValue(password);
        $(By.xpath("//input[@class='o-control']")).click();

    }


}
