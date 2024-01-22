package pages.selectable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class SerializePage extends BasePage {


    @FindBy(css = "#selectable-serialize  > :nth-child(1)")
    WebElement item1;
    @FindBy(css = "#selectable-serialize  > :nth-child(2)")
    WebElement item2;
    @FindBy(css = "#selectable-serialize  > :nth-child(3)")
    WebElement item3;
    @FindBy(css = "#selectable-serialize  > :nth-child(4)")
    WebElement item4;
    @FindBy(css = "#selectable-serialize  > :nth-child(5)")
    WebElement item5;
    @FindBy(css = "#selectable-serialize  > :nth-child(6)")
    WebElement item6;
    @FindBy(css = "#select-result")
    WebElement selectResult;

    List<WebElement> webElementList = new ArrayList<>();

    public void initialize() {
        webElementList.add(item1);
        webElementList.add(item2);
        webElementList.add(item3);
        webElementList.add(item4);
        webElementList.add(item5);
        webElementList.add(item6);
    }

    public String getSelectResult() {
return selectResult.getText();
    }


    public void selectItem(int itemNumber) {
        webElementList.get(itemNumber - 1).click();
    }
}
