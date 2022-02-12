package scripts;


import java.io.IOException;

import org.testng.annotations.Test;

import GenericLib.BaseClass;
import pomPages.SkillraryAddCart;
import pomPages.SkillraryLogin;

public class TestCase2 extends BaseClass{
	
	@Test
	public void tc2() throws IOException, InterruptedException{
		
		SkillraryLogin log=new SkillraryLogin(driver);
		
		log.loginBtn();
		log.userMail(pdata.getData("email"));
		log.userPass(pdata.getData("pass"));
		log.UserLogBtn();
		
        SkillraryAddCart cart=new SkillraryAddCart(driver);
		
		Thread.sleep(1000);
		//cart.plusButton();
		cart.checkOutBtn();
		cart.CancleButton();
	}

}
