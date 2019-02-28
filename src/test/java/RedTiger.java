import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedTiger {

    public static void testGames(WebDriver driver) {
        driver.get("https://www.redtiger.com/games");
        driver.manage().window().maximize();


    }

    public static void verifyAge(WebDriver driver) throws InterruptedException {
        driver.findElement(By.name("day-3")).sendKeys("29");
        driver.findElement(By.name("month-3")).sendKeys("09");
        driver.findElement(By.name("year-3")).sendKeys("1984");

        //driver.switchTo().activeElement().sendKeys(Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div[1]/a")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[1]/a")));
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/a")).click();


    }

    public static void piratesPlenty(WebDriver driver) {
        driver.findElement(By.cssSelector("#second-section > div > div > div.w-tab-content > div.w-tab-pane.w--tab-active > div > div > div:nth-child(5) > a > img")).click();

    }
}
