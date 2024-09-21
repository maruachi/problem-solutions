package org.example._20240921_observser_pattern;

import java.text.MessageFormat;

public class AdminObserver implements Observer<Stock, Integer> {
    @Override
    public void update(Stock targetObject, Integer newValue, Integer oldValue) {
        System.out.println(MessageFormat.format("{0} 주식의 가격이 변동되었습니다. new price: {1} old price: {2}", targetObject.getStockName(), newValue, oldValue));
    }
}
