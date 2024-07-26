
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import po.GoogleMainPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertTrue;

public class CommonSearchTest extends BaseTest{
    @Test
    @DisplayName("Получение поисковой выдачи")
    public void testCommonSearchResultsViaEnterTextIntoTheSearchField (){
        //Создать экземпляр класса GoogleMainPage и открыть указанный в классе URL
        GoogleMainPage googleMainPage = open(GoogleMainPage.URL, GoogleMainPage.class);
        //Выполнить поиск по тексту Selenium WebDriver
        googleMainPage.doSearchFor("Selenium WebDriver");
        //Проверки фактического результата
        //Осуществился ли поиск
        assertTrue("Поиск не осуществился", googleMainPage.isResult());
        //Есть ли результаты поиска
        assertTrue("Отсутствуют результаты поиска", googleMainPage.isFirstResult());
        //Релевантность поиска
System.out.println(googleMainPage.getResultTitles());


    }
}
