
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import po.GoogleMainPage;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CommonSearchTest extends BaseTest{
    @Test
    @DisplayName("Получение поисковой выдачи")
    public void testCommonSearchResultsViaEnterTextIntoTheSearchField() {
        //Создать экземпляр класса GoogleMainPage и открыть указанный в классе URL
        GoogleMainPage googleMainPage = open(GoogleMainPage.URL, GoogleMainPage.class);

        //Выполнить поиск по тексту Selenium WebDriver
        googleMainPage.doSearchFor("Selenium WebDriver");

        //ПРОВЕРКИ

        //Осуществился ли поиск
        assertTrue("Поиск не осуществился", googleMainPage.isResult());

        //Есть ли результаты поиска
        assertTrue("Отсутствуют результаты поиска", googleMainPage.isFirstResult());

        //Релевантность поиска
        boolean relevantResults = false;
        for (int i = 0; i <= googleMainPage.getResultTitles().size(); i++) {
            String currentTitle = googleMainPage.getResultTitles().get(i);
            if (currentTitle.toLowerCase().contains("selenium") || currentTitle.toLowerCase().contains("webdriver")) {
                relevantResults = true;
                break;
            }
        }
        assertTrue("Результаты поиска не соответствуют поисковому запросу", relevantResults);
    }
}