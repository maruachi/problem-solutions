package org.example._20240917_builder_pattern;

public class Main {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = NutritionFacts.builder()
                .servingSize(1)
                .servings(3)
                .calories(0)
                .fat(0)
                .carbohydrate(0)
                .sodium(0)
                .build();

        System.out.println("nutritionFacts = " + nutritionFacts);
    }
}
