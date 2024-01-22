package pages.droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Accept_Page extends BasePage {

    @FindBy(css = "#draggable-nonvalid-accept")
    WebElement nonDroppableDraggable;
    @FindBy(css = "#draggable-accept")
    WebElement droppableDraggable;

    @FindBy(css = "#droppable-accept")
    WebElement droppingArea;

    @FindBy(xpath = "//p[contains(text(),\"accept: '#draggable'\")]")
    WebElement textBeforeDrop;

    @FindBy(xpath = "//p[contains(text(),'Dropped!')]")
    WebElement textAfterDrop;

    private void dragAndDropItem(WebElement element) {
        int droppingAreaX = droppingArea.getLocation().getX();
        int droppingAreaY = droppingArea.getLocation().getY();
        actions.dragAndDropBy(element, 100,0).perform();
    }

    public void dragAndDropNonDroppable() {
        dragAndDropItem(nonDroppableDraggable);
    }

    public void dragAndDropDroppable() {
        dragAndDropItem(droppableDraggable);
    }

    public String getTextBeforeDrop() {
        return textBeforeDrop.getText();
    }

    public String getTextAfterDrop() {
        return textAfterDrop.getText();
    }
}
