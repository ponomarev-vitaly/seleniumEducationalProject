package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(css = "[name='q']")
    private WebElement searchInput;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void performSearch(String searchPhrase){
        searchInput.sendKeys(searchPhrase);
        searchInput.sendKeys(Keys.ENTER);
    }
}
