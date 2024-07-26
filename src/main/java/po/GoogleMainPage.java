package po;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

public class GoogleMainPage {
    //Адрес страницы
    public static final String URL = "https://www.google.com";

    // Локатор поля ввода поиска
    @FindBy(how = How.XPATH, using = "//textarea[@id='APjFqb']")
    private SelenideElement searchField;

    //Локатор для блока с результатами поиска
    @FindBy(how = How.XPATH, using = "//div[@id='search']")
    private SelenideElement results;

    // Локатор заголовка первого результата поиска
    @FindBy(how = How.XPATH, using = "//h3")
    private SelenideElement firstResult;

    //Локатор для получения всех заголовков результата поиска
    @FindBy(how = How.XPATH, using = "//div[@id='search']//h3")
    private ElementsCollection resultTitles;

    //Метод выполнения поиска
    public void doSearchFor(String searchText)
    {
        this.searchField.setValue(searchText).pressEnter();
    }
    //Метод проверки поиска
    public boolean isResult() {
        return results.isDisplayed();
    }
    //Метод проверки показа первого результата в поиске
    public boolean isFirstResult() {
        return firstResult.isDisplayed();
    }
    // Метод для получения заголовков из коллекции
    public List<String> getResultTitles() {
        List<String> titles = new ArrayList<>();
        for (SelenideElement title : resultTitles) {
            titles.add(title.getText());
        }
        return titles;
    }
}
