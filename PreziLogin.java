import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PreziLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Elshad\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.prezi.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Get started")).click();
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("id_username")).sendKeys("Selenium");
		driver.findElement(By.id("id_password")).sendKeys("TestPassword");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"btn_login\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
