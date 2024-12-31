package org.wt;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2024-1411166/points-table-standings");
		
		
		List<WebElement> allTables = driver.findElements(By.tagName("table"));
		WebElement table1 = allTables.get(0);
		
		List<WebElement> tableRows = table1.findElements(By.tagName("tr"));
		
		for(int i=0;i<tableRows.size();i++) {
			
			WebElement tablerow = tableRows.get(i);
			List<WebElement> tableDatas = tablerow.findElements(By.tagName("td"));
			for(int j=0;j<tableDatas.size();j++) {
				if(j==0) {
				WebElement webElement = tableDatas.get(j);
				String text = webElement.getText();
				StringBuilder sb = new StringBuilder();
				for(int k=1;k<text.length();k++) {
					sb.append(text.charAt(k));
				}
				String country = sb.toString();
		     	}
				else {
				System.out.println(tableDatas.get(j).getText());
				}
			}
		
	
		
	}
		driver.quit();
	}
	
}

