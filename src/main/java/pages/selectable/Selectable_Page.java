package pages.selectable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Selectable_Page extends BasePage {

    @FindBy(linkText = "Display as Grid")
    private WebElement displayAsGrid;
    @FindBy(linkText = "Serialize")
    private WebElement serialize;
    private DisplayAsGridPage displayAsGridPage;
    private SerializePage serializePage;

    public Selectable_Page() {
        // Initialize page objects
        this.displayAsGridPage = new DisplayAsGridPage();
        this.serializePage = new SerializePage();
    }

    public void clickOnSerializeLink() {
        serialize.click();
    }

    public SerializePage getSerializePage() {
        return serializePage;
    }

    public DisplayAsGridPage getDisplayedAsGridPage() {
        return displayAsGridPage;
    }

}
