public class Order {
    OrderLine[] orderLines;

    public Order() {
        orderLines = new OrderLine[5];
    }

    void ship() {
        boolean hasOrderLine = false;

        for (OrderLine orderLine : orderLines) {
            if (orderLine != null) {
                hasOrderLine = true;

                Product product = orderLine.getProduct();

                if (product.getStockQuantity() < orderLine.getQuantity()) {
                    throw new MinQuantityException("Not enough stock");
                }

                product.setStockQuantity(
                        product.getStockQuantity() - orderLine.getQuantity()
                );
            }
        }

        if (!hasOrderLine) {
            throw new RuntimeException("Order can't be shipped");
        }

        IO.println("Order shipped");
    }

    public void addOrderLine(OrderLine orderLine) {
        for (int i = 0; i < orderLines.length; i++) {
            if (orderLines[i] == null) {
                orderLines[i] = orderLine;
                return;
            }
        }
    }
}
