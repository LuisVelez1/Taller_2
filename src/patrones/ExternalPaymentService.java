package patrones;

public class ExternalPaymentService {

    public void processExternalPayment(
            double amount, String currency) {

        System.out.println(
                "Pago externo: " + amount + " " + currency
        );
    }
}
