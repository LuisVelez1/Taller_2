package patrones;

import patrones.servicios.PaymentService;

public class PaymentAdapter implements PaymentService {

    private ExternalPaymentService externalService;

    public PaymentAdapter(ExternalPaymentService service) {
        this.externalService = service;
    }

    @Override
    public void pay(double amount) {
        externalService.processExternalPayment(amount, "COP");
    }
}
