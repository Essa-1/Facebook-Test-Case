package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;


public class FBData {
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New");
		WebElement numberTextField=driver.findElement(By.id("phone number"));
		numberTextField.sendKeys("7008688616");
//		WebElement passwordTextField=driver.findElement(By.id("pass"));
//		passwordTextField.sendKeys("EssaSahu@2002");
		driver.findElement(By.name("CONTINUE")).sendKeys(Keys.ENTER);
	}

}
