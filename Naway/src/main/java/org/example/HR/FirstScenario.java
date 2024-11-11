package org.example.HR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstScenario {
    public  WebDriver driver;

    public  void main(String [] args)
    {
        /*User Login */
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        WebElement UserName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        UserName.sendKeys("Admin");

        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password.sendKeys("admin123");

        WebElement Login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("button")));
        Login.click();

    }
}
