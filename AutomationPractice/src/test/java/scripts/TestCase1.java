package scripts;

import org.testng.annotations.Test;

import GenericLib.BaseClass;
import pomPages.SkillraryAddTocCart;
import pomPages.SkillraryApp;

public class TestCase1  extends BaseClass{
	
	@Test
	public void tc1() throws InterruptedException{
		SkillraryApp s=new SkillraryApp(driver);
		
		utilites.mouseHover(driver, s.getCourse());
		s.munitTesting();
		
		
		SkillraryAddTocCart ad=new SkillraryAddTocCart(driver);
		ad.addtocartBtn();
		utilites.alertPopup(driver);
	   
		ad.goToCart();
		
		//ad.gotocartFinal();
	}

	
	

}
  