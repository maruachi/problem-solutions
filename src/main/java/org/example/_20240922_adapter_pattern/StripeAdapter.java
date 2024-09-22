package org.example._20240922_adapter_pattern;

public class StripeAdapter implements Payable{
    private final Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }


    @Override
    public void doPayment() {
        stripe.charge();
    }
}
