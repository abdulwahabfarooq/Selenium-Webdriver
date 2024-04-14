package Netflix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix_Landing {
    public static void main(String[] args) {

        // Setting up web driver and getting url
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com");

        // Test case for Accepting cookies
        WebElement cookies = driver.findElement(By
                .xpath("/html/body/div[4]/div[2]/div/div[1]/div/div[2]/div/button[3]"));
        cookies.click();

    }
}
