package org.example._20240917_builder_pattern;

//builder pattern
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public NutritionFacts(NutritionFactsBuilder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    public static NutritionFactsBuilder builder() {
        return new NutritionFactsBuilder();
    }

    public static class NutritionFactsBuilder {
        private int servingSize = -1;
        private int servings = -1;
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public NutritionFactsBuilder() {
        }

        public NutritionFactsBuilder servingSize(int servingSize){
            this.servingSize = servingSize;
            return this;
        };
        public NutritionFactsBuilder servings(int servings){
            this.servings = servings;
            return this;
        };
        public NutritionFactsBuilder calories(int calories){
            this.calories = calories;
            return this;
        };
        public NutritionFactsBuilder fat(int fat){
            this.fat = fat;
            return this;
        };
        public NutritionFactsBuilder sodium(int sodium){
            this.sodium = sodium;
            return this;
        };
        public NutritionFactsBuilder carbohydrate(int carbohydrate){
            this.carbohydrate = carbohydrate;
            return this;
        };

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}
