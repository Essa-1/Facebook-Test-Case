package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Goibibo {
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		WebElement radioButton=driver.findElement(By.xpath("//p[text()='Round-trip']"));
		radioButton.click();
		WebElement checkBox=driver.findElement(By.xpath("//div[text()='Student']"));
		checkBox.click();
	}

}
