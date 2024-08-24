package HelperPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpdateClient {
    public static WebDriver driver = WebDriverFactory.getDriver();

    public static void updateClient(String UpdatedName)
    {
        // put name in webelement to take more than one action
        WebElement clientname = driver.findElement(By.id("ClientBusinessName"));
        clientname.clear();
        clientname.sendKeys(UpdatedName);
        driver.findElement(By.id("submitBtn")).click();
    }
}
