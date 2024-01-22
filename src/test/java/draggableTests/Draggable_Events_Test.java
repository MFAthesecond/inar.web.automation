package draggableTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import pages.draggable.Draggable_Page;
import utils.Pages;

public class Draggable_Events_Test extends Hooks {
    Pages pages = new Pages();
    Draggable_Page draggablePage = new Draggable_Page();

    @Test
    public void testEventsDraggable() {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnDraggableLink();
//        draggablePage.getEventsLink();



    }
}
