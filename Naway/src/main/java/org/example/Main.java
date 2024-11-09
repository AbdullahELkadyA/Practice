package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public WebDriver driver;

    // Test Steps
    /*
    1.Choose Property
    2. Choose Bedrooms
    3.Choose your price
    4.Check prices of results above the range or not
    * */
    public  void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.nawy.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement SearchBARInHomePage              =   driver.findElement(By.className("search-filter-bar"));

        WebElement Property_Type_BTN                =   driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[5]/div/div[1]/div[2]/div[2]/div/div[2]"));

        Property_Type_BTN.click();
        WebElement Select_Property_Type_Apartment       = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/div[5]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/label[1]")));
        Select_Property_Type_Apartment.click();

        WebElement Select_Property_Type_Villa        = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/div[5]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/label[2]")));
        Select_Property_Type_Villa.click();

        WebElement Select_Property_Type_TwinHouse    = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/div[5]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/label[3]")));
        Select_Property_Type_TwinHouse.click();


        Thread.sleep(2000);
        WebElement Bedrooms_BTN                     =   driver.findElement(By.xpath("//div[3]/span"));
        Bedrooms_BTN.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement optionsBedrooms = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/div[5]/div/div[1]/div[2]/div[2]/div/div[3]/div/div/label[1]")));
        optionsBedrooms.click();
        WebElement optionssBedrooms = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/div[5]/div/div[1]/div[2]/div[2]/div/div[3]/div/div/label[2]")));
        optionssBedrooms.click();

        Thread.sleep(2000);
        WebElement prices = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/div[5]/div/div[1]/div[2]/div[2]/div/div[4]")));
        prices.click();
        WebElement pricesOP =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/div[5]/div/div[1]/div[2]/div[2]/div/div[4]/div/div/label[1]")));
        pricesOP.click();

        WebElement SearchBTN = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Search']")));
        SearchBTN.click();


        String priceText = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[5]/div/div/div[2]/div/div/div[2]/a[1]/div/div[2]/div[3]/div[1]/div[2]/span[1]")).getText().trim();
        priceText = priceText.replaceAll("[^\\d]", "");

        // Convert the price to an integer
        int price = Integer.parseInt(priceText);

        // Compare the price to 4,000,000
        if (price > 4000000) {
            System.out.println("Test Failed: The price " + price + " is greater than 4,000,000");
        } else {
            System.out.println("Test Passed: The price " + price + " is not greater than 4,000,000");
        }





    }
}