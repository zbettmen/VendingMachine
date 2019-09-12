package se.lexicon.Konstantinos;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AppTest {
    Product test = new Mat(50, "Kebab", "650", 1, "nasty stuff");
    Product testGodis = new Godis(25, "Toblerone", "1200", 2, "Nuts");
    Product testDricka = new Dricka(10, "Vatten", "0", 3, "Water");
    Product[] array = {test, testGodis, testDricka};
    ImplementVendingMachine testObject = new ImplementVendingMachine(array);


    @Test
    public void test_request() {
        int testProductnummber = 1;
        Product expected = array[0];
        Product actual = testObject.productRequest(testProductnummber);

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void test_add_curr() {
        int expected = 50;
        testObject.addCurrency(AcceptedAmount.FIFTY);
        int actual = testObject.getBalance();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void test_endsession() {
        boolean expected = false;
        boolean hej = testObject.endSession();
        Assert.assertEquals(expected, hej);


    }

    @Test
    public void test_descriptions() {

        int testNummer = 1;
        testObject.getProducts();
        String hej = array[0].examaninerad();
        String actual = testObject.getDescription(testNummer);
        Assert.assertEquals(hej, actual);


    }

    @Test

    public void test_dricka() {

        int nummer = 1;
        Product expected = array[0];
        String hej = "kebab";
        Product actual = testObject.productRequest(nummer);
        Assert.assertEquals(expected, actual);


    }


}
