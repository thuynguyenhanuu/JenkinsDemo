package com.demotest.defs;


import com.demotest.pages.VnxrpressLoginPage;
import com.demotest.steps.VnxpressLoginSteps;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class VnxpressLoginDefs {
    @Steps
    VnxpressLoginSteps vnxpressLoginSteps;


    @When("^user click on button dang nhap$")
    public void clickBtnDansinh() throws InterruptedException {
        vnxpressLoginSteps.clickBtnDangNhap();
    }
    @When("^user login web news with email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userLoginUserNameAndPassWord(String username, String pass) {
        vnxpressLoginSteps.userInputEmailAndPass(username, pass);
    }

}
