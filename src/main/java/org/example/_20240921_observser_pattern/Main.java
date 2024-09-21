package org.example._20240921_observser_pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello observer pattern");

        Stock stock = Stock.createNew("주식회사모씨", 100);
        stock.setPrice(200);
        stock.setPrice(300);
        stock.setPrice(400);
    }
}
