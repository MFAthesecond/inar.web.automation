import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Driver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebAutomation extends Hooks {
    /**
     * 1. Open the browser and navigate to the URL
     * 2. Click on webautomation link
     * 3. Click on Selectable button
     * 4. Click on Serialize button
     * 5. Click on Item 5
     * 6. Verify that Item 5 is selected
     * 7. Verify that "You've selected: #5" is displayed
     * 8. Click on Item 6
     * 9. Verify that Item 6 is selected
     * 10. Verify that "You've selected: #6" is displayed
     * 11. Click on Item 1, Item 3 by holding down the Ctrl key
     * 12. Verify that Item 1, Item 3 are selected
     * 13. Verify that "You've selected: #1 #3 #6" is displayed(6 selected because Item 6 is still selected)
     * 14. Click on Item 1, Item2, Item 3 by holding mouse down and dragging
     * 15. Verify that Item 1, Item 2, Item 3 are selected
     * 16. Verify that "You've selected: #1 #2 #3" is displayed
     */
    @Test
    public void testSerializeLink(){

        WebElement item5 = Driver.getDriver().findElement(By.xpath("//*[@id='selectable-serialize']/li[5]"));
        item5.click();
        assertTrue(item5.getAttribute("class").contains("selected"), "not selected");
        String message = Driver.getDriver().findElement(By.cssSelector("#feedback-serialize")).getText();
        assertEquals("You've selected: #5." , message , "message is correct");
        WebElement item6 = Driver.getDriver().findElement(By.xpath("//*[@id=\"selectable-serialize\"]/li[6]"));
        item6.click();
        assertTrue(item6.getAttribute("class").contains("selected") , "not selected");
        String message2 = Driver.getDriver().findElement(By.cssSelector("#feedback-serialize")).getText();
        assertEquals("You've selected: #6." , message2 , "message is correct");
        Actions actions = new Actions(Driver.getDriver());
        actions.keyDown(Keys.CONTROL).click(Driver.getDriver().findElement(By.xpath("//*[@id=\"selectable-serialize\"]/li[1]"))).
                click(Driver.getDriver().findElement(By.xpath("//*[@id=\"selectable-serialize\"]/li[3]")))
                .keyUp(Keys.CONTROL).build().perform();
        String message3 = Driver.getDriver().findElement(By.cssSelector("#feedback-serialize")).getText();
        assertEquals("You've selected: #1 #3 #6." , message3 , "message is correct");

        actions.clickAndHold(Driver.getDriver().findElement(By.xpath("//*[@id=\"selectable-serialize\"]/li[1]")))
                .moveToElement(Driver.getDriver().findElement(By.xpath("//*[@id=\"selectable-serialize\"]/li[3]")))
                .release().build().perform();

        String message4 = Driver.getDriver().findElement(By.cssSelector("#feedback-serialize")).getText();
        assertEquals("You've selected: #1 #2 #3." , message4 , "message is correct");
    }
}