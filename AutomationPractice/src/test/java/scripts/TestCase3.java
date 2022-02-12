package scripts;

import org.testng.annotations.Test;

import GenericLib.BaseClass;
import pomPages.SkillraryAddCart;

public class TestCase3 extends BaseClass
{
	@Test
	public void tc3() throws InterruptedException{

		SkillraryAddCart cart=new SkillraryAddCart(driver);
		
		Thread.sleep(1000);
		cart.plusButton();
		cart.checkOutBtn();
		cart.CancleButton();
	}

}
