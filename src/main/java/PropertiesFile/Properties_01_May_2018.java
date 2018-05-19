package PropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Properties_01_May_2018 {
	
	WebDriver driver;
	
	
	@Test
	public void testprop() throws IOException, InterruptedException{
		
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\guptaav\\Mars_workspace\\SeleniumDemo\\src\\main\\java\\PropertiesFile\\Config_Properties_Data_File_01_May_2018.properties");
		prop.load(fis);
		
		String URL=prop.getProperty("Url");
		System.out.println(prop.getProperty("Url"));
		
		
		String Username=prop.getProperty("Username");
		System.out.println(Username);
		
		String Password=prop.getProperty("Password");
		System.out.println(Password);
		
		//driver.manage().window().maximize();
		System.setProperty("webdriver.chrome.driver", "C:\\Avi Gupta\\Automation\\Automation Software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(URL);
		
		driver.findElement(By.xpath(prop.getProperty("UsernameXpath"))).sendKeys(prop.getProperty("UsernameNew"));
		driver.findElement(By.xpath(prop.getProperty("PasswordXpath"))).sendKeys(prop.getProperty("PasswordNew"));
		driver.findElement(By.xpath(prop.getProperty("ButtonXpath"))).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	
	}
	

}
