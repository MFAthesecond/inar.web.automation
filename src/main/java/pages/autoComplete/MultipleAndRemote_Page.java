package pages.autoComplete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class MultipleAndRemote_Page extends BasePage {

    @FindBy(id = "tags-multipleremotes")
    private WebElement inputLink;

    @FindBy(xpath = "//span[contains(text(),'Loading suggestions...')]")
    private WebElement loadingMessage;

    @FindBy(xpath = "//ul[@id='ui-id-43']/li/div")
    private List<WebElement> suggestionsList;

    public void clearInputLink() {
        inputLink.clear();
    }

    public void writeKeys(String keys) {
        inputLink.sendKeys(keys);
    }

    public boolean loadingMessageIsVisible() {
        return loadingMessage.isDisplayed();
    }

    public List<String> getSuggestionsList() {
        List<String> suggestionsStringList = new ArrayList<>();
        for (int i = 0; i < suggestionsList.size(); i++) {
            suggestionsStringList.add(suggestionsList.get(i).getText());
        }
        return suggestionsStringList;

        //return suggestionsList.stream().map(WebElement::getText).toList();
    }

    public boolean suggestionIsDisplayed() {
        return !suggestionsList.isEmpty();
    }
}
