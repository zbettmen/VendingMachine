package se.lexicon.Konstantinos;

public class Mat extends Product {
    public Mat(int price, String procuctName, String calories, int productNumber, String contains) {
        super(price, procuctName, calories, productNumber, contains);
    }

    @Override
    public String examaninerad() {
        return "Product info: " + getProductName() + " Price: " + getPrice() + " Calories: " + getCalories() + " Contains: " + getContains() + "Productnumber: " + getProductNumber();
    }

    @Override
    public String use() {
        return "Eat your " + getProductName();
    }


}