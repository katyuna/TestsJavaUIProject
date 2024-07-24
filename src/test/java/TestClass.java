import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:/distr/Autotesting/webdrivers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testOpenPage() {
        //Открыть страницу
        driver.get("https://www.google.com");
        //Проверить заголовок страницы
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);

        WebElement searchField = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        WebElement searchButton = driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
        searchField.sendKeys("Selenium WebDriver");
        searchButton.click();
    }
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
 }
