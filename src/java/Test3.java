package java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test3 {
	
	public static void main(String args[]) throws InterruptedException {
		
		//指定火狐驱动的地址
		System.setProperty("webdriver.ie.driver","D:\\BrowserDriver\\IEDriverServer.exe");
		
		//实例化一个WebDriver的对象，此时会启动IE浏览器
		WebDriver driver = new InternetExplorerDriver();
		
		//最大化浏览器窗口
		driver.manage().window().maximize();
		
		//打开百度首页
		driver.get("https://www.baidu.com/");
		
		//在搜索框中输入查询内容：自动化测试
		driver.findElement(By.id("kw")).sendKeys("自动化测试");
		
		//强制等待3秒
		Thread.sleep(3000);
		
		//点击“百度一下” 执行搜索
        //driver.findElement(By.id("su")).click();
		
		//强制等待3秒
		Thread.sleep(3000);
		
		//关闭火狐浏览器
		driver.quit();
		
	}
}
