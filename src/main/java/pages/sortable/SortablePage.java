package pages.sortable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SortablePage extends BasePage {
    private IncExcItems_Page incExcItems_Page;
    private DisplayAsGrid_Page displayAsGridPage;
    @FindBy(linkText = "Display as Grid")
    private WebElement displayAsGrid;
    @FindBy(linkText = "Include / exclude items")
    private WebElement incExcItems;

    public SortablePage() {
        this.displayAsGridPage = new DisplayAsGrid_Page();
        this.incExcItems_Page = new IncExcItems_Page();
    }

    public DisplayAsGrid_Page getDisplayAsGridPage() {
        return displayAsGridPage;
    }

    public IncExcItems_Page getIncExcItems_Page() {
        return incExcItems_Page;
    }

    public void clickOnDisplayAsGridLink() {
        displayAsGrid.click();
    }

    public void clickOnIncExcItemsLink() {
        incExcItems.click();
    }
}
