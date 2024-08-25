package HelperPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Login {
    public static WebDriver driver = WebDriverFactory.getDriver();

    //*[@id="lising-table"]/tbody/tr[1]/td[4]/div/div/a[2]
    public static void loginApp()
    {
        driver.get("https://befareh967biowey.daftra.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("Email")).sendKeys("befareh967@biowey.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.className("btn")).click();
    }
}
