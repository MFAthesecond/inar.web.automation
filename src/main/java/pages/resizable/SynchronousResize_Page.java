package pages.resizable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import static pages.resizable.ResizableUtils.*;

public class SynchronousResize_Page extends BasePage {
    @FindBy(css = "#resizable-synchr-resize")
   private WebElement whiteBox;
    @FindBy(css = "div.ui-widget-header.ui-resizable > div.ui-resizable-handle.ui-resizable-e:nth-child(2)")
    private WebElement whiteBoxRightHandle;

    @FindBy(css = "div.ui-widget-header > div.ui-resizable-handle.ui-resizable-s:nth-child(3)")
    private WebElement whiteBoxBottomHandler;

    @FindBy(css = "div.ui-widget-header > div.ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se:nth-child(4)")
    private WebElement whiteBoxBottomRightHandler;

    @FindBy(css = "#also-synchr-resize")
    WebElement blackSyncBox;
    int heightRatio;
    int widthRatio;

    public void computeRatio() {
        heightRatio = (whiteBox.getSize().getHeight() / blackSyncBox.getSize().getHeight());
        widthRatio = (whiteBox.getSize().getWidth() / blackSyncBox.getSize().getWidth());
    }
    public boolean compareSizes() {
        if ((whiteBox.getSize().getWidth() / blackSyncBox.getSize().getWidth()) == widthRatio) {
            return (whiteBox.getSize().getHeight() / blackSyncBox.getSize().getHeight()) == heightRatio;
        }
        return false;
    }
    public void resizeViaRightHandle(int xOffSet) {
        resizeFromRight(whiteBoxRightHandle, xOffSet);
    }

    public void resizeViaBottomHandle(int yOffSet) {
        resizeFromBottom(whiteBoxBottomHandler, yOffSet);
    }

    public void resizeViaBottomRightCornerHandle(int xOffSet, int yOffSet) {
        resizeFromBottomRightCorner(whiteBoxBottomRightHandler, xOffSet, yOffSet);
    }
}
