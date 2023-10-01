package StepDefinitions;

import Pages.LocatorPage;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import static Pages.Parent.waiting;

public class AllStepDefinitions extends GWD {

    LocatorPage lc = new LocatorPage();

    @Given("Navigate to URL")
    public void navigateToURL() {
        GWD.getDriver().get("https://para.testar.org/");
    }

    @When("Enter the required information for registration")
    public void enterTheRequiredInformationForRegistration() {

        lc.myClick(lc.Register_Button);
        lc.mySendKeys(lc.First_name,"Sedaaaaaaa");
        lc.mySendKeys(lc.Last_name,"Parcaaa");
        lc.mySendKeys(lc.Adress,"Mahmutbey Yolu");
        lc.mySendKeys(lc.City,"istanbul");
        lc.mySendKeys(lc.State,"Bahcelievler");
        lc.mySendKeys(lc.ZipCode,"34000");
        lc.mySendKeys(lc.Phone,"5350356773");
        lc.mySendKeys(lc.SSN,"111");
        lc.mySendKeys(lc.Username,"sedaaaaaaa");
        lc.mySendKeys(lc.Password,"1234");
        lc.mySendKeys(lc.Confirm,"1234");
        lc.myClick(lc.RegisterButton2);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {

        lc.verifyContainsText(lc.Succesfully,"successfully");


    }


    }

