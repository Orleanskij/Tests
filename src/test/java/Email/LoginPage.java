package Email;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    public String userNameField="login";
    public String passwordField="password";
    public String submitButton="//input[@class='o-control']";
    public String URL="https://mail.ru/";

    public void login(String userName, String password){
        open(URL);
        $(By.name(userNameField)).setValue(userName);
        $(By.xpath(submitButton)).click();
        $(By.name(passwordField)).setValue(password);
        $(By.xpath(submitButton)).click();

    }


}
