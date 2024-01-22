package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ConstrainMovement_Page extends BasePage {
    @FindBy(id = "draggable5")
    WebElement verticalDraggable;
    @FindBy(id = "draggable6")
    WebElement horizontalDraggable;
    @FindBy(id = "containment-wrapper")
    WebElement bigBox;

    public WebElement getVerticalDraggable() {
        return verticalDraggable;
    }

    public WebElement getHorizontalDraggable() {
        return horizontalDraggable;
    }

    public WebElement getBigBox() {
        return bigBox;
    }

    public WebElement getDraggableAtBigBox() {
        return draggableAtBigBox;
    }

    public WebElement getDraggableAtLittleBox() {
        return draggableAtLittleBox;
    }

    public WebElement getLittleContainerBox() {
        return littleContainerBox;
    }

    @FindBy(css = "#draggable7")
    WebElement draggableAtBigBox;

    @FindBy(id = "draggable8")
    WebElement draggableAtLittleBox;

    @FindBy(css = "div:nth-child(5) > div.align-items-center:nth-child(2)")
    WebElement littleContainerBox;

    public void moveVerticalDraggable() {
        actions.dragAndDropBy(verticalDraggable, 40, 40).perform();
    }

    public void moveHorizontalDraggable() {
        actions.dragAndDropBy(horizontalDraggable, 40, 40).perform();
    }

    public int getVerticalDraggableX() {
        return verticalDraggable.getLocation().getX();
    }

    public int getHorizontalDraggableY() {
        return horizontalDraggable.getLocation().getY();
    }


    public int getDraggableAtBigBoxX() {
        return draggableAtBigBox.getLocation().getX();
    }

    public int getDraggableAtBigBoxY() {
        return draggableAtBigBox.getLocation().getY();
    }

    public int getDraggableAtLittleBoxX() {
        return draggableAtLittleBox.getLocation().getX();
    }

    public int getDraggableAtLittleBoxY() {
        return draggableAtLittleBox.getLocation().getY();
    }

    public int getLittleBoxX() {
        return draggableAtLittleBox.getLocation().getX();
    }

    public int getLittleBoxY() {
        return littleContainerBox.getLocation().getY();
    }

    public int getBigBoxX() {
        return bigBox.getLocation().getX();
    }

    public int getBigBoxY() {
        return bigBox.getLocation().getY();
    }

    public void moveDraggableAtBigBoxTopLeft() {
        actions.dragAndDropBy(draggableAtBigBox, -200, -200).perform();
    }

    public void moveDraggableAtBigBoxBottomRight() {
        actions.dragAndDropBy(draggableAtBigBox, 800, 200).perform();
    }


    public void moveDraggableAtLittleBoxTopLeft() {
        actions.dragAndDropBy(draggableAtLittleBox, -200, -200).perform();
    }

    public void moveDraggableAtLittleBoxBottomRight() {
        actions.dragAndDropBy(draggableAtLittleBox, 200, 200).perform();
    }

    public boolean isInside(WebElement draggable) {
        if (draggable.equals(draggableAtBigBox)) {
            if (draggableAtBigBox.getLocation().getX() < bigBox.getLocation().getX())
                return false;
            if (draggableAtBigBox.getLocation().getY() < bigBox.getLocation().getY())
                return false;
        }
        if (draggable.equals(draggableAtLittleBox)) {
            if (draggableAtLittleBox.getLocation().getX() < littleContainerBox.getLocation().getX())
                return false;
            if (draggableAtLittleBox.getLocation().getY() < littleContainerBox.getLocation().getY())
                return false;
        }
        return true;
    }
}

