import java.util.Dictionary;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v128.v128CdpInfo;

public class HomePageTest{
    private WebDriver webDriver;

    @BeforeEach
    public void beforeTest(){
        webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(utilities.Dictionary.HOME_PAGE_URL);
    }

    @Test
    public void verifyPageTitleIsCorrect(){
        String actualTitle=webDriver.getTitle();
        Assertions.assertEquals(actualTitle, utilities.Dictionary.HOME_PAGE_TITLE);
    }

    @Test
    public void verifyOpenComplicatedPage(){
        String actualTitle=webDriver.getTitle();
    }

    @AfterEach
    public void afterTest(){
        if(webDriver!=null){
            webDriver.quit();
        }
    }
}