package org.example._20240922_adapter_pattern;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Payable[] payables = new Payable[]{
                new PayPalAdapter(new PayPal()), new StripeAdapter(new Stripe())
        };

        Arrays.stream(payables).forEach(Payable::doPayment);
    }
}
