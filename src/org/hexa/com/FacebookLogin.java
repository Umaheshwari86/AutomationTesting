package org.hexa.com;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class FacebookLogin {
	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", "G:\\Workspace\\SpringBootTraining\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			
//System.setProperty("webdriver.gecko.driver", "G:\\Workspace\\SpringBootTraining\\Selenium\\Driver\\geckodriver.exe");
//WebDriver driver= new FirefoxDriver();
//driver.get("https:facebook.com");
//driver.manage().window().maximize();
		
/*getCurrentUrl() and getTitle()-------------		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);
*/
		
/*getPageSource()-----------------	
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		driver.quit();
*/
		
		
/*Locater by.id-------------------
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("umaheshwari@gmail.com");
		WebElement password = driver.findElement(By.id("pass"))
		password.sendKeys("123445");
		driver.findElement(By.id("u_0_3")).click();
*/
		
		
/*Locater by.Xpath---------------------
		WebElement user1 = driver.findElement(By.xpath("(//input[@class='inputtext'])[1]"));
		user1.sendKeys("uma");
*/
		
		
/*getAttribute()------------------------
		String user11 = user1.getAttribute("type");
		System.out.println(user11);
		String user2 = user1.getAttribute("value");
		System.out.println(user2);
		WebElement user3 =driver.findElement(By.xpath("(//input[@class='inputtext'])[2]"));
		String user33 = user3.getAttribute("type");
		System.out.println(user33);
		user3.sendKeys("pass");
		String user4 = user3.getAttribute("value");
		System.out.println(user4);
*/

/*Thread.sleep(2000);
WebElement email = driver.findElement(By.id("email"));
//email.sendKeys("uma");
//String attribute = email.getAttribute("value");
//System.out.println(attribute);
String attribute = email.getAttribute("class");
System.out.println(attribute);*/

		
/*getText()-----------
		WebElement user5 = driver.findElement(By.xpath("(//span[contains(text(),'Create')])"));
		System.out.println(user5.getText());
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
*/
		
/*Navigation Commands-----------------------------		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.xpath("(//a[@class='gb_e'])[1]")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().refresh();
*/	
		
/*Upload and Download Files--------------
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.id("uploadfile_0"));
		findElement.sendKeys("G:\\Santhosh\\420353-updated_2018.doc");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("send")).click();
*/
 
		
/*Actions -- moveToElement --------------------
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Actions drop = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("(//span[@class='_2FZd5H'])[1]"));
		drop.moveToElement(ele).perform();
		WebElement mob = driver.findElement(By.xpath("(//a[@title='Mobiles'])[1]"));
		drop.moveToElement(mob).perform();
		WebElement mi = driver.findElement(By.xpath("(//a[@title='Mi'])[1]"));
		drop.moveToElement(mi).perform();
		WebElement realme = driver.findElement(By.xpath("//a[@title='Realme']"));
		realme.click();
		mob.click();
		System.out.println("done");
*/
		
/*drag And Drop---------------------
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement to = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
		WebElement from1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement to1 = driver.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable'])[1]"));
		act.dragAndDrop(from1, to1).perform();
*/	
		
/*Double click------------------
 
 				driver.get("http://demo.guru99.com/test/simple_context_menu.html");
				driver.manage().window().maximize();
				Actions act = new Actions(driver);
				WebElement click = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
				act.doubleClick(click).perform();
				driver.switchTo().defaultContent();
				//alert.accept();
*/

/*Right Click or Content Click----------
 
 		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement right = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		act.contextClick(right).perform();
		WebElement edit = driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']"));
		edit.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
*/
		
/*keyUp And keyDown---------------		
 
		driver.get("http:facebook.com");
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		WebElement a = driver.findElement(By.id("email"));
		act.keyDown(a,Keys.SHIFT).sendKeys("uma").keyUp(a,Keys.SHIFT).perform();
			
*/
/*Robot class--------------*/
		
/*Windows Handling---------

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.xpath("//a[@class='h-c-button h-c-button--primary hero-carousel__cta hero-carousel__cta--reg']")).click();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String x : windowHandles) {
			if(!x.equals(windowHandle)){
				driver.switchTo().window(x);
				driver.findElement(By.id("firstName")).sendKeys("Umamaheshwari");
				driver.findElement(By.id("lastName")).sendKeys("Ravi");
				driver.findElement(By.id("username")).sendKeys("umaheshwari1986");
			}
		}
*/

/*Multiple Windows Handling*/
		
//Implicit Wait
		//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
//Explicit wait
		//WebDriverWait w=new WebDriverWait (driver,200);
		//WebElement e=w.until(ExpectedConditions.elementToBeClickable(user5));
		
		//WebElement user6 = driver.findElement(By.xpath("//div [starts-with(text(),'Facebook')]"));
		//System.out.println(user6.getText());
		
/*DropDown----------------------------
		
		driver.get("www.facebook.com");
		//Select s = new Select(driver.findElement(By.id("day")));
		WebElement day = driver.findElement(By.id("day"));
		Select s =new Select(day);
		WebElement mon = driver.findElement(By.id("month"));
		Select s1 = new Select(mon);
		WebElement yr = driver.findElement(By.id("year"));
		Select s2 = new Select(yr);
		s.selectByVisibleText("6");
		s1.selectByIndex(12);
		s2.selectByValue("2016");
*/
				
	
/*MultipleSelect DropDown-------------------
	
	driver.get("https://www.toolsqa.com/automation-practice-form/");
	WebElement muldropdown = driver.findElement(By.id("selenium_commands"));
	Select sc = new Select(muldropdown);
	System.out.println("All Options");	
	List<WebElement> alloptions = sc.getOptions();
	for (WebElement print : alloptions) {
		String text = print.getText();
		if(((text.equals("Browser Commands"))||(text.equals("Switch Commands")))){
			sc.selectByVisibleText(text);
		}
		System.out.println(text);
	}
		System.out.println("Get All Selected Options");
		List<WebElement> allSelectedOptions = sc.getAllSelectedOptions();
		for (WebElement all : allSelectedOptions) {
			String text2 = all.getText();
			System.out.println(text2);
		}
		
		System.out.println("Get First Selected Options");
		WebElement first = sc.getFirstSelectedOption();
		String text3 = first.getText();
		System.out.println(text3);
*/
	
/*WebTable------------
//Static Value: No change in the DOM structure. fetch element using tagname. Dynamic value: change in the DOm structure in future enhancement.
//If there is any change in the DOM structure then we can use xPath
 
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		for (WebElement webElement : row) {
			List<WebElement> list = driver.findElements(By.tagName("td"));
			for (WebElement webElement2 : list) {
			String table = webElement2.getText();
			System.out.println(table);
			}
		}
			
			/*if (table.equals("Dubai")){
				System.out.println(table);
			}
 				*/
				
					
/*to find cell value from the table using Dynamic value-----------

		WebElement cell = driver.findElement(By.tagName("//table//tr[3]//td[1]"));
		System.out.println(cell.getText());
*/
		
	
		
/*Alerts---------------
 
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234567");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		//Alert alert2 = driver.switchTo().alert();
		//String text2 = alert2.getText();
		//System.out.println(text2);
		//String text2 = alert.getText();
		//System.out.println(text2);
		alert.accept();
*/		

	
/*Validation Commands ---- 
 //isDisplayed()-------------------------------------		
 
		driver.get("https:facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Absolute xPath---------
		
		boolean displayed = driver.findElement(By.xpath("//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a/i")).isDisplayed();
		if (displayed == true){
			System.out.println("displayed");
		}
		
		else {
			System.out.println("not Displayed");
		}
		}
*/
		
/*isEnabled()----------------------------
		
		driver.get("https:facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Relative xPath----------
		driver.findElement(By.id("email")).sendKeys("uma");
		boolean enabled = driver.findElement(By.id("email")).isEnabled();
						if (enabled == true){
			System.out.println(enabled);
		}
		
		else {
			System.out.println("Displayed");
		}
		}
*/

/*isDisplayed()---------------
		
		
		driver.get("https:facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Relative xPath----------
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		boolean enabled = driver.findElement(By.id("email")).isDisplayed();
						if (enabled == true){
			System.out.println(enabled);
		}
		
		else {
			System.out.println("not Displayed");
		}
		}
*/
	
/*ScreenShot--------------

		driver.get("https:facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("umaheshwari@gmail.	com");	
		driver.findElement(By.id("pass")).sendKeys("123445");
		TakesScreenshot tk = (TakesScreenshot) driver;
		File  f = tk.getScreenshotAs(OutputType.FILE);
		File f1 = new File("E:/facebook.png");
		FileUtils.copyFile(f, f1);
		System.out.println("done");
		
*/
		
/*ScrollUp & ScrollDown---------------------------

		driver.get("https://www.aircanada.com/ca/en/aco/home.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		
		WebElement a = driver.findElement(By.xpath("//span[contains(text(),'About Air Canada')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",a);
		a.click();
*/		

	}
}
	



	
		
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
		
	
		
		
		
		
		
		
		
		//driver.close();
		//driver.navigate().to("https://www.swiggy.com/");
		//driver.manage().window().maximize();
		//WebElement location = driver.findElement(By.id("location"));
		//location.sendKeys("chemmencherry");
		//driver.findElement(By.className("_3iFC5")).click();*/
			
		
		
	
	
	


