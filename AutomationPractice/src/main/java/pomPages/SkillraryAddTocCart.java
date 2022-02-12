package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;import com.github.dockerjava.api.model.Driver;

public class SkillraryAddTocCart {
	
	@FindBy(xpath = "//button[text()=' Add to Cart']")
	private WebElement AddtoCartBtn;
	
	@FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[2]")
	private WebElement cartBtn;
	
	@FindBy(xpath = "//a[text()='Go to Cart']")
	private WebElement gotTocartfinal;
	
	public SkillraryAddTocCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void addtocartBtn() {
		AddtoCartBtn.click();
	}
	public void goToCart() {
		cartBtn.click();
	}
	public WebElement getGotTocartfinal() {
		return gotTocartfinal;
	}
	public void gotocartFinal() {
		gotTocartfinal.click();
	}

}
