package GenericLib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class BaseClass {
 
	public WebDriver driver;
	public PropertyFile pdata= new PropertyFile();
	public WebDriverUtilites utilites=new WebDriverUtilites();
	
	public CrossBrowserScript cross=new CrossBrowserScript(); 
	
	@BeforeMethod
	public void openApp() throws FileNotFoundException, IOException {
		
		driver.manage().window().maximize();
		driver.get(pdata.getData("url2"));
		//driver.get(pdata.getData("url"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
	}
	//cross Browser Run
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("firefox")){
		//create firefox instance
			ChromeDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		//Check if parameter passed as 'chrome'
		else if(browser.equalsIgnoreCase("chrome")){
			//set path to chromedriver.exe
			ChromeDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		//Check if parameter passed as 'Edge'
				else if(browser.equalsIgnoreCase("Edge")){
					//set path to Edge.exe
					ChromeDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
				}
		else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
  
	@AfterMethod
  public void closeApp(ITestResult res) throws IOException, InterruptedException {
	int status=res.getStatus();
	String name=res.getName();
	if (status==2) {
		Screenshot s=new Screenshot();
		s.getPhoto(driver, name);
	  }
	
	driver.quit();
 }


}
