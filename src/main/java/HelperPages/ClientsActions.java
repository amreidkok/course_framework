package HelperPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClientsActions {
    public static WebDriver driver = WebDriverFactory.getDriver();

    public static void clientsActions()
    {
        // Manual XPath for Action button
        //driver.findElement(By.xpath("(//tbody[1]//tr[1]//td[4]//div//button)[1]")).click();
        //driver.findElement(By.xpath("//tbody[1]//tr[1]//td[4]//div[@class='dropdown-menu ui-dropdown-menu show']/a[2]")).click();

        // Copied XPath for Action button
        driver.findElement(By.xpath("//*[@id=\"lising-table\"]/tbody/tr[1]/td[4]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"lising-table\"]/tbody/tr[1]/td[4]/div/div/a[2]")).click();
    }
}
