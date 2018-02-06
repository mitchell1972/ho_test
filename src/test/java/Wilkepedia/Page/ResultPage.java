package Wilkepedia.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;


public class ResultPage {

    private static WebElement element = null;
    private static WebDriver dr = null;

    public static void getText(WebDriver e,String id, String text){
      assertEquals(e.findElement(By.id(id)).getText(),text);
    }
}
