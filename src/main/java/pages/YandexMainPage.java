package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Главная страница")
public class YandexMainPage extends AkitaPage {

    @Name("Строка поиска")
    @FindBy(css = "#text")
    private SelenideElement search;

}
