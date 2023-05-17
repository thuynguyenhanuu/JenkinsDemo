package com.demotest.steps;

import com.demotest.pages.VnxrpressDashboardPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class VnxpressDasboardSteps extends ScenarioSteps {
    @Steps
    VnxrpressDashboardPage vnxrpressPage;

    @Step
    public void clickBtnDansinh() {
        vnxrpressPage.clickBtnDansinh();
    }

    @Step
    public void clickBtnThoiSu() {
        vnxrpressPage.clickBtnThoiSu();
    }

    @Step
    public void openVnxress() {
        vnxrpressPage.openVnxress();
    }


    @Step
    public void clickBtnChinhTri() {
        vnxrpressPage.clickBtnChinhTri();
    }

    @Step
    public void searchKeyword(DataTable dt) {
        vnxrpressPage.searchKeyword(dt);
    }

    @Step
    public void testSession() {
        vnxrpressPage.testSession();
    }
}
