package by.itacademy.asyrtseva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RWPage {
    private String loginButtonLocator = "//*[@id=\"db\"]/div[1]/div[1]/div/header/div/div[3]/div[3]/ul/li[2]/a";
    private String authModalPage = "//*[@id=\"auth-popup\"]/div/div/div[1]/div";
    private String inputLoginEmail = "//*[@id=\"form-auth\"]/fieldset/div[1]/label/div[2]/input";
    private String submitButtonLocator = "//*[@id=\"form-auth\"]/fieldset/div[3]/input";
    private String errorPasswordMessage = "//*[@id=\"password-error\"]";
    private String errorLoginMessage = "//*[@id=\"login-error\"]";
    private String inputLoginPassword = "//*[@id=\"form-auth\"]/fieldset/div[2]/div[1]/div/label/div[2]/input";
    private String errorAuthMessage = "//*[@id=\"auth-popup\"]/div/div/div[2]/div[2]/div";

    private WebDriver driver;
    public RWPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickProfileButton() {
        WebElement profileButtonElement = driver.findElement(By.xpath(loginButtonLocator));
        profileButtonElement.click();
    }
    public String getTextAuthModalPage() {
        return driver.findElement(By.xpath(authModalPage)).getText();
    }
    public String setInputLoginEmail (String newEmail){
        WebElement inputLoginEmailElement = driver.findElement(By.xpath(inputLoginEmail));
        inputLoginEmailElement.sendKeys(newEmail);
        return null;
    }
    public String clickSubmitButton(){
        WebElement submitButtonElement = driver.findElement(By.xpath(submitButtonLocator));
        submitButtonElement.click();
        return null;
    }
    public String getTextErrorPassword(){

        return driver.findElement(By.xpath(errorPasswordMessage)).getText();
    }

    public String getTextErrorLogin(){
        return driver.findElement(By.xpath(errorLoginMessage)).getText();
    }

    public String setInputLoginPassword (String newPassword){
        WebElement inputLoginPasswordElement = driver.findElement(By.xpath(inputLoginPassword));
        inputLoginPasswordElement.sendKeys(newPassword);
        return null;
    }

    public String getErrorAuthMessage(){
        return driver.findElement(By.xpath(errorAuthMessage)).getText();
    }


}
