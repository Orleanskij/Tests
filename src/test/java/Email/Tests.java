package Email;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.*;


public class Tests {

    private String userName = "traininggtest";
    private String password = "1Sparta1";


    EmailPage emailPage = new EmailPage();
    LoginPage loginPage = new LoginPage();


    @BeforeMethod
    public void BeforeMetgod() throws IOException {
        loginPage.login();
    }

    @Test(dataProvider = "emailProvider", dataProviderClass = EmailProvider.class)
    public void sendEmail(String emails) {
        emailPage.send(emails);
        Assert.assertTrue(emailPage.checksending());
    }

    @Test
    public void checkCount() {
        Assert.assertNotEquals(emailPage.letters, emailPage.countOfLetters());
    }

}


