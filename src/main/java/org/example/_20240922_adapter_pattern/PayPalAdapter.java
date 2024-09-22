package org.example._20240922_adapter_pattern;

public class PayPalAdapter implements Payable{
    private final PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void doPayment() {
        payPal.pay();
    }
}
