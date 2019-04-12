package hackerrank.Contests.CaptureTheFlag;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfiniteLinks {
	
	static List<String> newsList;
	
	public static void main(String[] args) {
		

	}
	public static void PrintNews(){

		System.out.println("Total News: "+ newsList.size());

		for(String news: newsList){
			System.out.println(news);
		}
	}
	public static void ScrapNews() throws InterruptedException 					
	{
		String url = "https://cdn.hackerrank.com/hackerrank/static/contests/capture-the-flag/secret/";

		System.setProperty("webdriver.chrome.driver", "/Users/ARROMAN/WorkArea/Tools/Selenium_Driver/chromedriver");
		// Initialize browser
		WebDriver driver=new ChromeDriver();	

		//Creating the JavascriptExecutor interface object by Type casting		
		JavascriptExecutor js = (JavascriptExecutor)driver;		

		//Launching the Site.		
		driver.get(url);			

		WebElement button =driver.findElement(By.className("button"));			

		/*for(String key:keys){
			driver.findElement(By.className("secret")).clear();
			Thread.sleep(2000);
			driver.findElement(By.className("secret")).sendKeys(key);
			Thread.sleep(2000);
			js.executeScript("arguments[0].click();", button);

			Thread.sleep(2000);
			String news= driver.findElement(By.className("news-body")).getText();
			
			
			news=GetFinalNews(news);

			newsList.add(news);
		
		}	*/

	}	

	private static String GetFinalNews(String news){
		String finalString=news;
		if(!news.isEmpty()){
			int startIndex=news.indexOf("Secret news: ");
			finalString=news.substring(startIndex + 13, news.length());
		}

		return finalString;
	}
}
