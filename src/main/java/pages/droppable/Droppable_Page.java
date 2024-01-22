package pages.droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Droppable_Page extends BasePage {

    // Getter metotları
    public Droppable_DefFunc_Page getDefaultFunctionalityPage() {
        return new Droppable_DefFunc_Page();
    }

    public Accept_Page getAcceptPage() {
        return new Accept_Page();
    }

    public PreventPropagation_Page getPreventPropagationPage() {
        return new PreventPropagation_Page();
    }

    public RevertPosition_Page getRevertPositionPage() {
        return new RevertPosition_Page();
    }

    public SimplePhotoManager_Page getSimplePhotoManagerPage() {
        return new SimplePhotoManager_Page();
    }

    public VisualFeedback_Page getVisualFeedbackPage() {
        return new VisualFeedback_Page();
    }

    // Draggable_Page.java

    private Droppable_DefFunc_Page defaultFunctionalityPage;
    private Accept_Page acceptPage;
    private PreventPropagation_Page preventPropagationPage;
    private RevertPosition_Page revertPositionPage;
    private SimplePhotoManager_Page simplePhotoManagerPage;
    private VisualFeedback_Page visualFeedbackPage;

    @FindBy(linkText = "Default Functionality")
    private WebElement defaultFunctionalityLink;

    @FindBy(linkText = "Accept")
    private WebElement acceptLink;

    @FindBy(linkText = "Prevent Propagation")
    private WebElement preventPropagationLink;

    @FindBy(linkText = "Revert draggable position")
    private WebElement revertPositionLink;

    @FindBy(linkText = "Simple Photo Manager")
    private WebElement simplePhotoManagerLink;

    @FindBy(linkText = "Visual Feedback")
    private WebElement visualFeedbackLink;

    public Droppable_Page() {
        this.defaultFunctionalityPage = new Droppable_DefFunc_Page();
        this.acceptPage = new Accept_Page();
        this.preventPropagationPage = new PreventPropagation_Page();
        this.revertPositionPage = new RevertPosition_Page();
        this.simplePhotoManagerPage = new SimplePhotoManager_Page();
        this.visualFeedbackPage = new VisualFeedback_Page();
    }


    public void clickOnDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnAcceptLink() {
        acceptLink.click();
    }

    public void clickOnPreventPropagationLink() {
        preventPropagationLink.click();
    }

    public void clickOnRevertPositionLink() {
        revertPositionLink.click();
    }

    public void clickOnSimplePhotoManagerLink() {
        simplePhotoManagerLink.click();
    }

    public void clickOnVisualFeedbackLink() {
        visualFeedbackLink.click();
    }
}



