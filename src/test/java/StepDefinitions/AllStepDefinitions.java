package StepDefinitions;

import Pages.LocatorPage;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class AllStepDefinitions extends GWD {

    LocatorPage lc = new LocatorPage();

    @Given("Navigate to website")
    public void navigateToWebsite() {

        GWD.getDriver().get("https://parabank.parasoft.com/");
    }

    @When("User clicks on register button")
    public void userClicksOnRegisterButton() {

        lc.myClick(lc.registerButton);
    }

    @And("User fills the necessary data")
    public void userFillsTheNecessaryData(DataTable dt) {

        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = lc.getElement(items.get(i).get(0));
            lc.mySendKeys(e, items.get(i).get(1));
        }
        lc.myClick(lc.submitButton);
    }

    @Then("Successful message is displayed")
    public void successfulMessageIsDisplayed() {

        lc.verifyContainsText(lc.successMessage, "success");
    }

    @Given("Navigate to Para Bank")
    public void navigate_to_para_bank() {

        GWD.getDriver().get("https://parabank.parasoft.com/");
    }

    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {

        lc.mySendKeys(lc.loginUser, "TeamDort4");
        lc.mySendKeys(lc.loginPassword, "Testing12");
        lc.myClick(lc.logInButton);
    }

    String priceStr;
    String electricitybillStr;
    String amountStr;
    String waterbillStr;
    String pricewaterbill;
    String pricegasbillStr;
    String pricegasStr;

    @Then("Click")
    public void click(DataTable dt) {

        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement BtnLink = lc.getElement(items.get(i).get(0));
            lc.myClick(BtnLink);
        }
    }

    @Then("SendKeys")
    public void sendkeys(DataTable dt) {

        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = lc.getElement(items.get(i).get(0));
            lc.mySendKeys(e, items.get(i).get(1));
        }
    }

    @Then("Confrim order message")
    public void confrimOrderMessage() {

        lc.verifyContainsText(lc.confrim, "Complete");
        amountStr = lc.amountPrice.getText();
    }

    @And("Click Accountoverview")
    public void clickAccountoverview() {

        lc.myClick(lc.accountOverview);
    }

    @Then("Click Accountacc")
    public void clickAccountacc() {

        lc.myClick(lc.accountAcc);
    }

    @Then("Price Comparison Electricity Bill")
    public void priceComparison() {

        lc.wait.until(ExpectedConditions.visibilityOf(lc.priceElectriCity));
        electricitybillStr = lc.electricityBill.getText();
        priceStr = lc.priceElectriCity.getText();
        Assert.assertTrue(electricitybillStr.contains("EnerjiSA"));
        Assert.assertEquals(amountStr, priceStr);
    }

    @Then("Price Comparison Water Bill")
    public void priceComparisonWaterbill() {

        lc.wait.until(ExpectedConditions.visibilityOf(lc.priceWaterBill));
        waterbillStr = lc.waterBill.getText();
        pricewaterbill = lc.priceWaterBill.getText();
        Assert.assertTrue(waterbillStr.contains("Su Faturasi"));
        Assert.assertEquals(amountStr, pricewaterbill);
    }

    @Then("Price Comparison Natural Gas Bill")
    public void priceComparisonNaturalGasbill() {

        lc.wait.until(ExpectedConditions.visibilityOf(lc.priceGasBill));
        pricegasbillStr = lc.priceGasBill.getText();
        pricegasStr = lc.priceGas.getText();
        Assert.assertTrue(pricegasbillStr.contains("Dogalgaz"));
        Assert.assertEquals(amountStr, pricegasStr);
    }
    @When("User clicked on the menu to create a current or current account")
    public void userClickedOnTheMenuToCreateACurrentOrCurrentAccount() {

        lc.myClick(lc.openNewAccount);
    }

    @Then("User saw minimum starting balance message")
    public void userSawMinimumStartingBalanceMessage() {

        lc.verifyContainsText(lc.depositedText, "A minimum of");
    }

    @Then("User entered the information and clicked on the open new account button")
    public void userEnteredTheInformationAndClickedOnTheOpenNewAccountButton() throws InterruptedException {

        Thread.sleep(1000);
        lc.myClick(lc.createNewAccount);
    }

    @And("User saw confirmation message and new account number")
    public void userSawConfirmationMessageAndNewAccountNumber() {

        lc.verifyContainsText(lc.accountText, "Account Opened!");
        lc.verifyContainsText(lc.newAccountText, "Your new account number");
    }
    @Then("User clicks on account overview")
    public void userClicksOnAccountOverview() {
        lc.myClick(lc.accountOverview);
        lc.myClick(lc.account1);
    }
    @When("User clicks on transfer funds")
    public void userClicksOnTransferFunds() {
        lc.myClick(lc.transferFunds);

    }

    @Then("User fills their info")
    public void userFillsTheirInfo() {
        lc.mySendKeys(lc.amountToTransfer,"100");
    }

    @And("User clicks on transfer button")
    public void userClicksOnTransferButton() {
        lc.myClick(lc.transfer);
    }

    @Then("User gets verify message")
    public void userGetsVerifyMessage() {
        lc.verifyContainsText(lc.transferCompleteText,"Transfer Complete!");
    }
    String cname;

    @When("Should be click update button")
    public void shouldBeClikUpdateButton() {

        lc.myClick(lc.uptadeContact);
    }

    @Then("Should be see uptade message")
    public void shouldBeSeeUptadeMessage() {

        lc.verifyContainsText(lc.updateMessage, "Updated");
    }

    @Then("Checking the entered information")
    public void checkingTheEnteredInformation() {

        lc.wait.until(ExpectedConditions.attributeToBe(lc.customerName, "value", "Team"));
        cname = lc.customerName.getAttribute("value");
        Assert.assertEquals(cname, "Team");
    }

    @Then("Clear firstname,lastName,city")
    public void clearFirstnameLastNameCity() {

        lc.wait.until(ExpectedConditions.visibilityOf(lc.customerName));
        lc.mySendKeys(lc.customerName, "     ");
        lc.wait.until(ExpectedConditions.visibilityOf(lc.customerLastname));
        lc.mySendKeys(lc.customerLastname, "     ");
        lc.wait.until(ExpectedConditions.visibilityOf(lc.customerCity));
        lc.mySendKeys(lc.customerCity, "     ");
        lc.mySendKeys(lc.customerAddress, "Adana");
        lc.mySendKeys(lc.customerState, "Seyhan");
        lc.mySendKeys(lc.customerPhone, "5444444444");
        lc.mySendKeys(lc.customerZipcode, "01000");
    }

    @Then("Should be see errormessage")
    public void shouldBeSeeErrormessage() {

        Assert.assertTrue(lc.errorMessage.getText().contains("required"));
    }
}