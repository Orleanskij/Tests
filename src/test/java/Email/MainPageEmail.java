package Email;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;



public class MainPageEmail {

    private String userName;
    private String password;
    private String email;


@Test(dataProvider = "emailProvider",dataProviderClass = EM.class)
   public void sendEmail(String emails){
       Login_outPage login = new Login_outPage();
       login.login("traininggtest","1Sparta1");

       PostGetEmailPage send= new PostGetEmailPage();
       send.send(emails);

   }





   }


