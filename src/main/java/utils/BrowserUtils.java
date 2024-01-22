package utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BrowserUtils {

    private static Actions actions = new Actions(Driver.getDriver());
    public static void scrollDownWithPageDown(){
        actions.keyDown(Keys.PAGE_DOWN).release().build().perform();
        wait(1);
    }

    public static void scrollUpWithPageUp(){
        actions.keyDown(Keys.PAGE_UP).release().build().perform();
        wait(1);
    }

    public static void wait(double timeout){
        try{
            Thread.sleep((long)timeout * 1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void wait(int timeout){
        try{
            Thread.sleep(timeout * 1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    // ikinci WebElement birincinin içinde mi kontrol edip içinde ise true aksi halde false gönderen metot
    public static boolean isInside(WebElement outerElement, WebElement innerElement) {
        // Get the location and size of the outer element
        Point outerElementLocation = outerElement.getLocation();
        Dimension outerElementSize = outerElement.getSize();

        // Get the location of the inner element
        Point innerElementLocation = innerElement.getLocation();

        // Check if the inner element is inside the outer element
        return (innerElementLocation.getX() >= outerElementLocation.getX() &&
                innerElementLocation.getY() >= outerElementLocation.getY() &&
                (innerElementLocation.getX() + innerElement.getSize().getWidth()) <= (outerElementLocation.getX() + outerElementSize.getWidth()) &&
                (innerElementLocation.getY() + innerElement.getSize().getHeight()) <= (outerElementLocation.getY() + outerElementSize.getHeight()));
    }

    public static String getTitle(){
        return Driver.getDriver().getTitle();
    }



}
