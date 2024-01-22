package pages.accordion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class CollapseContent extends BasePage {
    @FindBy(css = "#ui-id-11 > span")
    WebElement thirdAccordion;

    @FindBy(css = "#ui-id-12")
    WebElement message;

    public boolean getStatus() {
        return message.isDisplayed();
    }

    public void clickOnThirdAccordion() {
        thirdAccordion.click();
    }
}
