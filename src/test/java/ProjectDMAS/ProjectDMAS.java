package ProjectDMAS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectDMAS {
	protected String url="https://deft-semolina-93c93d.netlify.app/";
	WebDriver driver=null;
  @Test
  public void function() {
	  WebElement firstvalue=driver.findElement(By.id("first"));
	  firstvalue.sendKeys("56");
	  
	  WebElement lastvalue=driver.findElement(By.id("second"));
	  lastvalue.sendKeys("6");
	  
	  WebElement finaloutput=driver.findElement(By.cssSelector("p[class='output']"));
	  
	  String n="div";
	  
	  if(n.equals("add")) {
		  WebElement addbtn=driver.findElement(By.cssSelector("button[onclick='add()']"));
		  addbtn.click();
		  System.out.println("Addition : "+finaloutput.getText()); 
	  }else if(n.equals("sub")) {
		  WebElement subbtn=driver.findElement(By.cssSelector("button[onclick='sub()']"));
		  subbtn.click();
		  System.out.println("Subraction : "+finaloutput.getText());
	  }else if(n.equals("mul")) {
		  WebElement mulbtn=driver.findElement(By.cssSelector("button[onclick='mul()']"));
		  mulbtn.click();
		  System.out.println("Multiplication : "+finaloutput.getText());
	  }else if(n.equals("div")) {
		  WebElement divbtn=driver.findElement(By.cssSelector("button[onclick='div()']"));
		  divbtn.click();
		  System.out.println("Division : "+finaloutput.getText());
	  }
	  else {
		  WebElement addbtn=driver.findElement(By.cssSelector("button[onclick='add()']"));
		  addbtn.click();
		  System.out.println("Addition : "+finaloutput.getText()); 
	  }
  }
  @BeforeSuite
  public void beforsuites() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();;
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
  }
  
  @BeforeClass
  public void beforclas() {
	 driver.get(url); 
  }
  
  @AfterSuite
  public void aftersuites() {
	  driver.close();
  }
}
