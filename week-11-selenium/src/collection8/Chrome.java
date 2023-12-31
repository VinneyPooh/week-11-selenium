package collection8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.nhs.uk/");
        String titleOfPage=driver.getTitle();
        System.out.println(titleOfPage);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(700));
        System.out.println(driver.getPageSource());
        driver.quit();
    }
}
