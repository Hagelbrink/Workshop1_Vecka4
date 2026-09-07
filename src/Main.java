void main() {

    Product product = new Product("Bröd", 30, 3);
    OrderLine orderLine = new OrderLine(product, 2);

    Order order = new Order();

    order.addOrderLine(orderLine);
    order.ship();

    //menu();






            //IO.println();
}

//void menu() {
//    IO.println("""
//            1. Skapa produkt
//            2. Visa produkt
//            3. Avsluta
//            """);
//
//    String inputString = IO.readln("Välj ett alternativ: ");
//    int inputNumber = Integer.parseInt(inputString);
//
//    try {
//        switch (inputNumber) {
//            case 1: IO.println("Skapa produkt");
//            case 2: IO.println("Visa produkt");
//            case 3: IO.println("Avsluta");
//            default : IO.println("Invalid input!");
//        }
//    }
//    catch (NumberFormatException e){
//        IO.println("You need to enter a number.");
//    }
//    IO.println("program continue");
//}