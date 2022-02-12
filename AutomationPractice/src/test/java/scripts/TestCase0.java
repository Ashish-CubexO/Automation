package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import GenericLib.BaseClass;
import pomPages.FacebookPage;

public class TestCase0  extends BaseClass{
    
	@Test
	public void tc0() throws FileNotFoundException, IOException, InterruptedException {
		
		FacebookPage fb= new FacebookPage(driver);
	    driver.get(pdata.getData("url"));
		fb.emailFiled(pdata.getData("emailF"));
		fb.passFiled(pdata.getData("passF"));
		fb.logButton();
		Thread.sleep(3000);
		utilites.navBack(driver);
		fb.creatButton();
		
		Thread.sleep(2000);
		fb.firstNameTf(pdata.getData("fname"));
		fb.lastNameTf(pdata.getData("lname"));
	
		
		
		
	}
}
