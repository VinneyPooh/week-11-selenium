package collection4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://direct.asda.com/george/clothing/10,default,sc.html");
        String titleOfPage=driver.getTitle();
        System.out.println(titleOfPage);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(700));
        System.out.println(driver.getPageSource());
        driver.quit();
    }
}
