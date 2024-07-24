import org.junit.Test;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTestClass {

    @Test
    public void test() {
        open("https://www.google.com");
        //Это блок авторизации
        $(byXpath("//textarea[@id='APjFqb']")).setValue("Selenium WebDriver").pressEnter();
        $(byXpath("//div[@id='search']")).shouldBe(visible);
    }
}
