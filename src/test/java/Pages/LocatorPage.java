package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LocatorPage extends Parent {

    public LocatorPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

   // private şelinde oluşturulmalı itemler
    public WebElement getWebElement(String strElement) {
        return null;
    }
}