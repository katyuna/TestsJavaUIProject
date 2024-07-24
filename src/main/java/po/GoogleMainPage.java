package po;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleMainPage {
    //Адрес страницы
    public static final String URL = "https://www.google.com";
    // Локатор поля ввода поиска
    @FindBy(how = How.XPATH, using = "//textarea[@id='APjFqb']")
    private SelenideElement searchField;
    //Локатор для кнопки поиска
    @FindBy(how = How.XPATH, using = "//div[@id='search']")
    private SelenideElement searchButton;
    //Метод заполнения поля поиска
    public void setSearch(String searchText)
    {
        this.searchField.click();
        this.searchField.setValue(searchText);
    }
    //Метод нажатия кнопки поиска
    public void clickSearchButton() {
        this.searchButton.click();
    }
}
