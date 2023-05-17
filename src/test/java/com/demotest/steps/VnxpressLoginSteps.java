package com.demotest.steps;

import com.demotest.pages.VnxrpressDashboardPage;
import com.demotest.pages.VnxrpressLoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class VnxpressLoginSteps extends ScenarioSteps {
    @Steps
    VnxrpressLoginPage vnxrpressLoginPage;

    @Step
    public void clickBtnDangNhap() throws InterruptedException {
        vnxrpressLoginPage.clickBtnDangNhap();
    }


    @Step
    public void userInputEmailAndPass(String username, String pass) {
        vnxrpressLoginPage.userInputEmailAndPassWeb(username, pass);
        vnxrpressLoginPage.clickLogin();
    }


}
