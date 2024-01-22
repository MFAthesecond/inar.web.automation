package pages.sortable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class DisplayAsGrid_Page extends BasePage {
    @FindBy(css = "#sortable-disp-as-grid > li:nth-child(1)")
    WebElement firstItem;
    @FindBy(css = "#sortable-disp-as-grid > li:nth-child(2)")
    WebElement secondItem;

    public String getText1() {
        return firstItem.getText();
    }

    public String getText2() {
        return secondItem.getText();
    }

    public void moveSecondToFirst() {
        actions.dragAndDrop(secondItem, firstItem).perform();
    }

}
