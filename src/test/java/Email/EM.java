package Email;

import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.parser.JSONParser;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class EM {

   public List<String> emails;


    public List<String> getEmails() {
        return emails;
    }

    @DataProvider(name = "emailProvider")
    public Object[][] emailProvider() throws IOException {



        EM email = new ObjectMapper().readValue(new File("src/test/resources/mans.json"), EM.class);
        return new Object[][]{
                new Object[]{email.getEmails()}
        };
    }


}