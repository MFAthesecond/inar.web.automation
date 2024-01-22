package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Events_Page extends BasePage {

    @FindBy(id = "draggable12")
    private WebElement draggable;
    @FindBy(css = "li:nth-child(1) > span.count")
    private WebElement startInvokedNumber;
    @FindBy(css = "li:nth-child(2) > span.count")
    private WebElement dragInvokedNumber;
    @FindBy(css = "li:nth-child(3) > span.count")
    private WebElement stopInvokedNumber;

    public void dragAndDropByOffSetsForTheGivenTimes(int x, int y, int times) {
        for (int i = 0; i < times; i++) {
            //to keep draggable item in the zone
            x *= -1;
            y *= -1;
            actions.dragAndDropBy(draggable, x, y);
        }
    }

    public int getStartInvokedNumber() {
        return (Integer.valueOf(startInvokedNumber.getText()));
    }

    public int getDragInvokedNumber() {
        return (Integer.valueOf(dragInvokedNumber.getText()));
    }

    public int getStopInvokedNumber() {
        return (Integer.valueOf(stopInvokedNumber.getText()));
    }


}



