package petr.tests;

import com.Petr.TestNG.Data;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import java.util.List;

@Listeners
public class Names {
    List<String> names1;
    List<String> names2;

    public List<String> getNames1() {
        return names1;
    }

    public List<String> getNames2() {
        return names2;
    }

    @Test
    public void massive() throws IOException {

        Names d = new ObjectMapper().readValue(new File("src/main/resources/mans.json"), Names.class);

        Assert.assertEquals(d.getNames1(), d.getNames2());

    }

}
