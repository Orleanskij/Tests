package internetTasks;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;

public class UploadPage {
    private final String label_success = "//h3[contains(text(),'File Uploaded!')]";

    public boolean checkLabel() {
        if ($(By.xpath((label_success))).exists()) {
            return true;
        }
        return checkLabel();
    }
}