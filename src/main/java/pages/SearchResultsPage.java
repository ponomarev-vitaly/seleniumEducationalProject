package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage {
    @FindBy(css = ".repo-list-item")
    private List<WebElement> searchResultsItems;
}
