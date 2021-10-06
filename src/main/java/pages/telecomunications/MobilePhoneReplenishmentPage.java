package pages.telecomunications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MobilePhoneReplenishmentPage extends BasePage {


    public MobilePhoneReplenishmentPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonWallet = By.xpath("//*[@id=\"app\"]/div[2]/section/div/div[1]/div[2]/div[1]/div/form/div[4]/div/div[1]/div[2]/div/div[1]");


    public MobilePhoneReplenishmentPage selectChooseCardFromWallet(){
        driver.findElement(buttonWallet).click();
        return this;
    }
}
