public class Product {
    String name;
    int price;
    int stockQuantity;

    public Product(String name, int price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;

        if (name.isEmpty()) {
            throw new RuntimeException("Product name is empty");
        }

        if (price < 0) {
            throw new NegativePriceException("Product price is negative");
        }

    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }


}
