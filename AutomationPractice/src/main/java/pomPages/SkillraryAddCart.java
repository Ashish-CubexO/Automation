package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryAddCart {
	
	@FindBy(xpath = "//i[@class='fa fa-plus']")
	private WebElement pulsBtn;
	@FindBy(xpath = "//button[text()='Checkout']")
	private WebElement chekoutBtn;
	@FindBy(xpath = "(//button[text()='×'])[2]")
	private WebElement cancleBtn;
	
	public SkillraryAddCart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void plusButton() {
		pulsBtn.click();
	}
	public void checkOutBtn() {
		chekoutBtn.click();
	}
    public void CancleButton() {
    	cancleBtn.click();
    }
}
