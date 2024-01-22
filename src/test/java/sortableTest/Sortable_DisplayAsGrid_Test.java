package sortableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import pages.sortable.SortablePage;
import utils.Pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sortable_DisplayAsGrid_Test extends Hooks {
    Pages pages = new Pages();
    SortablePage sortablePage = new SortablePage();

    @Test
    public void displayAsGridTest() {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnSortableLink();
        sortablePage.clickOnDisplayAsGridLink();

        String initialTextOfFirst = sortablePage.getDisplayAsGridPage().getText1();
        String initialTextOfSecond = sortablePage.getDisplayAsGridPage().getText2();

        sortablePage.getDisplayAsGridPage().moveSecondToFirst();

        String finalTextOfFirst = sortablePage.getDisplayAsGridPage().getText1();
        String finalTextOfSecond = sortablePage.getDisplayAsGridPage().getText2();


        assertEquals(finalTextOfFirst,initialTextOfSecond,"problem");
        assertEquals(initialTextOfFirst,finalTextOfSecond,"problem");
    }

}
