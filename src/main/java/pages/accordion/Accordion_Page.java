package pages.accordion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Accordion_Page extends BasePage {
    @FindBy(linkText = "Collapse Content")
    WebElement collapseContentLink;

    private CollapseContent collapseContentPage;

    public Accordion_Page() {
        this.collapseContentPage = new CollapseContent();
    }

    public CollapseContent getCollapseContentPage() {
        return collapseContentPage;
    }
    public void clickOnCollapseContentLink(){
        collapseContentLink.click();
    }
}
