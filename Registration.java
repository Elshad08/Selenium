import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Elshad\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Elshad");
		driver.findElement(By.name("lastname")).sendKeys("Suleymanli");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("esuleymanlii@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("esuleymanlii@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("BrowserApplicationDevelopment");

		WebElement month = driver.findElement(By.xpath("//*[@id=\'month\']"));
		Select dropDownMonth = new Select(month);
		dropDownMonth.selectByIndex(12);

		WebElement day = driver.findElement(By.xpath("//*[@id=\'day\']"));
		Select dropDownDay = new Select(day);
		dropDownDay.selectByIndex(25);

		WebElement year = driver.findElement(By.xpath("//*[@id=\'year\']"));
		Select dropDownYear = new Select(year);
		dropDownYear.selectByValue("1995");

		Thread.sleep(3000);

		driver.close();
	}
}
