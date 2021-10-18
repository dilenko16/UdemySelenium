package tests.loans.positive;
import org.junit.jupiter.api.Test;

import tests.base.BaseTest;

import static constants.Constant.Urls.CAR_LOANS_URL;

public class CarLoansPositiveTest extends BaseTest {

    @Test
    public void selectAgreementTabPublicSession(){
        basePage.gotoUrl(CAR_LOANS_URL);
        carLoansPage.selectAgreementsTab();
        basePage.isAuthWidgetPresent();

    }
}
