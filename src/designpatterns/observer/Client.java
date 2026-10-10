package designpatterns.observer;

public class Client {
    static void main() {
        Flipkart flipkart = new Flipkart();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator(flipkart);
        EmailService emailService = new EmailService(flipkart);
        SMSService smsService = new SMSService(flipkart);
        InventoryManagementSystem inventoryManagementSystem = new InventoryManagementSystem(flipkart);

        Order order = new Order();
        order.orderId = 101L;
        order.productId = 55L;
        order.customerEmail = "abc@example.com";
        order.customerPhoneNumber = "9999999999";

        flipkart.orderPlaced(order);
    }
}
