package patrones;

import patrones.servicios.InventoryService;
import patrones.servicios.NotificationService;
import patrones.servicios.PaymentService;

public class PurchaseFacade {

    private PaymentService payment;
    private InventoryService inventory;
    private NotificationService notification;

    public PurchaseFacade(
            PaymentService payment,
            InventoryService inventory,
            NotificationService notification) {

        this.payment = payment;
        this.inventory = inventory;
        this.notification = notification;
    }

    public void realizarCompra(String product, double amount) {

        System.out.println("\n=== COMPRA DEPORTIVA ===");

        if (!inventory.checkStock(product)) {
            System.out.println("Producto no disponible.");
            return;
        }

        payment.pay(amount);

        notification.send("Compra realizada: " + product + " por " + amount + " COP");

        System.out.println("Compra finalizada.");
    }
}