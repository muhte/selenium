
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) {
		
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		
		///Navigate to web page
		driver.get("https://demoqa.com/text-box");
		
		//Maximizing window
		driver.manage().window().maximize();
		
		
		//Locating web element
		WebElement FullName = driver.findElement(By.id("userName"));
		FullName.click();
		FullName.sendKeys("muhteber");
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\'userEmail\']"));
		email.click();
		email.sendKeys("muhteberaydinn@gmail.com");
		
		WebElement currentAddress =driver.findElement(By.xpath("//*[@id=\'currentAddress\']"));
		currentAddress.click();
		currentAddress.sendKeys("bir şeyler deniyorummmm aşkımm");
		
		WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
		permanentAddress.click();
		permanentAddress.sendKeys("kfopkhn");
		
		WebElement submitButton = driver.findElement(new By.ByCssSelector("button.btn"));
		submitButton.click();
	}

}


