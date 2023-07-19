package pages.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.WebPage;

public class HomePage extends WebPage {



//    @FindBy(xpath = "(//input[@id='query-builder-test'])[1]")
//    @FindBy(id = "query-builder-test")
    @FindBy(css = "#query-builder-test")
    private WebElement searchInput;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void performSearch(String searchPhrase) {
//        WebElement searchInput = driver.findElement(By.xpath("(//input[@id='query-builder-test'])[1]"));
//        WebElement searchInput = driver.findElement(By.id("query-builder-test"));
//        searchInput = driver.findElement(new By.ByClassName("FormControl-input QueryBuilder-Input FormControl-medium"));

//        Actions builder = new Actions(driver);
//        builder.moveToElement(searchInput).doubleClick(searchInput).perform();

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
