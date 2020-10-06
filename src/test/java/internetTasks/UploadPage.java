package internetTasks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;

public class UploadPage {
    public By locatorLabel_success = By.xpath("//h3[contains(text(),'File Uploaded!')]");
    public SelenideElement label_success = $(locatorLabel_success);


    public boolean checkLabel() {
        if (label_success.exists()) {
            return true;
        }
        return checkLabel();
    }
}