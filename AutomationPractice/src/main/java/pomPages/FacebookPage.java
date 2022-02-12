package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class FacebookPage {
  //Declaration start
	@FindBy(id = "email")
	private WebElement emilfiled;
	
	@FindBy(id = "pass")
	private WebElement passfiled;
	
	@FindBy(xpath = "//button[text()='Log In']")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//a[text()='Create New Account']")
	private WebElement createNew;
	
	@FindBy(name = "firstname")
	private WebElement firstName;
	
	@FindBy(name = "lastname")
	private WebElement lastName;
  //Declaration End
	
	public FacebookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public void firstNameTf(String fname) {
		firstName.sendKeys(fname);
	}
	public void lastNameTf(String lname) {
		firstName.sendKeys(lname);
	}
	public void emailFiled(String email) {
	emilfiled.sendKeys(email);
	 }
	
	public void passFiled(String pass) {
		passfiled.sendKeys(pass);
	}
	public void logButton() {
		loginBtn.click();
	}
	public void creatButton() {
		createNew.click();
	}

	public WebElement getEmilfiled() {
		return emilfiled;
	}

	public void setEmilfiled(WebElement emilfiled) {
		this.emilfiled = emilfiled;
	}

	public WebElement getPassfiled() {
		return passfiled;
	}

	public void setPassfiled(WebElement passfiled) {
		this.passfiled = passfiled;
	}

}