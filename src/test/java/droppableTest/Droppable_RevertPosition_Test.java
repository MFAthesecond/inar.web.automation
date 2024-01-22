package droppableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.droppable.Droppable_Page;
import utils.Driver;
import utils.Pages;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class Droppable_RevertPosition_Test extends Hooks {
    Pages pages = new Pages();
    Droppable_Page droppablePage = new Droppable_Page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @Test
    public void testRevertPosition_Page() throws InterruptedException {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnDroppableLink();
        droppablePage.clickOnRevertPositionLink();

        ///NODR for Non drop reverter
        ///DR for  drop reverter
        Point NODR_InitialLocation = droppablePage.getRevertPositionPage().getNonDropReverterLocation();
        Point DR_InitialLocation = droppablePage.getRevertPositionPage().getDropReverterLocation();
        droppablePage.getRevertPositionPage().dragAndDropNonDropReverterOnEmptyArea();

        Thread.sleep(500);
        assertEquals(NODR_InitialLocation, droppablePage.getRevertPositionPage().getNonDropReverterLocation());

        droppablePage.getRevertPositionPage().dragAndDropDropReverterOnEmptyArea();
        assertNotEquals(DR_InitialLocation, droppablePage.getRevertPositionPage().getDropReverterLocation());

        Point DR_SecondLocation = droppablePage.getRevertPositionPage().getDropReverterLocation();
        droppablePage.getRevertPositionPage().dragAndDropDropReverterOnDropArea();

        Thread.sleep(500);
        assertEquals(DR_SecondLocation, droppablePage.getRevertPositionPage().getDropReverterLocation());

        droppablePage.getRevertPositionPage().dragAndDropNonDropReverterOnDropArea();
        assertTrue(droppablePage.getRevertPositionPage().isNonDropReverterInsideBox());

    }
}
