package AutoCompleteTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.Pages;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AutoComplete_MultipleAndRemote_Test extends Hooks {
    @Test
    public void testAutoComplete() {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickAutoCompleteLink();
        pages.getWebAutomationPage().clickMultipleAndRemote();

        pages.getMultipleAndRemotePage().writeKeys("s");
        assertFalse(pages.getMultipleAndRemotePage().suggestionIsDisplayed(), "it should not be displayed");

        pages.getMultipleAndRemotePage().clearInputLink();

        pages.getMultipleAndRemotePage().writeKeys("sp");
        assertTrue(pages.getMultipleAndRemotePage().loadingMessageIsVisible(), "it should be displayed");

        assertTrue(pages.getMultipleAndRemotePage().suggestionIsDisplayed(), "it should be displayed");

        List<String> suggestions = pages.getMultipleAndRemotePage().getSuggestionsList();

        boolean flag = true;
        for (int i = 0; i < suggestions.size(); i++) {
            if (!suggestions.get(i).toLowerCase().startsWith("sp")) {
                flag = false;
                break;
            }
        }
        assertTrue(flag,"suggestions does not start with sp");
    }
}
