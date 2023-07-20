package entities;

public class SearchResultItem {
    private final String title;
    private final String description;


    public SearchResultItem(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
