package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryApp {
 
	@FindBy(xpath = "//a[text()='COURSE']")
	private WebElement course;
	
	@FindBy(xpath = "(//a[text()='munit testing '])[1]")
	private WebElement munitTest;
	
	public SkillraryApp(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void munitTesting() {
		munitTest.click();
	}
	public void courses() {
		course.click();
	}

	public WebElement getCourse() {
		return course;
	}

	public WebElement getMunitTest() {
		return munitTest;
	}
}
