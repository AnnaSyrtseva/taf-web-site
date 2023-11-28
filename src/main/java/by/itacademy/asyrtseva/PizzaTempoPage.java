package by.itacademy.asyrtseva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PizzaTempoPage {

        private String pizzaMenuButton = "/html/body/div[1]/div[3]/ul/li[1]";
        private String pizzaSize26Button = "//*[@id=\"1\"]/div/div[2]/div[2]/div[2]";
        private String margaritaOrderButton = "//*[@id=\"1\"]/div/div[2]/div[3]/div[3]";
        private String submitOrderButton = "//*[@id=\"order_pizza_popup\"]/div[2]/div[2]/div[2]/div[1]/div[3]/div[4]";
        private String busketHomeButton = "//*[@id=\"basket_placeholder\"]/div/div/div[1]/div[1]";
        private String pizzaInBusket = "//div[@class=\"content\"]//div[(contains(text(), \"Маргарита\"))]";
        private WebDriver driver;
        
        public PizzaTempoPage (WebDriver driver) {
            this.driver = driver;
        }

        public void clickPizzaMenuButton() {driver.findElement(By.xpath(pizzaMenuButton)).click();}

        public void clickPizzaSize26Button() {driver.findElement(By.xpath(pizzaSize26Button)).click();}

        public void clickMargaritaOrderButton() {driver.findElement(By.xpath(margaritaOrderButton)).click();}

        public void clickSubmitOrderButton() {driver.findElement(By.xpath(submitOrderButton)).click();}

        public void clickBusketHomeButton() {driver.findElement(By.xpath(busketHomeButton)).click();}

        public String getTextPizzaInBusket(){return driver.findElement(By.xpath(pizzaInBusket)).getText();}

    }
