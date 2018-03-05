package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

@Name("Поисковая выдача")
public class YandexSerpPage extends AkitaPage {

    @Name("Результаты поиска")
    @FindBy(css = "div.content__left > ul > li > div > h2 > a")
    private List<SelenideElement> results;

}
