package collection7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.temu.com/uk?_bg_fs=1&_p_jump_id=10&_x_vst_scene=adg&_p_rfs=1&_x_ads_sub_channel=search&_x_ads_channel=google&_x_login_type=Google&_x_ads_account=3954917911&_x_ads_set=20030620447&_x_ads_id=145204446861&_x_ads_creative_id=656070467904&_x_ns_source=g&_x_ns_gclid=CjwKCAiAjfyqBhAsEiwA-UdzJMHIWzPzDFRPIrsSK_wsCcmP_ISmqTKuosQQuhNxRakurNSwqz-xFhoCu18QAvD_BwE&_x_ns_placement=&_x_ns_match_type=e&_x_ns_ad_position=&_x_ns_product_id=&_x_ns_target=&_x_ns_devicemodel=&_x_ns_wbraid=CjkKCQiA6vaqBhDCARIoAHx0xJoSpkbU6-_4tIlrDpd_2g7EUrzWPTyOKzuuCsuGGQU1EKXcYRoCCEE&_x_ns_gbraid=0AAAAAo4mICFsd6_t_i20DnMYfkPMY7jLN&_x_ns_keyword=temu&_x_ns_targetid=kwd-4583699489&gad_source=1&gclid=CjwKCAiAjfyqBhAsEiwA-UdzJMHIWzPzDFRPIrsSK_wsCcmP_ISmqTKuosQQuhNxRakurNSwqz-xFhoCu18QAvD_BwE");
        String titleOfPage=driver.getTitle();
        System.out.println(titleOfPage);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(700));
        System.out.println(driver.getPageSource());
        driver.quit();
    }
}
