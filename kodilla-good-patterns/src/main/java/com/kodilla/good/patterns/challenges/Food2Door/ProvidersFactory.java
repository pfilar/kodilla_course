package com.kodilla.good.patterns.challenges.Food2Door;

public class ProvidersFactory {
    public static Provider getProvider(FoodProviders provider) {
        if(provider == FoodProviders.GLUTEN_FREE_SHOP) {
            return new GlutenFreeShop();
        } else if(provider == FoodProviders.HEALTHY_SHOP){
            return new HealthShoop();
        } else {
            return new ExtraFoodShop();
        }
    }
}
