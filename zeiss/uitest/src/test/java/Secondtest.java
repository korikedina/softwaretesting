import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.uitest.FormPage;

public class Secondtest {
    WebDriver webDriver;
    FormPage formpage;

    @BeforeEach
    public void beforeTest(){
        webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://ultimateqa.com/filling-out-forms/");
    }

    @Test
    public void verifyPageTitleIsCorrect(){
        String actualTitle=webDriver.getTitle();
        System.out.println(actualTitle);
        Assertions.assertEquals("Filling Out Forms - Ultimate QA", actualTitle);
    }

    @Test
    public void verifyNameInputExists(){
        WebElement nameInput=webDriver.findElement(By.id("et_pb_contact_name_0"));
        assertTrue(nameInput.isDisplayed());
    }

    @Test
    public void verifySubmitButtonExists(){
        WebElement submitButton1=webDriver.findElement(By.xpath("//*[@id=\"et_pb_contact_form_0\"]/div[2]/form/div/button"));
        assertTrue(submitButton1.isDisplayed());
    }

    @Test
    public void successfulMsgSent(){
        WebElement nameInput=webDriver.findElement(By.id("et_pb_contact_name_0"));
        WebElement msgInput=webDriver.findElement(By.id("et_pb_contact_message_0"));
        WebElement submitButton1=webDriver.findElement(By.xpath("//*[@id=\"et_pb_contact_form_0\"]/div[2]/form/div/button"));


        formpage.fillNameInput("Alga Aladár");
        msgInput.sendKeys("Kristóf nem tud németül");
        submitButton1.click();

        WebDriverWait wait=new WebDriverWait(webDriver, Duration.ofSeconds(5));

        WebElement expected=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div/article/div/div/div/div/div[2]/div[1]/div")));
        assertTrue(expected.isDisplayed());
    }

    @AfterEach
    public void afterTest(){
        if (webDriver!= null) webDriver.quit();
    }

}

