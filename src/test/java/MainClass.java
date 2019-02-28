import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

    public static WebDriver driver;

    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "/home/claudiu/TestSample/resources/chromedriver");

    }

    public static void launchApp() throws InterruptedException {
        driver = new ChromeDriver();
        RedTiger redTiger = new RedTiger();
        RedTiger.testGames(driver);
        RedTiger.verifyAge(driver);

    }


    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        launchApp();
        /**driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.name("proceed")).click();

        Alert alert =driver.switchTo().alert();
        System.out.println(alert.getText());

        alert.accept();*/



    }
}
