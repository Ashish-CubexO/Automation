package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLogin {
	
	@FindBy(xpath = "//a[text()='LOGIN']")
	private WebElement logBtn1;
	
	@FindBy(id = "email")
	private WebElement userTB;
	
	@FindBy(id = "password")
	private WebElement passTb;
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement UserlogBtn;
	
	public SkillraryLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void loginBtn() {
		logBtn1.click();
	}
	public void userMail(String email) {
		userTB.sendKeys(email);
	}
	public void userPass(String pass) {
		passTb.sendKeys(pass);
	}
	public void UserLogBtn() {
		UserlogBtn.click();
	}

	public WebElement getUserTB() {
		return userTB;
	}

	public void setUserTB(WebElement userTB) {
		this.userTB = userTB;
	}

	public WebElement getPassTb() {
		return passTb;
	}

	public void setPassTb(WebElement passTb) {
		this.passTb = passTb;
	}

}
