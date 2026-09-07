public class OrderLine {
    Product product;
    int quantity;

    OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;

        if (quantity <= 0) {
            throw new MinQuantityException("Quantity must be greater than 0.");
        }


    }

    public Product getProduct() {
        return this.product;
    }
    public int getQuantity() {
        return this.quantity;
    }

    public Product setProduct(Product product) {
        this.product = product;
        return product;
    }
    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new RuntimeException("Quantity must be greater than 0.");
        }
        this.quantity = quantity;
    }
}
