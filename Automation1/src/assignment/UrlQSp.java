/*Write a script to print all URL's after entering Qspiders in google search page.
 * Find all the links present in the search page URL present under href attribute.
 * Use for each loop. */
package assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlQSp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Qspiders"+Keys.ENTER);
	Thread.sleep(2000);
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
    for (WebElement ele : allLinks) {
		String url=ele.getAttribute("href");
		System.out.println(url);
	}
}
}
