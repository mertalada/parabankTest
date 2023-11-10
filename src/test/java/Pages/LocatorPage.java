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

    @FindBy(css = "input[type='text']")
    public WebElement loginUser;

    @FindBy(css = "input[type='password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//a[text()='Open New Account']")
    public WebElement openNewAccount;

    @FindBy(xpath = "(//p/b)[3]")
    public WebElement depositedText;

    @FindBy(css = "input[value='Open New Account']")
    public WebElement createNewAccount;

    @FindBy(css = "[class='title']")
    public WebElement accountText;

    @FindBy(xpath = "(//p/b)[2]")
    public WebElement newAccountText;

    @FindBy(linkText = "Accounts Overview")
    public WebElement accountOverview;

    @FindBy(xpath = "//tr[@class='ng-scope'] // a")
    public WebElement account1;

    @FindBy(linkText = "Transfer Funds")
    public WebElement transferFunds;

    @FindBy(id = "amount")
    public WebElement amountToTransfer;

    @FindBy(css = "input[value='Transfer']")
    public WebElement transfer;


    @FindBy(xpath = "//h1[text()='Transfer Complete!']")
    public WebElement transferCompleteText;


    @FindBy(linkText = "Register")
    public WebElement registerButton;

    @FindBy(css = "[id='customer.firstName']")
    public WebElement firstName;

    @FindBy(css = "[id='customer.lastName']")
    public WebElement lastName;

    @FindBy(css = "[id='customer.address.street']")
    public WebElement address;

    @FindBy(css = "[id='customer.address.city']")
    public WebElement city;

    @FindBy(css = "[id='customer.address.state']")
    public WebElement state;

    @FindBy(css = "[id='customer.address.zipCode']")
    public WebElement zipCode;

    @FindBy(css = "[id='customer.phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(css = "[id='customer.ssn']")
    public WebElement ssn;

    @FindBy(css = "[id='customer.username']")
    public WebElement userName;

    @FindBy(css = "[id='customer.password']")
    public WebElement password;

    @FindBy(css = "[id='repeatedPassword']")
    public WebElement passwordConfirm;

    @FindBy(css = "input[value='Register']")
    public WebElement submitButton;

    @FindBy(css = "div[id='rightPanel'] > p")
    public WebElement successMessage;

    @FindBy(linkText = "Request Loan")
    public WebElement requestLoanButton;

    @FindBy(id = "amount")
    public WebElement loanAmount;

    @FindBy(id = "downPayment")
    public WebElement downPayment;

    @FindBy(id = "fromAccountId")
    public WebElement fromAccountId;

    @FindBy(css = "input[value='Apply Now']")
    public WebElement applyNowButton;

    @FindBy(id = "loanStatus")
    public WebElement loanStatus;

    @FindBy(css = "div[class='ng-scope'] > p")
    public WebElement approvedMessage;

    @FindBy(id = "newAccountId")
    public WebElement newAccountId;

    @FindBy(id = "accountType")
    public WebElement accountType;

    @FindBy(id = "balance")
    public WebElement balance;

    @FindBy(id = "availableBalance")
    public WebElement availableBalance;

    @FindBy(css = "p[class='ng-scope'] > b")
    public WebElement transactionMessage;

    @FindBy(css = "input[value='Find My Login Info']")
    public WebElement findMyInfoButton;

    @FindBy(css = "div[id='rightPanel'] > p")
    public WebElement loggedInMessage;

    @FindBy(css = "[type='submit']")
    public WebElement logInButton;

    @FindBy(linkText = "Bill Pay")
    public WebElement billPayButton;

    @FindBy(name = "payee.name")
    public WebElement payeeName;

    @FindBy(name = "payee.address.street")
    public WebElement address2;

    @FindBy(name = "payee.address.city")
    public WebElement city2;

    @FindBy(name = "payee.address.state")
    public WebElement state2;

    @FindBy(name = "payee.accountNumber")
    public WebElement account;

    @FindBy(name = "payee.address.zipCode")
    public WebElement zipcode;

    @FindBy(name = "verifyAccount")
    public WebElement verifyAcc;

    @FindBy(name = "amount")
    public WebElement amount;

    @FindBy(name = "payee.phoneNumber")
    public WebElement phone;

    @FindBy(css = "[value='Send Payment']")
    public WebElement sendPayment;

    @FindBy(xpath = "//h1[@class='title' and text()='Bill Payment Complete']")
    public WebElement confrim;

    @FindBy(css = "[id='amount']")
    public WebElement amountPrice;

    @FindBy(xpath = "//*[@ng-repeat='account in accounts']/*/*")
    public WebElement accountAcc;

    @FindBy(xpath = "(//*[@class='ng-binding ng-scope'])[1]")
    public WebElement priceElectriCity;

    @FindBy(xpath = "(//a[@class='ng-binding'])[1]")
    public WebElement electricityBill;

    @FindBy(xpath = "(//a[@class='ng-binding'])[2]")
    public WebElement waterBill;

    @FindBy(xpath = "(//*[@class='ng-binding ng-scope'])[2]")
    public WebElement priceWaterBill;

    @FindBy(xpath = "(//*[@class='ng-binding ng-scope'])[3]")
    public WebElement priceGas;

    @FindBy(xpath = "(//a[@class='ng-binding'])[3]")
    public WebElement priceGasBill;

    @FindBy(linkText = "Update Contact Info")
    public WebElement uptadeContact;

    @FindBy(id = "customer.firstName")
    public WebElement customerName;

    @FindBy(name = "customer.lastName")
    public WebElement customerLastname;

    @FindBy(name = "customer.address.street")
    public WebElement customerAddress;

    @FindBy(name = "customer.address.city")
    public WebElement customerCity;

    @FindBy(name = "customer.address.state")
    public WebElement customerState;

    @FindBy(name = "customer.address.zipCode")
    public WebElement customerZipcode;

    @FindBy(name = "customer.phoneNumber")
    public WebElement customerPhone;

    @FindBy(css = "[value='Update Profile']")
    public WebElement updateButton;

    @FindBy(css = "div h1")
    public WebElement updateMessage;

    @FindBy(linkText = "Log Out")
    public WebElement logout;

    @FindBy(xpath = "//span[@class='error ng-scope' and text()='First name is required.']")
    public WebElement errorMessage;

    public WebElement getElement(String element) {

        switch (element) {

            case "firstName":
                return this.firstName;
            case "lastName":
                return this.lastName;
            case "address":
                return this.address;
            case "city":
                return this.city;
            case "state":
                return this.state;
            case "zipCode":
                return this.zipCode;
            case "phoneNumber":
                return this.phoneNumber;
            case "ssn":
                return this.ssn;
            case "userName":
                return this.userName;
            case "password":
                return this.password;
            case "passwordConfirm":
                return this.passwordConfirm;
            case "logInButton":
                return logInButton;
            case "billPayButton":
                return billPayButton;
            case "payeeName":
                return payeeName;
            case "address2":
                return address2;
            case "city2":
                return city2;
            case "state2":
                return state2;
            case "zipcode":
                return zipcode;
            case "account":
                return account;
            case "verifyAcc":
                return verifyAcc;
            case "amount":
                return amount;
            case "phone":
                return phone;
            case "sendPayment":
                return sendPayment;
            case "priceElectriCity":
                return priceElectriCity;
            case "amountPrice":
                return amountPrice;
            case "accountOverview":
                return accountOverview;
            case "accountAcc":
                return accountAcc;
            case "electricityBill":
                return electricityBill;
            case "priceGasBill":
                return priceGasBill;
            case "customerName":
                return customerName;
            case "customerLastname":
                return customerLastname;
            case "customerAddress":
                return customerAddress;
            case "customerCity":
                return customerCity;
            case "customerState":
                return customerState;
            case "customerZipcode":
                return customerZipcode;
            case "customerPhone":
                return customerPhone;
            case "updateButton":
                return updateButton;
            case "logout":
                return logout;
            case "loginUser":
                return loginUser;
            case "loginPassword":
                return loginPassword;
        }
        return null;
    }
}