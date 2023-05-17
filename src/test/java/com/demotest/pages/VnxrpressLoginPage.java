package com.demotest.pages;

import com.demotest.common.BasePage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.javascript.JavascriptSupport;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class VnxrpressLoginPage extends BasePage {

    @FindBy(xpath = "//a[contains(@title,'Đăng nhập')]")
    WebElementFacade loginMenu;

    @FindBy(id = "myvne_email_input")
    WebElementFacade email;

    @FindBy(id = "myvne_password_input")
    WebElementFacade password;

    @FindBy(id = "myvne_button_login")
    WebElementFacade submit;

    @FindBy(xpath = "//*[contains(@class,'iframe_guest')]")
    WebElementFacade loginFrame;


    public void clickBtnDangNhap() throws InterruptedException {
        waitForCondition().until(ExpectedConditions.elementToBeClickable(loginMenu));
        loginMenu.waitUntilPresent().click();
    }

    public void userInputEmailAndPassWeb(String usernameValue, String passwordValue) {
        waitForAllLoadingCompleted();
        switchToIFrame(loginFrame);
        email.waitUntilPresent().waitUntilEnabled().clear();
        email.sendKeys(usernameValue);
        password.waitUntilPresent().waitUntilEnabled().clear();
        password.sendKeys(passwordValue);
    }

    public void clickLogin() {
        submit.waitUntilPresent();
        submit.waitUntilClickable();
        submit.click();
    }


}
