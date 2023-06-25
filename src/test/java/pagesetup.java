import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagesetup {

    String projectLocation = System.getProperty("user.dir");
    ChromeDriver driver;

    @BeforeEach

    public void setup() {

        System.setProperty("webdriver.chrome.driver", projectLocation + "/resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
        driver.manage().window().maximize();
    }

    @AfterEach
    public void teardown() {

        driver.close();
    }
}
