
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://rahulshettyacademy.com/AutomationPractice/");

System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());



}

}
