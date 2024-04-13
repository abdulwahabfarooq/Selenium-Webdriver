import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // System.getProperty("webdriver.chrome.driver",
        // "C:\\Users\\abdul\\OneDrive\\Desktop\\Selenium-Java\\MyFirst\src");
        // WebDriver driver = new ChromeDriver();
        // driver.get("https://www.google.com");
        // System.out.println(driver.getTitle());
        // Thread.sleep(1000);
        // driver.quit();

        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://www.google.com");
        // Thread.sleep(4000);
        // driver2.quit();
        WebElement element = driver2.findElement(By
                .xpath("/html/body/div[2]/div[3]/div[3]/span/div/div/div/div[3]/div[1]/button[2]/div"));
        element.click();

        // Search Abdul Wahab Linkedin
        WebElement searchInput = driver2.findElement(By
                .name("q"));
        searchInput.sendKeys("Abdul Wahab Linkedin Valencia Spain");
        searchInput.submit();

        WebElement LinkedinElement = driver2.findElement(By
                .xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/span/a/h3"));
        LinkedinElement.click();
        WebElement closeButton = driver2.findElement(By
                .xpath("//*[@id=\"public_profile_contextual-sign-in\"]/div/section/button"));
        closeButton.click();

        // Scroll down the window
        JavascriptExecutor js = (JavascriptExecutor) driver2;
        js.executeScript("window.scrollBy(0,5000)"); // numeric values are pixels

        driver2.quit();
    }
}
