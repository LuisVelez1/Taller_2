package patrones;

public class InventoryProxy implements InventoryService {

    private RealInventoryService realInventory;
    private boolean accessAllowed;

    public InventoryProxy(
            RealInventoryService realInventory,
            boolean accessAllowed) {

        this.realInventory = realInventory;
        this.accessAllowed = accessAllowed;
    }

    @Override
    public boolean checkStock(String product) {

        if (!accessAllowed) {
            System.out.println(
                    "Acceso denegado al inventario."
            );
            return false;
        }

        System.out.println("Acceso autorizado.");
        return realInventory.checkStock(product);
    }
}