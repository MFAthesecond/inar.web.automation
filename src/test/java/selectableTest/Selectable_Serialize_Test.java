package selectableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import pages.selectable.Selectable_Page;
import utils.Pages;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Selectable_Serialize_Test extends Hooks {
    Pages pages=new Pages();
    Selectable_Page selectablePage=new Selectable_Page();

    @Test
    public void testSerializePage() {
    pages.getHomePage().clickOnWebAutomationLink();
    pages.getWebAutomationPage().clickOnSelectableLink();
    selectablePage.clickOnSerializeLink();

    selectablePage.getSerializePage().initialize();
    selectablePage.getSerializePage().selectItem(1);

    assertEquals("#1",selectablePage.getSerializePage().getSelectResult(),"problem");
    }
}
