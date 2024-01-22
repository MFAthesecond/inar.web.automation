package resizableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import pages.resizable.Resizable_Page;
import utils.Pages;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SynchronousResize_Test extends Hooks {

    Pages pages=new Pages();
    Resizable_Page resizablePage=new Resizable_Page();

    @Test
    public void testSynchronousResize(){
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnResizableLink();
        resizablePage.clickOnSynchronousResizeLink();

        resizablePage.getSynchronousResizePage().computeRatio();

        resizablePage.getSynchronousResizePage().resizeViaBottomHandle(25);
        assertTrue(resizablePage.getSynchronousResizePage().compareSizes(),"SynchronousResize does not  work properly");

        resizablePage.getSynchronousResizePage().resizeViaRightHandle(25);
        assertTrue(resizablePage.getSynchronousResizePage().compareSizes(),"SynchronousResize does not  work properly");

        resizablePage.getSynchronousResizePage().resizeViaBottomRightCornerHandle(25,25);
        assertTrue(resizablePage.getSynchronousResizePage().compareSizes(),"SynchronousResize does not  work properly");
    }
}
