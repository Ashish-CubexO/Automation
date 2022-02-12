package GenericLib;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilites {
	
   public void dropDown(WebElement ele,String text) {
	   Select s=new Select(ele);
	   s.selectByVisibleText(text);
   }
   
   //Actions Class Methods -->>
   public void mouseHover(WebDriver driver,WebElement ele) {
	   Actions a=new Actions(driver);
	   a.moveToElement(ele).perform();
   }
   public void doubleClick(WebDriver driver,WebElement ele) {
	   Actions a=new Actions(driver);
	   a.doubleClick(ele).perform();
   }
   public void rightClick(WebDriver driver,WebElement ele) {
	   Actions a=new Actions(driver);
	   a.contextClick(ele).perform();
   }
   public void dragAndDrop(WebDriver driver,WebElement source,WebElement target) {
	   Actions a=new Actions(driver);
	   a.dragAndDrop(source, target);
   }
   //Actions class End <<--
   
   //Switching one frame to another
   public void switchToframe(WebDriver driver) {
	   driver.switchTo().frame(0);
	   
   }
   //Switch to Default
   public void switchBackToframe(WebDriver driver) {
	   driver.switchTo().defaultContent();
	   
   }
   //Alert PopUp Windows
   public void alertPopup(WebDriver driver) {
	   driver.switchTo().alert().accept();
   }
   //Navigation Api
   public void navBack(WebDriver driver) {
	   driver.navigate().back();
   }
   public void navForword(WebDriver driver) {
	   driver.navigate().forward();
   }
   public void navRefresh(WebDriver driver) {
	   driver.navigate().refresh();
   }
    //Switch to one frame to another
   public void switchTabs(WebDriver driver) {
	   Set<String> child = driver.getWindowHandles();
	   for (String b : child) {
		driver.switchTo().window(b);
	}
   }
   //Handling ScrollBar //Up//Down
   public void scrollBar(WebDriver driver,int x,int y) {
	   JavascriptExecutor js=(JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy("+x+","+y+")");
   }
}
