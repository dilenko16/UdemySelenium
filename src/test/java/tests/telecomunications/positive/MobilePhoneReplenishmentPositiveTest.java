package tests.telecomunications.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.MobileReplenishmentTestData.*;
import static constants.Constant.Urls.MOBILE_PHONE_URL;

public class MobilePhoneReplenishmentPositiveTest extends BaseTest {

    @Test
    public void checkIsRedirectToAuth() {
        basePage.gotoUrl(MOBILE_PHONE_URL);
        mobilePhoneReplenishmentPage.selectChooseCardFromWallet();
        basePage.isAuthWidgetPresent();
    }

    @Test
    public void checkMinimumReplenishmentAmount() {
        basePage.gotoUrl(MOBILE_PHONE_URL);
        mobilePhoneReplenishmentPage
                .enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .enterAmount("100")
                .enterCardFrom(MOBILE_PAYMENT_CARD)
                .enterCardExpDate(MOBILE_PAYMENT_CARD_EXP_DATE)
                .enterCardCVV(MOBILE_PAYMENT_CARD_CVV)
                .enterFirstName(FIRST_NAME)
                .enterLastName(LAST_NAME)
                .submitToTheCart()
                .checkPaymentDetailsIsPresentCart("1Mobile payment. Phone number +380686979712");


    }
}
