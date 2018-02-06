package Wilkepedia.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Utils {

    public static void getUrl(String url,WebDriver e){
        e.get(url);
        e.manage().window().maximize();
    }

    public static void confirmUrl(WebDriver e, String Url){
       assertEquals(Url,e.getCurrentUrl());
    System.out.println(e.getCurrentUrl());
    }

    public static void loopOption(WebDriver e) {

        List<WebElement> element = e.findElements(By.id("searchLanguage"));
        for (WebElement es :element) {
            System.out.println(es.getAttribute("value"));
        }
    }

}
