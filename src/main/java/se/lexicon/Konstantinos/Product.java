package se.lexicon.Konstantinos;

public abstract class Product {
    private int price;
    private String ProductName;
    private String calories;
    private int productNumber;
    private String contains;

    public Product(int price, String procuctName, String calories, int productNumber, String contains) {
        this.price = price;
        ProductName = procuctName;
        this.calories = calories;
        this.productNumber = productNumber;
        this.contains = contains;
    }

    public int getPrice() {
        return price;
    }

    public String getProductName() {
        return ProductName;
    }

    public String getCalories() {
        return calories;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public String getContains() {
        return contains;
    }

    public abstract String examaninerad();
    public abstract String use();
}
