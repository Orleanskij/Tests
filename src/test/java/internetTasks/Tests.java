
package internetTasks;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.*;

public class Tests {
    UploadPage loadPage = new UploadPage();

    public String urlDownload = "https://the-internet.herokuapp.com/download";
    public SelenideElement downloadElement = $$(".example>a").get(0);

    public String dissapearURL = "https://the-internet.herokuapp.com/disappearing_elements";
    public By locatorGalleryButton = By.xpath("//a[contains(text(),'Gallery')]");
    public SelenideElement GalleryButton = $(locatorGalleryButton);
    public String Gallery_Text = "Gallery";

    public String urlUpload="https://the-internet.herokuapp.com/upload";
    public By locatorChooseFiles = By.xpath("//input[@id='file-upload']");
    public By locatorUploadButton = By.xpath("//input[@id='file-submit']");
    public SelenideElement UploadButton = $(locatorUploadButton);


    @Test
    public void loadTest() {
        open(urlUpload);
        WebDriverRunner.getWebDriver().findElement(locatorChooseFiles).sendKeys("D:" + File.separator + "images" + File.separator + "Lighthouse.jpg");
        UploadButton.click();
        Assert.assertTrue(loadPage.checkLabel());
    }

    @Test
    public void downloadTest() throws FileNotFoundException {
        open(urlDownload);
        String file = downloadElement.download().toString();
        Assert.assertTrue(file.contains(downloadElement.text()));
    }

    @Test
    public void dissapearTest() {
        open(dissapearURL);
        WebDriverRunner.getWebDriver().navigate().refresh();
        Assert.assertEquals(GalleryButton.text(), Gallery_Text);

    }
}




