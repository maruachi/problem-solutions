package org.example._20241001_equals;

import java.util.Objects;

public class MyDateTimeDetail extends MyDateTime{
    private final int seconds;

    public MyDateTimeDetail(int date, int time, int seconds) {
        super(date, time);
        this.seconds = seconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MyDateTimeDetail that = (MyDateTimeDetail) o;
        return seconds == that.seconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seconds);
    }
}
