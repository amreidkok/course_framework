package HelperPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
    public static WebDriver driver = WebDriverFactory.getDriver();
    public static void logoutApp()
    {
        driver.findElement(By.xpath("/html/body/div[1]/div/nav/div[2]/div[3]/button/i")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/nav/div[2]/div[3]/div/a[5]")).click();
    }
}
