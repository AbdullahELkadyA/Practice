package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Add_Compound_To_Compare {
    public WebDriver driver;

    public void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://www.nawy.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement Property_Type_BTN = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[5]/div/div[1]/div[2]/div[2]/div/div[2]"));

        Property_Type_BTN.click();
        WebElement Select_Property_Type_Apartment = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/div[5]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/label[1]")));
        Select_Property_Type_Apartment.click();

        WebElement Select_Property_Type_Villa = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/div[5]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/label[2]")));
        Select_Property_Type_Villa.click();

        WebElement Select_Property_Type_TwinHouse = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/div[5]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/label[3]")));
        Select_Property_Type_TwinHouse.click();


        Thread.sleep(2000);
        WebElement Bedrooms_BTN = driver.findElement(By.xpath("//div[3]/span"));
        Bedrooms_BTN.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement optionsBedrooms = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/div[5]/div/div[1]/div[2]/div[2]/div/div[3]/div/div/label[1]")));
        optionsBedrooms.click();
        WebElement optionssBedrooms = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/div[5]/div/div[1]/div[2]/div[2]/div/div[3]/div/div/label[2]")));
        optionssBedrooms.click();


        WebElement SearchBTN = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Search']")));
        SearchBTN.click();

        Thread.sleep(2000);
        WebElement CompareBTN = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/div[5]/div/div/div[2]/div/div/div[2]/a[1]/div/div[1]/div/div[1]/div/button")));
        CompareBTN.click();
        Thread.sleep(2000);
        WebElement CompareBTN1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[1]/div[5]/div/div/div[2]/div/div/div[2]/a[2]/div/div[1]/div/div[1]/div/button")));
        CompareBTN1.click();
        WebElement StartCompare = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("start-compare")));
        StartCompare.click();
    }
}