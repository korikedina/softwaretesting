package pageobjectmodel.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    
    public BasePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public abstract Boolean isPageLoaded();
}
