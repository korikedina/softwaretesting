package com.example.uitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {
    private WebDriver webDriver;

    @FindBy(id="et_pb_contact_name_0")
    private WebElement nameInput;

    public FormPage(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(webDriver, this);
    }

    public void fillNameInput(String text){
        nameInput.sendKeys(text);
    }

}
