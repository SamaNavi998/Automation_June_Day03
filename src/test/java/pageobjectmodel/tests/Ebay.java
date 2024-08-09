package pageobjectmodel.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobjectmodel.pages.PageBase;
import pageobjectmodel.pages.PageEbayHome;
import pageobjectmodel.pages.PageMobileResults;
import pageobjectmodel.utils.TestNGUtil;


public class Ebay extends TestNGUtil{

    @Test
    public void searchMobile() throws InterruptedException {
        PageBase pageBase = PageFactory.initElements(driver, PageBase.class);
        PageEbayHome pageEbayHome = pageBase.initApp("https://www.ebay.com/");
        pageEbayHome.typeOnSearchField("mobile phone");
        pageEbayHome.selectCategory("Cell Phones & Accessories");
        PageMobileResults pageMobileResults = pageEbayHome.clickOnSearchButton();
        pageMobileResults.scroll(0, 200);
        pageMobileResults.clickOnAppleCheckBox();
        Thread.sleep(3000);
    }
}
