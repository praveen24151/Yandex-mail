package Yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maillogin {
	
	public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://passport.yandex.com/");
	

	driver.findElement(By.id("passp-field-login")).sendKeys("knpraveen@yandex.com");
	driver.findElement(By.id("passp:sign-in")).click();
	driver.findElement(By.xpath("//span /input")).click();
	driver.findElement(By.xpath("//span /input")).sendKeys("Pk@1235");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	
	driver.findElement(By.xpath("//a[text()='Yandex']")).click();
	driver.findElement(By.xpath("//a[@id='tab-mail']")).click();
	driver.findElement(By.xpath("//div[@class='HeadBanner-ButtonsWrapper'] /a[2]")).click();

	

	driver.findElement(By.id("passp-field-login")).sendKeys("knpraveen@yandex.com");
	driver.findElement(By.id("passp:sign-in")).click();
	driver.findElement(By.xpath("//span /input")).click();
	driver.findElement(By.xpath("//span /input")).sendKeys("Pk@1235");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	driver.findElement(By.xpath("//span[@class='mail-ComposeButton-Text']")).click();
	
	}
}
