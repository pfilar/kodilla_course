package com.kodilla.patterns.builder.bigmac;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(BunEnum bun) {
            this.bun = bun.toString().toLowerCase();
            return this;
        }

        public BigmacBuilder burgers(int number) {
            this.burgers = number;
            return this;
        }

        public BigmacBuilder sauce(SauceEnum sauce) {
            this.sauce = sauce.toString().toLowerCase();
            return this;
        }

        public BigmacBuilder ingredients(IngredientsEnum ingredient) {
            this.ingredients.add(ingredient.toString().toLowerCase());
            return this;
        }

        public Bigmac buildBigmac() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }

    }

    private Bigmac(final String bun, final int burgers, final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
