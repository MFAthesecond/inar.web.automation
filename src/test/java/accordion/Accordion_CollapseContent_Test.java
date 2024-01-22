package accordion;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import pages.accordion.Accordion_Page;
import pages.sortable.SortablePage;
import utils.Pages;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Accordion_CollapseContent_Test extends Hooks {
    Pages pages = new Pages();
    Accordion_Page accordionPage = new Accordion_Page();

    @Test
    public void CollapseContentTest() throws InterruptedException {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnAccordionLink();
        accordionPage.clickOnCollapseContentLink();

        boolean initialStatus = accordionPage.getCollapseContentPage().getStatus();
        Thread.sleep(500);
        accordionPage.getCollapseContentPage().clickOnThirdAccordion();
        boolean finalStatus = accordionPage.getCollapseContentPage().getStatus();

        assertFalse(initialStatus, "problem");
        assertTrue(finalStatus, "problem");
    }
}
