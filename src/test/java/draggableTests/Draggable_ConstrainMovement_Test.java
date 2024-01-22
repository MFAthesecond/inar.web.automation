package draggableTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import pages.draggable.Draggable_Page;
import utils.Pages;

import static org.junit.jupiter.api.Assertions.*;

public class Draggable_ConstrainMovement_Test extends Hooks {
    Pages pages = new Pages();
    Draggable_Page draggablePage = new Draggable_Page();

    @Test
    public void testConstrain() throws InterruptedException {
        pages.getHomePage().clickOnWebAutomationLink();

        //2. click on the draggable button
        pages.getWebAutomationPage().clickOnDraggableLink();

        //3. click on the auto scrolling button
        draggablePage.clickOnConstrainMovementLink();

        int initialXofVerticalDraggable = draggablePage.getConstrainMovementPage().getVerticalDraggableX();
        int initialYofHorizontalDraggable = draggablePage.getConstrainMovementPage().getHorizontalDraggableY();

        draggablePage.getConstrainMovementPage().moveVerticalDraggable();
        draggablePage.getConstrainMovementPage().moveHorizontalDraggable();

        int finalXofVerticalDraggable = draggablePage.getConstrainMovementPage().getVerticalDraggableX();
        int finalYofHorizontalDraggable = draggablePage.getConstrainMovementPage().getHorizontalDraggableY();

        assertEquals(finalXofVerticalDraggable, initialXofVerticalDraggable, "Vertical draggable move also horizontal");
        assertEquals(finalYofHorizontalDraggable, initialYofHorizontalDraggable, "Horizontal draggable move also vertical");

        draggablePage.getConstrainMovementPage().moveDraggableAtBigBoxBottomRight();
        assertTrue(draggablePage.getConstrainMovementPage().isInside(draggablePage.getConstrainMovementPage().getDraggableAtBigBox()));

        draggablePage.getConstrainMovementPage().moveDraggableAtBigBoxTopLeft();
        assertTrue(draggablePage.getConstrainMovementPage().isInside(draggablePage.getConstrainMovementPage().getDraggableAtBigBox()));

        draggablePage.getConstrainMovementPage().moveDraggableAtLittleBoxBottomRight();
        assertTrue(draggablePage.getConstrainMovementPage().isInside(draggablePage.getConstrainMovementPage().getDraggableAtLittleBox()));

        draggablePage.getConstrainMovementPage().moveDraggableAtLittleBoxTopLeft();
        assertTrue(draggablePage.getConstrainMovementPage().isInside(draggablePage.getConstrainMovementPage().getDraggableAtLittleBox()));


    }
}
