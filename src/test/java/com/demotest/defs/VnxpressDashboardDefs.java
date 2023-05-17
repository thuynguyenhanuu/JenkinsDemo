package com.demotest.defs;


import com.demotest.steps.VnxpressDasboardSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class VnxpressDashboardDefs {
    @Steps
    VnxpressDasboardSteps vnxpressSteps;


    @When("^user click on button dan sinh$")
    public void clickBtnDanSinh() {
        vnxpressSteps.clickBtnDansinh();
    }

    @When("^user click on button thoi su$")
    public void clickBtnThoiSu() {
        vnxpressSteps.clickBtnThoiSu();
    }

    @When("^open web vnxpress$")
    public void searchTour() {
        System.out.println("This is the first step");
        vnxpressSteps.openVnxress();
    }

    @When("^user click on button chinh tri$")
    public void clickBtnChinhTri() {
        vnxpressSteps.clickBtnChinhTri();
    }

    @When("^user search data with keyword$")
    public void search(DataTable dt) {
        vnxpressSteps.searchKeyword(dt);
    }

    @When("^user call session at step search$")
    public void testSession() {
        vnxpressSteps.testSession();
    }
}
