package org.example._20240921_observser_pattern;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private final String stockName;
    private int price;
    private final List<Observer> observers;

    //not available constructor
    private Stock(){
        stockName = null;
        observers = null;
    }

    private Stock(String stockName, int price, List<Observer> observers) {
        this.stockName = stockName;
        this.price = price;
        this.observers = observers;
    }

    private static void setDefaultObservers(Stock stock) {
        stock.addObserver(new AdminObserver());
    }

    private void addObserver(Observer observer) {
        observers.add(observer);
    }

    public static Stock createNew(String stockName, int price) {
        Stock stock = new Stock(stockName, price, new ArrayList<>());
        setDefaultObservers(stock);
        return stock;
    }

    public void setPrice(int price) {
        notifyObservers(this, this.price, price);
        this.price = price;
    }

    public void notifyObservers(Stock stock, int newPrice, int oldValue) {
        observers.forEach(observer -> observer.update(stock, newPrice, oldValue));
    }

    public String getStockName() {
        return stockName;
    }

    public int getPrice() {
        return price;
    }
}
