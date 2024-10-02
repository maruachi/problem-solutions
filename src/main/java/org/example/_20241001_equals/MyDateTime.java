package org.example._20241001_equals;

import java.util.Objects;

public class MyDateTime {
    private final int date;
    private final int time;

    public MyDateTime(int date, int time) {
        this.date = date;
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyDateTime)) return false;
        MyDateTime that = (MyDateTime) o;
        return date == that.date && time == that.time;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, time);
    }
}
