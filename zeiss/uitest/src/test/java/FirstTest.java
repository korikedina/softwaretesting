import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    WebDriver webDriver;

    @Test
    public void firstTest(){
        webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://ultimateqa.com/filling-out-forms/");
        String actualTitle=webDriver.getTitle();
        System.out.println(actualTitle);
        Assertions.assertEquals("Filling Out Forms - Ultimate QA", actualTitle);
        webDriver.quit();
    }
}
