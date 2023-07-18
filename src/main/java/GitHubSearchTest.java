import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.impl.HomePage;
import pages.impl.SearchResultsPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GitHubSearchTest {

    private static final String searchPhrase = "selenium";
    private static WebDriver driver;
    private static WebDriverWait wait;

    @BeforeAll
    public static void setUpDriver(){
        WebDriverManager.chromedriver().setup();

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @BeforeAll
    public static void setUpWait(){
        wait = new WebDriverWait(driver, 15);
    }

    private static void switchOffImplicitWait(){
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }
    @Test
    public void checkGitHubSearch(){
        driver.get("https://github.com/");

        HomePage homePage = new HomePage(driver);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);

        homePage.performSearch(searchPhrase);

        List<String> actualItems = searchResultsPage.searchResultsItemsText();
        List<String> expectedItems = searchResultsPage.searchResultsItemsWithText(searchPhrase);

        Assertions.assertEquals(expectedItems, actualItems);

//        WebElement searchInput = driver.findElement(By.cssSelector("[name='q']"));
//
//        String searchPhrase = "selenium";
//
//        searchInput.sendKeys(searchPhrase);
//        searchInput.sendKeys(Keys.ENTER);
//
//        List<String> actualItems = driver.findElements(By.cssSelector(".repo-list-item"))
//                .stream()
//                .map(element -> element.getText().toLowerCase())
//                .collect(Collectors.toList());
//        List<String> expectedItems = actualItems.stream()
//                .filter(item -> item.contains(searchPhrase))
//                .collect(Collectors.toList());

//        System.out.println(actualItems); // Print out actualItems and expectedItems into the console.
//        System.out.println("=============================>");
//        System.out.println(expectedItems);

//        System.out.println(LocalDateTime.now());
//        switchOffImplicitWait();
//        wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector(".repo-list-item"))));
//        wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("[title='invalid title']"))));
//        Assertions.assertTrue(driver.findElement(By.cssSelector("[title='invalid title']")).isDisplayed());

//        Assertions.assertEquals(expectedItems, actualItems);
    }
//    @AfterAll
//    public static void tearDownDriver(){
//        // System.out.println(LocalDateTime.now());
//        driver.quit();
//    }
}
