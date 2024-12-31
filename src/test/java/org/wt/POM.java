package org.wt;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POM {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tesco.com/account/register/en-GB?from=https%3A%2F%2Fwww.tesco.com%2F");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		Thread.sleep(1000);
		
	    driver.findElement(By.id("email")).sendKeys("karthi@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("123");
	   
	    driver.findElement(By.xpath("(//input[@role='radio'])[3]")).click();
	    Select s = new Select(driver.findElement(By.id("title")));
	    s.selectByIndex(4);
	    
	    driver.findElement(By.id("first-name")).sendKeys("MANI123");
	    driver.findElement(By.id("last-name")).sendKeys("M123");
	    driver.findElement(By.id("phone-number")).sendKeys("7898658574");
	    driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("4/12 gandhi");
	    Thread.sleep(1000);
	    List<WebElement> elements = driver.findElements(By.xpath("//li[@class='styled__ListItem-sc-1kz2bv3-0 bnIsAz ddsweb-search-input__result ddsweb-menu__menu-item']"));
		elements.get(0).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
	

}
