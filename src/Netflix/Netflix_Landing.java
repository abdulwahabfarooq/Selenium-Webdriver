package Netflix;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Netflix_Landing {
    public static void main(String[] args) {

        // Setting up web driver and getting url
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        // Test case for Accepting cookies
        WebElement cookies = driver.findElement(By
                .id("onetrust-accept-btn-handler"));
        cookies.click();

        // TC: Language change: By default its English
        WebElement dropdownElement = driver.findElement(By
                .xpath(
                        "/html/body/div[1]/div/div/div/div[1]/header/div/div/div[2]/div/div/div[1]/span/div/div/select"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("Español");
        WebElement clickElement = driver.findElement(By
                .xpath("/html/body/div[1]/div/div/div/div[1]/header/div/div/div[2]/div/div/div[1]/span/div/div/select"));
        clickElement.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        // TC: Email input field
        WebElement emailElement = driver.findElement(By
                .name("email"));
        emailElement.sendKeys("abdulwahabfarooq11c@gmail.com");
        WebElement getStartedElement = driver.findElement(By
                .xpath(
                        "/html/body/div[1]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div[1]/form/div/button"));
        getStartedElement.click();
    }
}
