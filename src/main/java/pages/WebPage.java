package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebPage {
    private WebDriver driver;
    protected WebPage(WebDriver driver) {
        this.driver = driver;
    }
    protected WebElement findElement(By bySelector){
        return driver.findElement(bySelector);
    }

    protected List<WebElement> findElements(By bySelector){
        return driver.findElements(bySelector);

    }

//    protected WebPage(WebDriver driver) {
//        PageFactory.initElements(driver, this);
//    }
}