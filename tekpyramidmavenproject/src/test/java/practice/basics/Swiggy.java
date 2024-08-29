package practice.basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Swiggy {


		public static void main(String[] args) throws IOException, InterruptedException {
			
			
			   
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.swiggy.com/instamart/");
			
			 int count=0;
	  	  
			
		List<WebElement> veg=driver.findElements(By.xpath("//div[text()='Fresh Vegetables']/ancestor::div[@class=\"rKVoK _1kbVF\"]/descendant::div[@class=\"_3aZ5w _1eWs7\"]"));
	               for(WebElement veg1: veg) {
	            	
	       	 		File source = veg1.getScreenshotAs(OutputType.FILE);
	       	 		File target = new File("./swiggys"+count+++".png");
	       	 		Files.copy(source, target);
	       	 		
	       	  		
	              
	            	  
	               }
	               System.out.println(count);
		}
		 

	}
