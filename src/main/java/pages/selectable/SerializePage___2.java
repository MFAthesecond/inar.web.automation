//package pages.selectable;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import pages.BasePage;
//
//import java.util.List;
//
//public class SerializePage___2 extends BasePage {
//
//
//    @FindBy(css = "#selectable-serialize")
//    List<WebElement> webElementList;
//
//
//    public int countSelectedItems() {
//
//
//        int count = 0;
//        for (WebElement item : webElementList) {
//            if (item.isSelected()) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public void pri() {
//        for (WebElement e :
//                webElementList) {
//            System.out.println(e.getText());
//        }
//        System.out.println(webElementList.size());
//    }
//
//
//    public void selectItem(int itemNumber) {
//        WebElement item = webElementList.get(0).findElement(By.cssSelector("#selectable-serialize  > li.ui-widget-content.bg-primary.text-fifth.ui-selectee.ui-selected:nth-child(" + itemNumber + ")"));
//        item.click();
//    }
//}
