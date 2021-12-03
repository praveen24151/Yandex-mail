
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class partidate {
//static WebDriver driver;

public static void main(String[] args){

// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();

	driver.get("https://www.path2usa.com/travel-companions");
	driver.manage().window().maximize();
	driver.findElement(By.id("travel_date")).click();
	driver.findElement(By.xpath("/html/body/div[6]/div[1]/table/thead/tr[1]/th[3]")).click();
	driver.findElement(By.xpath("/html/body/div[6]/div[1]/table/tbody/tr[1]/td[4]")).click();
	}
}

