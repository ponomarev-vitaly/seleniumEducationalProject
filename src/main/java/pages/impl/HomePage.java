package pages.impl;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.WebPage;

public class HomePage extends WebPage {

    @FindBy(css = "#query-builder-test")
    private WebElement searchInput;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void performSearch(String searchPhrase) {
        searchInput.sendKeys(searchPhrase);
        searchInput.sendKeys(Keys.ENTER);
    }
}


//package pages.impl;
//
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import pages.WebPage;
//
//public class HomePage extends WebPage {
//    @FindBy(css = "[name='q']")
//    private WebElement searchIn;
//
//    public HomePage(WebDriver driver){
//        super(driver);
//    }
//
//    public void performSearch(String searchPhrase){
//        searchIn.sendKeys(searchPhrase);
//        searchIn.sendKeys(Keys.ENTER);
//    }
//}
