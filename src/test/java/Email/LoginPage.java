package Email;

import com.codeborne.selenide.SelenideElement;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openqa.selenium.By;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String path = "";
    public By locatoruserNameField = By.name("login");
    public SelenideElement userNameField = $(locatoruserNameField);

    public By locatorpasswordField = By.name("password");
    public SelenideElement passwordField = $(locatorpasswordField);

    public By locatorsubmitButton = By.xpath("//input[@class='o-control']");
    public SelenideElement submitButton = $(locatorsubmitButton);


    public String URL = "https://mail.ru/";

    public void login() throws IOException {
        LoginPage credentials = new ObjectMapper().readValue(new File(path), LoginPage.class);
        open(URL);
        userNameField.setValue(getUserName());
        submitButton.click();
        passwordField.setValue(getPassword());
        submitButton.click();
    }


}
