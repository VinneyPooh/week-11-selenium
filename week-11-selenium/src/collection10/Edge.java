package collection10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.halifax.co.uk/");
        String titleOfPage=driver.getTitle();
        System.out.println(titleOfPage);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(700));
        System.out.println(driver.getPageSource());
        driver.quit();
    }
}
