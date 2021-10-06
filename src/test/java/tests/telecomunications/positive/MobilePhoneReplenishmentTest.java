package tests.telecomunications.positive;

import org.junit.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.MOBILE_PHONE_URL;

public class MobilePhoneReplenishmentTest extends BaseTest {

    @Test
    public void checkIsRedirectToAuth(){
        basePage.gotoUrl(MOBILE_PHONE_URL);
    }


}
