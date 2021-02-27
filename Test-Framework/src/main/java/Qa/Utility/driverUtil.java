package Qa.Utility;

import org.openqa.selenium.WebElement;


public class driverUtil {

    public static void getText(WebElement element){
        System.out.println(element.getText());
    }

    public static void clickElement(WebElement element){
        element.click();
    }

}
