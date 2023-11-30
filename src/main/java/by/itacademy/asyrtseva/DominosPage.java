package by.itacademy.asyrtseva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DominosPage {

    private String buttonAddToProductPacket = "//*[@id=\"app-root\"]/div/div[1]/div[2]/div[6]/div/div/div[30]/div/div[6]/div[2]/button";
    private String buttonProductPacket = "//*[@id=\"app-root\"]/div/div[1]/div[2]/div[2]/div/div/div/div/div/div[3]/div/button";
    private String buttonCheckoutOrder = "/html/body/div[2]/div/div[1]/div[2]/div[2]/div/div/div/div/div/div[3]/div/div/div[3]/div[2]/a";
    private String pizzaMargaritaOrderConfirmed = "//*[@id=\"app-root\"]/div/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div";
    private String buttonCloseBunner = "/html/body/div[3]/div[2]/button";
    private WebDriver driver;

    public DominosPage(WebDriver driver) { this.driver = driver;}

    public void clickButtonAddMargariteToProductPacket() {
        driver.findElement(By.xpath(buttonAddToProductPacket)).click();
    }

    public void clickButtonProductPacket() {
        driver.findElement(By.xpath(buttonProductPacket)).click();
    }

    public void clickButtonChechoutOrder() {
        driver.findElement(By.xpath(buttonCheckoutOrder)).click();
    }

    public String getTextPizzaMargarite() {
        return driver.findElement(By.xpath(pizzaMargaritaOrderConfirmed)).getText();
    }

    public void clickButtonCloseBunner() {
        driver.findElement(By.xpath(buttonCloseBunner)).click();
    }

}
