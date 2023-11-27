package by.itacademy.asyrtseva;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PizzaTempoTest extends BaseTest{

    @BeforeEach
    public void beforePizzaTempoTest() throws InterruptedException{
        driver.navigate().to("https://www.pizzatempo.by/");
        Thread.sleep(2000);
    }

    @Test
    public void putMargaritaPizzaInBusket() throws InterruptedException{
        PizzaTempoPage pizzaPage = new PizzaTempoPage(driver);
        pizzaPage.clickPizzaMenuButton();
        pizzaPage.clickPizzaSize26Button();
        pizzaPage.clickMargaritaOrderButton();
        Thread.sleep(2000);
        pizzaPage.clickSubmitOrderButton();
        Thread.sleep(2000);
        pizzaPage.clickBusketHomeButton();
        Thread.sleep(4000);
        String actual = pizzaPage.getTextPizzaInBusket();
        String expected = "Пицца \"Маргарита\"";
        Assertions.assertEquals(expected, actual);
    }

}
