import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestClass {
    WebDriver driver = new ChromeDriver();
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:/distr/Autotesting/webdrivers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
    }


    @After
    public void tearDown() {
        // Закройте браузер
        if (driver != null) {
            driver.quit();
        }
    }
 }
