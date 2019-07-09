package java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String args[]) throws InterruptedException {

		//指定谷歌驱动的地址
	    System.setProperty("webdriver.chrome.driver","D:\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// 谷歌浏览器
		driver.get("http://fanyi.baidu.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();

	}
}
