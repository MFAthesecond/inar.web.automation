package droppableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import pages.droppable.Droppable_Page;
import utils.Pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Droppable_Accept_Test extends Hooks {
    Pages pages = new Pages();
    Droppable_Page droppablePage = new Droppable_Page();

    @Test
    public void testActionsPage() {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnDroppableLink();
        droppablePage.clickOnAcceptLink();

        droppablePage.getAcceptPage().dragAndDropNonDroppable();
        assertEquals("accept: '#draggable'", droppablePage.getAcceptPage().getTextBeforeDrop(), "function broken");

        droppablePage.getAcceptPage().dragAndDropDroppable();
        assertEquals("Dropped!", droppablePage.getAcceptPage().getTextAfterDrop(), "function broken");



    }
}
