package pages.resizable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import pages.draggable.Draggable_SnapToGrid_Page;
import pages.resizable.*;

public class Resizable_Page extends BasePage {
    private Animate_Page animatePage;
    private ConstrainResizeArea_Page constrainResizeAreaPage;
    private Helper_Page helperPage;
    private MaxMinSize_Page maxMinSizePage;
    private PreserveAspectRatio_Page preserveAspectRatioPage;
    private Resizable_SnapToGrid_Page snapToGridPage;
    private SynchronousResize_Page synchronousResizePage;
    private Textarea_Page textareaPage;
    private Resizable_VisualFeedback_Page visualFeedbackPage;

    @FindBy(linkText = "Animate")
    private WebElement animateLink;

    @FindBy(linkText = "Constrain resize area")
    private WebElement constrainResizeAreaLink;

    @FindBy(linkText = "Helper")
    private WebElement helperLink;

    @FindBy(linkText = "Maximum / minimum size")
    private WebElement maxMinSizeLink;

    @FindBy(linkText = "Preserve aspect ratio")
    private WebElement preserveAspectRatioLink;

    @FindBy(linkText = "Snap to grid")
    private WebElement snapToGridLink;

    @FindBy(linkText = "Synchronus Resize")
    private WebElement synchronousResizeLink;

    @FindBy(linkText = "Textarea")
    private WebElement textareaLink;

    @FindBy(linkText = "Visual Feedback")
    private WebElement visualFeedbackLink;

    public Animate_Page getAnimatePage() {
        return animatePage;
    }

    public ConstrainResizeArea_Page getConstrainResizeAreaPage() {
        return constrainResizeAreaPage;
    }

    public Helper_Page getHelperPage() {
        return helperPage;
    }

    public MaxMinSize_Page getMaxMinSizePage() {
        return maxMinSizePage;
    }

    public PreserveAspectRatio_Page getPreserveAspectRatioPage() {
        return preserveAspectRatioPage;
    }

    public Resizable_SnapToGrid_Page getSnapToGridPage() {
        return snapToGridPage;
    }

    public SynchronousResize_Page getSynchronousResizePage() {
        return synchronousResizePage;
    }

    public Textarea_Page getTextareaPage() {
        return textareaPage;
    }

    public Resizable_VisualFeedback_Page getVisualFeedbackPage() {
        return visualFeedbackPage;
    }

    public Resizable_Page() {
        this.animatePage = new Animate_Page();
        this.constrainResizeAreaPage = new ConstrainResizeArea_Page();
        this.helperPage = new Helper_Page();
        this.maxMinSizePage = new MaxMinSize_Page();
        this.preserveAspectRatioPage = new PreserveAspectRatio_Page();
        this.snapToGridPage = new Resizable_SnapToGrid_Page();
        this.synchronousResizePage = new SynchronousResize_Page();
        this.textareaPage = new Textarea_Page();
        this.visualFeedbackPage = new Resizable_VisualFeedback_Page();
    }

    public void clickOnAnimateLink() {
        animateLink.click();
    }

    public void clickOnConstrainResizeAreaLink() {
        constrainResizeAreaLink.click();
    }

    public void clickOnHelperLink() {
        helperLink.click();
    }

    public void clickOnMaxMinSizeLink() {
        maxMinSizeLink.click();
    }

    public void clickOnPreserveAspectRatioLink() {
        preserveAspectRatioLink.click();
    }

    public void clickOnSnapToGridLink() {
        snapToGridLink.click();
    }

    public void clickOnSynchronousResizeLink() {
        synchronousResizeLink.click();
    }

    public void clickOnTextareaLink() {
        textareaLink.click();
    }

    public void clickOnVisualFeedbackLink() {
        visualFeedbackLink.click();
    }
}
