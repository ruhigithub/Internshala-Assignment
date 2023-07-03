package demo;

		
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class RisvaAssignment {

		public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Wrist Watches");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

		Thread.sleep(2500);
		WebElement ele1 = driver.findElement(By.xpath("//div[div[div[span[contains(text(),'Delivery Day')]]]]/div/ul[5]/span[1]/li/span"));

		Actions act=new Actions(driver);
		act.moveToElement(ele1).click().perform();

		   driver.findElement(By.xpath("//div[div[span[contains(text(),'Band Material')]]]/ul[7]/span[3]/li/span/a/span")).click();
		   
		   driver.findElement(By.xpath("//div[div[div[span[contains(text(),'Customer Reviews')]]]]/div[4]/ul[1]/span[1]/li/span/a/span")).click();
		   
		   Thread.sleep(2500);
		   driver.findElement(By.xpath("//span[contains(text(),'25% Off or more')]")).click();
		   
		   Thread.sleep(2500);
		   WebElement FifthEle= driver.findElement(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-7']/div[1]/div[1]/div[2]/div[1]"));
		   
		   System.out.println("The Fifth elment is "+ FifthEle.getText());

		   
		}

		


	}


