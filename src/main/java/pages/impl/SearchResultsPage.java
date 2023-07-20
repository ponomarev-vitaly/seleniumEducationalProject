package pages.impl;

import components.WebComponent;
import components.impl.SearchResultItemComponent;
import entities.SearchResultItem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.WebPage;

import java.security.PrivilegedAction;
import java.util.List;
import java.util.stream.Collectors;

public class SearchResultsPage extends WebPage {

    private static final By SEARCH_RESULTS_ITEM_SELECTOR = By.cssSelector(".repo-list-item");
//    @FindBy(css = ".repo-list-item")
//    private List<WebElement> searchResultsItems;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public List<SearchResultItem> searchResultsItems(){
        return searchResultItems().stream()
                .map(SearchResultItemComponent::convertToSearchResultItem)
                .collect(Collectors.toList());
    }

//    public List<String> searchResultsItemsText(){
//        return searchResultsItems
//                .stream()
//                .map(element -> element.getText().toLowerCase())
//                .collect(Collectors.toList());
//    }

    public List<SearchResultItem> searchResultsItemsWithText(String searchPhrase) {
        return searchResultsItems()
                .stream()
                .filter(item -> item.getTitle().contains(searchPhrase) || item.getDescription().contains(searchPhrase))
                .collect(Collectors.toList());
    }

//    public List<String> searchResultsItemsWithText(String searchText) {
//        return searchResultsItemsText()
//                .stream()
//                .filter(item -> item.contains(searchText))
//                .collect(Collectors.toList());
//    }

    private List<SearchResultItemComponent> searchResultItems(){
        return findElements(SEARCH_RESULTS_ITEM_SELECTOR).stream()
                .map(SearchResultItemComponent::new)
                .collect(Collectors.toList());
    }
}
