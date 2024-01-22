package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

//public class Draggable_Page extends BasePage {
//    private Draggable_DefFunc_Page defaultFunctionalityPage;
//    private Events_Page eventsPage;
//
//    private AutoScrolling_Page autoScrollingPage;
//    ;
//    //    private ConstrainMovementPage constrainMovementLink;
////        private Draggable_DefFunc_Page defaultFunctionalityLink;
////        private Draggable_DefFunc_Page defaultFunctionalityLink;
////        private Draggable_DefFunc_Page defaultFunctionalityLink;
////        private Draggable_DefFunc_Page defaultFunctionalityLink;
//
//    public Draggable_Page() {
//        this.defaultFunctionalityPage = new Draggable_DefFunc_Page();
//        this.autoScrollingPage = new AutoScrolling_Page();
////        this.constrainMovementLink = constrainMovementLink;
////        this.cursorStyleLink = cursorStyleLink;
//        this.eventsPage = new Events_Page();
////        this.handlesLink = handlesLink;
////        this.draggableSortableLink = draggableSortableLink;
////        this.snapToGridLink = snapToGridLink;
//    }
//
//    public AutoScrolling_Page getAutoScrollingPage() {
//        return autoScrollingPage;
//    }
//
//    @FindBy(linkText = "Default Functionality")
//    private WebElement defaultFunctionalityLink;
//
//    @FindBy(linkText = "Auto Scrolling")
//    private WebElement autoScrollingLink;
//    @FindBy(linkText = "Constrain Movement")
//    private WebElement constrainMovementLink;
//
//    @FindBy(linkText = "Cursor Style")
//    private WebElement cursorStyleLink;
//
//    @FindBy(linkText = "Events")
//    private WebElement eventsLink;
//
//    @FindBy(linkText = "Handles")
//    private WebElement handlesLink;
//
//    @FindBy(linkText = "Draggable & Sortable")
//    private WebElement draggableSortableLink;
//
//    @FindBy(linkText = "Snap to Grid")
//    private WebElement snapToGridLink;
//
//    public void getDefaultFunctionalityLink() {
//        defaultFunctionalityLink.click();
//    }
//
//    public void getAutoScrollingLink() {
//        autoScrollingLink.click();
//    }
//
//    public void getConstrainMovementLink() {
//        constrainMovementLink.click();
//    }
//
//    public void getCursorStyleLink() {
//        cursorStyleLink.click();
//    }
//
//    public void getEventsLink() {
//        eventsLink.click();
//    }
//
//    public void getHandlesLink() {
//        handlesLink.click();
//    }
//
//    public void getDraggableSortableLink() {
//        draggableSortableLink.click();
//    }
//
//    public void getnSnapToGridLink() {
//        snapToGridLink.click();
//    }
//
//
//}
public class Draggable_Page extends BasePage {

    private Draggable_DefFunc_Page defaultFunctionalityPage;
    private AutoScrolling_Page autoScrollingPage;
    private ConstrainMovement_Page constrainMovementPage;
    private CursorStyle_Page cursorStylePage;
    private Events_Page eventsPage;
    private Handles_Page handlesPage;
    private DraggableSortable_Page draggableSortablePage;
    private Draggable_SnapToGrid_Page snapToGridPage;
    // ... other page fields

    @FindBy(linkText = "Default Functionality")
    private WebElement defaultFunctionalityLink;

    @FindBy(linkText = "Auto Scrolling")
    private WebElement autoScrollingLink;

    @FindBy(linkText = "Constrain Movement")
    private WebElement constrainMovementLink;

    @FindBy(linkText = "Cursor Style")
    private WebElement cursorStyleLink;

    @FindBy(linkText = "Events")
    private WebElement eventsLink;

    @FindBy(linkText = "Handles")
    private WebElement handlesLink;

    @FindBy(linkText = "Draggable & Sortable")
    private WebElement draggableSortableLink;

    @FindBy(linkText = "Snap to Grid")
    private WebElement snapToGridLink;


    public Draggable_Page() {
        // Initialize page objects
        this.defaultFunctionalityPage = new Draggable_DefFunc_Page();
        this.autoScrollingPage = new AutoScrolling_Page();
        this.constrainMovementPage = new ConstrainMovement_Page();
        this.cursorStylePage = new CursorStyle_Page();
        this.eventsPage = new Events_Page();
        this.handlesPage = new Handles_Page();
        this.draggableSortablePage = new DraggableSortable_Page();
        this.snapToGridPage = new Draggable_SnapToGrid_Page();
    }

    public void clickOnDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnAutoScrollingLink() {
        autoScrollingLink.click();
    }

    public void clickOnConstrainMovementLink() {
        constrainMovementLink.click();
    }

    public void clickOnCursorStyleLink() {
        cursorStyleLink.click();
    }

    public void clickOnEventsLink() {
        eventsLink.click();
    }

    public void clickOnHandlesLink() {
        handlesLink.click();
    }

    public void clickOnDraggableSortableLink() {
        draggableSortableLink.click();
    }

    public void clickOnSnapToGridLink() {
        snapToGridLink.click();
    }

    public Draggable_DefFunc_Page getDefaultFunctionalityPage() {
        return defaultFunctionalityPage;
    }

    public AutoScrolling_Page getAutoScrollingPage() {
        return autoScrollingPage;
    }

    public ConstrainMovement_Page getConstrainMovementPage() {
        return constrainMovementPage;
    }

    public CursorStyle_Page getCursorStylePage() {
        return cursorStylePage;
    }

    public Events_Page getEventsPage() {
        return eventsPage;
    }

    public Handles_Page getHandlesPage() {
        return handlesPage;
    }

    public DraggableSortable_Page getDraggableSortablePage() {
        return draggableSortablePage;
    }

    public Draggable_SnapToGrid_Page getSnapToGridPage() {
        return snapToGridPage;
    }
}
