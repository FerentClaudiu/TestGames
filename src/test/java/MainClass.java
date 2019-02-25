import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

    public static WebDriver driver;

    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "/home/claudiu/TestSample/resources/chromedriver");

    }

    public static void launchApp() {
        driver = new ChromeDriver();
        RedTiger redTiger = new RedTiger();
        RedTiger.testGames(driver);

    }


    public static void main(String[] args) {
        openBrowser();
        launchApp();


    }
}
