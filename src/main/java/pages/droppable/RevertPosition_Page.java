package pages.droppable;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class RevertPosition_Page extends BasePage {
    @FindBy(css = "#draggable-revert-draggable")
    WebElement dropReverter;

    @FindBy(css = "#draggable2-revert-draggable")
    WebElement nonDropReverter;

    @FindBy(css = "#droppable-revert-draggable")
    WebElement dropArea;

    public Point getDropReverterLocation() {
        return dropReverter.getLocation();

    }
public boolean isDropReverterInsideBox(){
        return isInside(dropReverter);
}
public boolean isNonDropReverterInsideBox(){
        return isInside(nonDropReverter);
}
    private boolean isInside(WebElement innerElement) {
        WebElement outerElement = dropArea;
        // Get the location and size of the outer element
        Point outerElementLocation = outerElement.getLocation();
        Dimension outerElementSize = outerElement.getSize();

        // Get the location of the inner element
        Point innerElementLocation = innerElement.getLocation();

        // Check if the inner element is inside the outer element
        return (innerElementLocation.getX() >= outerElementLocation.getX() &&
                innerElementLocation.getY() >= outerElementLocation.getY() &&
                (innerElementLocation.getX() + innerElement.getSize().getWidth()) <= (outerElementLocation.getX() + outerElementSize.getWidth()) &&
                (innerElementLocation.getY() + innerElement.getSize().getHeight()) <= (outerElementLocation.getY() + outerElementSize.getHeight()));
    }

    public Point getNonDropReverterLocation() {
        return nonDropReverter.getLocation();
    }

    private void dragAndDropOnDropArea(WebElement element) {
        actions.dragAndDrop(element, dropArea).perform();
    }

    private void dragAndDropOnEmptyArea(WebElement element) {
        actions.dragAndDropBy(element, 100, 100).perform();
    }

    public void dragAndDropDropReverterOnEmptyArea() {
        dragAndDropOnEmptyArea(dropReverter);
    }

    public void dragAndDropNonDropReverterOnEmptyArea() {
        dragAndDropOnEmptyArea(nonDropReverter);
    }

    public void dragAndDropDropReverterOnDropArea() {
        dragAndDropOnDropArea(dropReverter);
    }

    public void dragAndDropNonDropReverterOnDropArea() {
        dragAndDropOnDropArea(nonDropReverter);
    }

}
