package com.demotest.pages;

import com.demotest.common.BasePage;
import cucumber.api.DataTable;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.Map;


public class VnxrpressDashboardPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Thời sự')]")
    WebElementFacade thoiSuMenu;

    @FindBy(xpath = "(//a[@title = 'Chính trị'])[3]")
    WebElementFacade chinhTriMenu;

    @FindBy(xpath = "//a[contains(text(),'Dân sinh')]")
    WebElementFacade danSinhMenu;

    @FindBy(xpath = "//input[@id='keywordHeader']")
    WebElementFacade searchInput;

    public void clickBtnThoiSu() {
        thoiSuMenu.waitUntilPresent().click();
    }

    public void clickBtnDansinh() {
        danSinhMenu.waitUntilPresent().click();
    }

    public void openVnxress() {
        open();
    }

    public void clickBtnChinhTri() {
        chinhTriMenu.waitUntilPresent().click();
    }

    public void searchKeyword(DataTable dt) {
        List<Map<String, String>> list = dt.asMaps(String.class, String.class);
        searchInput.sendKeys("value");
        for (Map<String, String> row : list) {
            String value = row.get("search");
            searchInput.sendKeys(value);
        }
        Serenity.setSessionVariable("userName").to("Lay duoc gia tri rou nha");
        Serenity.recordReportData().withTitle("UserName session").andContents(Serenity.sessionVariableCalled("userName"));
    }

    public void testSession() {
        String a = Serenity.sessionVariableCalled("userName");
        Serenity.recordReportData().withTitle("call data session at Test session:: ").andContents(a);
    }
}
