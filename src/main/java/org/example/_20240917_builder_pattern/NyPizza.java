package org.example._20240917_builder_pattern;

import java.util.Objects;

public class NyPizza extends Pizza{
    public enum Size {SMALL, MEDIUM, LARGE}
    private final Size size;
    NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;
        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    @Override
    public String toString() {
        return "NyPizza{" +
                "toppings=" + toppings + "\n" +
                "size=" + size +
                '}';
    }
}
