package components.impl;

import components.WebComponent;
import entities.SearchResultItem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResultItemComponent extends WebComponent {

    private static final By TITLE_SELECTOR = By.cssSelector("div[class='Box-sc-g0xbh4-0 kXssRI'] div:nth-child(1) div:nth-child(1) div:nth-child(1) h3:nth-child(1) div:nth-child(1) div:nth-child(1)");
    private static final By DESCRIPTION_SELECTOR = By.cssSelector("body > div:nth-child(1) > div:nth-child(8) > main:nth-child(1) > react-app:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > main:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > span:nth-child(1)");
    public SearchResultItemComponent(WebElement rootElement){
        super(rootElement);
    }

    public SearchResultItem convertToSearchResultItem(){
        return new SearchResultItem(
                retrieveTitle(),
                retrieveDescription()
        );
    }

    private String retrieveTitle() {
        return findElement(TITLE_SELECTOR).getText().toLowerCase();
    }

    private String retrieveDescription() {
        return findElement(DESCRIPTION_SELECTOR).getText().toLowerCase();
    }

//    public boolean containsSearchPhrase(String searchPhrase){
//        return containsSearchPhraseIgnoringCase(searchPhrase, TITLE_SELECTOR)
//                || containsSearchPhraseIgnoringCase(searchPhrase, DESCRIPTION_SELECTOR);
//    }
//
//    private boolean containsSearchPhraseIgnoringCase(String searchPhrase, By selector){
//        return findElement(selector).getText().toLowerCase().contains(searchPhrase);
//    }
}
