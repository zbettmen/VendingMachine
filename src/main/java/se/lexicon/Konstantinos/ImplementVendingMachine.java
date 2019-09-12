package se.lexicon.Konstantinos;

public class ImplementVendingMachine implements VendingMachine {

    private Product[] ProductArrayList;
    private int saldo;

    public ImplementVendingMachine(Product[] productArrayList) {
        ProductArrayList = productArrayList;
        this.saldo = 0;
    }


    @Override
    public void addCurrency(AcceptedAmount ammount) {
        saldo += ammount.getAmounts();

    }

    @Override
    public Product productRequest(int productNumber) {
        //
        for(Product product : ProductArrayList){
            if(productNumber == product.getProductNumber()){ //product[i]
                System.out.println(product.getProductName());
                saldo -= product.getPrice();

            }return product;
        }
        System.out.println("enter a valid product number");
        return null;
    }

    @Override
    public boolean endSession() {
        return false;
    }

    @Override
    public String getDescription(int productNumber) {
        for(Product product : ProductArrayList){
            if (productNumber == product.getProductNumber()){
                return product.examaninerad();
            }
        }return "Product not found";
    }

    @Override
    public int getBalance() {
        return saldo;
    }

    @Override
    public String[] getProducts() {

        String[] pro = new String[ProductArrayList.length];
        for (int i = 0; i <ProductArrayList.length ; i++) {
            pro[i] = ProductArrayList[i].getProductName();

        }return pro;
    }

}
