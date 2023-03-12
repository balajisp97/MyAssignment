package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver(); 
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
//		driver.findElement(By.name("USERNAME")).sendKeys("DemoCSR");
//		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
//		driver.findElement(By.className("loginButton")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Balaji");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Bala");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("work in Automation Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("balajisp97@gmail.com");
		WebElement sourceDB1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec1 = new Select(sourceDB1);
		sec1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("selenium automation");
		driver.findElement(By.className("smallSubmit")).click();
	}

}
