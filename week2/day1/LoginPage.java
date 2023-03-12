package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

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
		
		WebElement sourceDB = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec = new Select(sourceDB);
		sec.selectByIndex(2);
		WebElement sourceDB1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sec1 = new Select(sourceDB1);
		sec1.selectByVisibleText("Automobile");
		WebElement sourceDB2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sec2 = new Select(sourceDB2);
		sec2.selectByValue("OWN_CCORP");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);

	}

}
