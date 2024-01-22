package pages.resizable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;

public class ResizableUtils extends BasePage {

    static void resizeFromBottom(WebElement element, int yOffSet) {
        actions.dragAndDropBy(element, 0, yOffSet).perform();
    }

    static void resizeFromRight(WebElement element, int xOffSet) {
        actions.dragAndDropBy(element, xOffSet, 0).perform();
    }

    static public void resizeFromBottomRightCorner(WebElement element, int xOffSet, int yOffSet) {
        actions.dragAndDropBy(element, xOffSet, yOffSet).perform();
    }
}
