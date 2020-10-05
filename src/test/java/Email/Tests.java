package Email;

import org.junit.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class Tests {

    private String userName = "traininggtest";
    private String password = "1Sparta1";
    private String email;

    EmailPage send = new EmailPage();
    LoginPage login = new LoginPage();

    @Test(dataProvider = "emailProvider", dataProviderClass = EmailProvider.class)
    public void sendEmail(String emails) {
        login.login(userName, password);
        send.send(emails);
        Assert.assertTrue(send.checksending());
    }

    @Test
    public void checkCount() {
        login.login(userName, password);
        Assert.assertNotEquals(send.letters, send.countOfLetters());
    }
}


