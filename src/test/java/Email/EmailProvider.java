package Email;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class EmailProvider {

    public List<String> emails;
    public String path = "src/test/resources/mans.json";


    public List<String> getEmails() {
        return emails;
    }


    @DataProvider(name = "emailProvider")
    public Object[][] emailProvider() throws IOException {

        EmailProvider readFromFile = new ObjectMapper().readValue(new File(path), EmailProvider.class);
        Object[][] object = new Object[readFromFile.getEmails().size()][1];
        for (int i = 0; i < readFromFile.getEmails().size(); i++) {
            object[i][0] = readFromFile.getEmails().get(i);
        }
        return object;
    }
}