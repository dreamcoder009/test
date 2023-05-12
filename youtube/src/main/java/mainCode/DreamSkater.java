package mainCode;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.Conversion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.collections.Maps;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DreamSkater {
	public static WebDriver driver;

	public void runVideos() throws InterruptedException 
	{

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.setExperimentalOption("useAutomationExtension", false);
		driver = new ChromeDriver(options);

		// driver=new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		 
		 int totalWindows=15; double totalTime=12*60000;
		 
			/*
			 * for(int i=1;i<=totalWindows;i++) { System.out.println("Window Opened : "+i);
			 * Thread.sleep(438); driver.get(
			 * "https://www.youtube.com/watch?v=YN_y3uReU2A&t=159s&ab_channel=DreamSkater");
			 * 
			 * Thread.sleep(571); String
			 * videoPlay=driver.findElement(By.xpath("//button[@title='Play (k)']")).
			 * getAttribute("data-title-no-tooltip"); if(videoPlay.contentEquals("Play")) {
			 * driver.findElement(By.xpath("//button[@title='Play (k)']")).click(); }
			 * Thread.sleep(i+90); if(i==totalWindows) { break; }
			 * //driver.switchTo().newWindow(WindowType.TAB);
			 * 
			 * }
			 */
		 
		 for(int i=1;i<=totalWindows;i++)
		 {
			 
		
		driver.get("https://www.youtube.in/");
		Thread.sleep(7200);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("D");
		Thread.sleep(903);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("r");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("e");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("a");
		Thread.sleep(1024);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("m");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys(" ");
		Thread.sleep(1076);

		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("s");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("k");
		Thread.sleep(1804);

		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("a");
		Thread.sleep(1804);

		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("t");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("e");
		Thread.sleep(304);

		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("r");
		Thread.sleep(506);
		driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[2]")).click();
		Thread.sleep(3210);
		driver.findElement(By.xpath("(//a[text()='Dream Skater'])[2]")).click();
		Thread.sleep(8370);
		driver.findElement(By.xpath("//div[text()='Playlists']")).click();
		Thread.sleep(3468);
		driver.findElement(By.xpath("//yt-image[@class='style-scope ytd-playlist-video-thumbnail-renderer']")).click();
		
		

		 }
		Thread.sleep(3904000);// 8 minutes Thread.sleep(2580000);// 43 minutes

		driver.quit();

		/*
		 * { Thread.sleep(10000); Boolean
		 * a=isElementPresent("//*[contains(text(),'Video will play')]");
		 * 
		 * System.out.println(a); if(!a) {
		 * System.out.println("Item not present, looking for Skip Ads Button.");
		 * 
		 * String
		 * ads=driver.findElement(By.xpath("//span[@class='ytp-ad-simple-ad-badge']/div"
		 * )).getText(); String adTime=driver.findElement(By.xpath(
		 * "//span[@class='ytp-ad-duration-remaining']/div")).getText();
		 * 
		 * System.out.println("Total Ads : "+ads+ " and toal Time is : "+ adTime); int
		 * minute=Integer.parseInt(adTime.split(":")[0])*60; int
		 * seconds=Integer.parseInt(adTime.split(":")[1]);
		 * System.out.println("Timer Start : "+minute+seconds);
		 * //Thread.sleep(minute+seconds);
		 * driver.findElement(By.xpath("//*[text()='Skip Ads']")).click();
		 * 
		 * 
		 * } else { System.out.println("Item present");
		 * 
		 * String
		 * ads=driver.findElement(By.xpath("//span[@class='ytp-ad-simple-ad-badge']/div"
		 * )).getText(); String adTime=driver.findElement(By.xpath(
		 * "//span[@class='ytp-ad-duration-remaining']/div")).getText();
		 * 
		 * System.out.println("Total Ads : "+ads+ " and toal Time is : "+ adTime);
		 * 
		 * int minute=Integer.parseInt(adTime.split(":")[0])*60; int
		 * seconds=Integer.parseInt(adTime.split(":")[1]);
		 * System.out.println("Timer Start : "+minute+seconds);
		 * Thread.sleep(minute+seconds);
		 * 
		 * 
		 * }
		 * 
		 * }
		 */

		

	}
	/*
	 * public static boolean isElementPresent(String locater) { int elem =
	 * driver.findElements(By.xpath(locater)).size();
	 * 
	 * try { if (elem > 0) { return true; } else { return false; }
	 * 
	 * } catch (Throwable t) { System.out.println(t.getMessage()); return false; } }
	 */

	/*
	 * public static boolean isElementPresent(String locator) { //try { int
	 * elem=driver.findElements(By.xpath(locator)).size(); try { if(elem==0) {
	 * return false; } else { return true; }
	 * 
	 * }
	 * 
	 * catch (Exception e) { System.out.println(e.getMessage()); } return 0;
	 * 
	 * }
	 */

	public static void main(String[] args) throws InterruptedException {

		new DreamSkater().runVideos();

	}

}
