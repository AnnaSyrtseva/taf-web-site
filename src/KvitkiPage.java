package by.itacademy.asyrtseva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KvitkiPage {
    private String buttonCookie = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]";
    private String loginButtonLocator = "/html/body/div[3]/div[2]/div/app-user-account-link";
    private String textLoginLabel = "//*[@id=\"mat-tab-label-0-0\"]/span[2]";
    private String inputLoginEmailLocator = "/html/body/div[9]/div[2]/div/mat-dialog-container/div/div/app-user-auth-form/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/div";
    private String buttonBunnerClose = "/html/body/div[7]/div";
    private String inputLoginPasswordLocator = "/html/body/div[9]/div[2]/div/mat-dialog-container/div/div/app-user-auth-form/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[2]/app-password-input/div";
    private String textErrorNoEmail = "//*[@id=\"mat-tab-content-1-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/app-field-error/app-collapsible";
    private String textErrorNoPassword = "//*[@id=\"mat-tab-content-1-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[2]/app-password-input/app-field-error/app-collapsible";
    private String textErrorEnterValidEmail = "//*[@id=\"mat-tab-content-1-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/app-field-error";
    private WebDriver driver;
    public KvitkiPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickButtonCookie(){
        driver.findElement(By.xpath(buttonCookie)).click();
    }
    public void clickLoginButton(){
        driver.findElement(By.xpath(loginButtonLocator)).click();
    }
    public String getTextLoginLabel (){
        return driver.findElement(By.xpath(textLoginLabel)).getText();
    }
    public void clickInputLoginEmail() {
        driver.findElement(By.xpath(inputLoginEmailLocator));
    }
    public void sendKeysInputLoginEmail(String newEmail) { driver.findElement(By.xpath(inputLoginEmailLocator)).sendKeys(newEmail);}
    public void clickButtonBunnerClose(){ driver.findElement(By.xpath(buttonBunnerClose)).click(); }
    public void clickInputLoginPassword() { driver.findElement(By.xpath(inputLoginPasswordLocator)).click(); }
    public String getTextErrorNoEmail(){return driver.findElement(By.xpath(textErrorNoEmail)).getText();}
    public String getTextErrorNoPassword(){return driver.findElement(By.xpath(textErrorNoPassword)).getText();}
    public String getTextErrorEnterValidEmail(){ return driver.findElement(By.xpath(textErrorEnterValidEmail)).getText();}
}