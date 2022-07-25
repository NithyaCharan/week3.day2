package week3.day2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		//call the web driver manager for the browser driver
		WebDriverManager.chromedriver().setup();
		
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//load the url
		driver.get(" https://www.ajio.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//maximize the browser
		driver.manage().window().maximize();	
		
		//03) Type "Bags" in the Search box

		driver.findElement(By.xpath("//input[@role = 'combobox']")).sendKeys("Bags" , Keys.ENTER);
		
		driver.findElement(By.xpath("(//div[@class='facet-linkhead'])[2]")).click();
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();

		System.out.println(driver.findElement(By.xpath("(//div[@class = ' filter-container']/div/div)[1]")).getText());
		
		//get the list of brand names
		//foreach loop through the list and print the brand names
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		
		System.out.println("BRAND NAMES");
		System.out.println("===========================================================");
		
		for (WebElement brand : bagBrandList) {
			String brndNme = brand.getText();
			System.out.println(brndNme);
		}

		//get the list of bag names
		//foreach loop through the list and print the bag names
		List<WebElement> bagNameList = driver.findElements(By.className("nameCls"));
		
		System.out.println("BAG NAMES");
		System.out.println("===========================================================");
		
		for (WebElement bag : bagNameList) {
			String bagNme = bag.getText();
			System.out.println(bagNme);
		}

	}

}
