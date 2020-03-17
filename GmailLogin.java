import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elshad\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).sendKeys("esuleymanlii@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(5000);
		String at = driver.getTitle();
		String et = "gmail";
		driver.close();
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Succesfull");
		} else {
			System.out.println("Failed");
		}
	}
	
}
