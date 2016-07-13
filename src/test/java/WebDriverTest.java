import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {
    @Test
    public void RegistrationLinkedin() throws InterruptedException {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://ru.linkedin.com/");
        driver.findElement(By.id("first-name")).sendKeys("Test");
        driver.findElement(By.id("last-name")). sendKeys("Tester");
        driver.findElement(By.id("join-email")). sendKeys("test@gmail.com");
        driver.findElement(By.id("join-password")). sendKeys("123456");
        driver.findElement(By.xpath("//span[@class='fill-v2']")).click();
        try {
            driver.findElement(By.xpath("//div[@class='uno-alert error hidden']"));
        } catch (Exception E) {
          assert(false);
        }
        Thread.sleep(10000);
        driver.quit();
    }
   }
