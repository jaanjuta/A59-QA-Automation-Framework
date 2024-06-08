import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


@Test
public class Homework16 extends BaseTest {
    public void registrationNavigation() {

        //Pre-condition
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");

    WebDriver driver = new ChromeDriver(options);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    //Step 1
    String url = "https://qa.koel.app/";
    driver.get(url);


    //Step 2
     WebElement registrationLink = driver.findElement(By.cssSelector("[href='registration']"));
     registrationLink.click();


    //Step 3
        String registration = "https://qa.koel.app/registration";
        Assert.assertEquals(driver.getCurrentUrl(), registration);


        //Quit Browser
        driver.quit();


    }

}
