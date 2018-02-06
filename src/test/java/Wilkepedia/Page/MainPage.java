package Wilkepedia.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import sun.plugin2.message.Message;

import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class MainPage {

    private static WebElement element = null;
    private static WebDriver dr = null;
    private static String chosenLanguage;

    public static WebElement searchButton(WebDriver e,String className) {
        element = e.findElement(By.className(className));
        return element;
    }

    public static void selectLanguage(WebDriver e,String id, String listItem) {
        Select sl = new Select(e.findElement(By.id(id)));
       sl.selectByVisibleText(listItem);
    }

    public static String getLanguage(WebDriver e,String id, String listItem){
        Select sl = new Select(e.findElement(By.id(id)));
        sl.selectByVisibleText(listItem);
        WebElement ele = e.findElement(By.id("searchLanguage"));
        chosenLanguage = ele.getAttribute("value");
        return chosenLanguage;
    }

    public static void searchField(WebDriver dr,String id,String text) {
         dr.findElement(By.id(id)).sendKeys(text);
    }

    public static void firstHeading(WebDriver dr,String id, String heading){
       assertTrue(dr.findElement(By.id(id)).getText().equalsIgnoreCase(heading));
    }
}
