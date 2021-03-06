package pages.telecomunications;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.base.BasePage;

import javax.swing.*;

public class MobilePhoneReplenishmentPage extends BasePage {


    public MobilePhoneReplenishmentPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonWallet = By.xpath("//*[@id=\"app\"]/div[2]/section/div/div[1]/div[2]/div[1]/div/form/div[4]/div/div[1]/div[2]/div/div[1]");
    private final By inputCardFrom = By.xpath("//input[@data-qa-node='numberdebitSource']");
    private final By inputAmount = By.xpath("//input[@data-qa-node='amount']");
    private final By buttonSubmitToTheCart = By.xpath("//button[@data-qa-node='submit']");
    private final By inputFirstName = By.xpath("//input[@data-qa-node='firstNamedebitSource']");
    private final By inputLastName = By.xpath("//input[@data-qa-node='lastNamedebitSource']");


    private final By inputCardExpDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
    private final By inputCardCVV = By.xpath("//input[@data-qa-node='cvvdebitSource']");
    private final By inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
    private final By paymentDetails = By.xpath("//div[@data-qa-node='details']");

    /**
     * Choose a card from the wallet
     */
    public MobilePhoneReplenishmentPage selectChooseCardFromWallet() {
        driver.findElement(buttonWallet).click();
        return this;
    }


    public MobilePhoneReplenishmentPage enterPhoneNumber(String number) {
        driver.findElement(inputPhoneNumber).sendKeys(number);
        return this;
    }

    public MobilePhoneReplenishmentPage enterAmount(String amount) {
        driver.findElement(inputAmount).sendKeys(amount);
        return this;
    }
    public MobilePhoneReplenishmentPage enterCardFrom(String card) {
        driver.findElement(inputCardFrom).sendKeys(card);
        return this;
    }
    public MobilePhoneReplenishmentPage enterCardExpDate(String expDate) {
        driver.findElement(inputCardExpDate).sendKeys(expDate);
        return this;
    }
    public MobilePhoneReplenishmentPage enterCardCVV(String cvv) {
        driver.findElement(inputCardCVV).sendKeys(cvv);
        return this;
    }
    public MobilePhoneReplenishmentPage enterFirstName(String firstName){
        driver.findElement(inputFirstName).sendKeys(firstName);
        return this;
    }
    public MobilePhoneReplenishmentPage enterLastName(String lastName){
        driver.findElement(inputLastName).sendKeys(lastName);
        return this;
    }
    public MobilePhoneReplenishmentPage submitToTheCart(){
       driver.findElement(buttonSubmitToTheCart).click();
        return this;
    }

    public MobilePhoneReplenishmentPage addWait (){
        WebElement wait = driver.findElement(inputFirstName);
        waitElementIsVisible(wait);
        waitElementIsVisible(driver.findElement(inputFirstName));
        return this;
    }

    public MobilePhoneReplenishmentPage checkPaymentDetailsIsPresentCart(String text){
        waitElementIsVisible(driver.findElement(paymentDetails));
        WebElement details = driver.findElement(paymentDetails);
        Assertions.assertEquals(text, details.getText());
//        waitElementIsVisible(driver.findElement(paymentDetails));
        return this;
    }

}
