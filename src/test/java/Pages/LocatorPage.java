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

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement Register_Button;

    @FindBy(css = "[name='customer.firstName']")
    public WebElement First_name;

    @FindBy(css = "[name='customer.lastName']")
    public WebElement Last_name;

    @FindBy(css = "[name='customer.address.street']")
    public WebElement Adress;

    @FindBy(css = "[name='customer.address.city']")
    public WebElement City;

    @FindBy(css = "[name='customer.address.state']")
    public WebElement State;

    @FindBy(css = "[name='customer.address.zipCode']")
    public WebElement ZipCode;

    @FindBy(css = "[name='customer.phoneNumber']")
    public WebElement Phone;

    @FindBy(css = "[name='customer.ssn']")
    public WebElement SSN;

    @FindBy(css = "[name='customer.username']")
    public WebElement Username;

    @FindBy(css = "[name='customer.password']")
    public WebElement Password;

    @FindBy(css = "[name='repeatedPassword']")
    public WebElement Confirm;

    @FindBy(css = "[value='Register']")
    public WebElement RegisterButton2;

    @FindBy(xpath = "//*[contains(text(),'successfully')]")
    public WebElement Succesfully;

    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "Username": return Username;
            case "Password": return Password;

        }
        return null;
    }

}