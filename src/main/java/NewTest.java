import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class NewTest {

    public static void main (String[] args) {
      //  NewTest myNewMethod = new NewTest();
      //  myNewMethod.myNewMethod();

    }
@Test
  public  void myNewMethod() {

        //setting the driver executable
        System.setProperty("webdriver.chrome.driver", "src/main/chromedriver.exe");

//Initiating your chromedriver
        WebDriver driver = new ChromeDriver();

//Applied wait time
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//maximize window
        driver.manage().window().maximize();

//open browser with desried URL
        driver.get("https://www.google.com");
        WebElement inputField = driver.findElement(By.name("q"));
        inputField.sendKeys("привет Алена!");
        inputField.submit();

//closing the browser
        driver.quit();
      //  driver.close();
    }
}
