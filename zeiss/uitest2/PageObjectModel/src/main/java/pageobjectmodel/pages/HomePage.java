package pageobjectmodel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.Dictionary;

public class HomePage extends BasePage {
    @FindBy(xpath=Dictionary.HOME_PAGE_HEADING_XPATH)
    private WebElement heading;

    public HomePage(WebDriver driver){
        super(driver);
    }

    @Override
    public Boolean isPageLoaded() {
        heading=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Dictionary.HOME_PAGE_HEADING_XPATH)));
        return heading.isDisplayed();
    }

    
}
