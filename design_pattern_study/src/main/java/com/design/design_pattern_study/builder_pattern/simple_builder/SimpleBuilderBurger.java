package com.design.design_pattern_study.builder_pattern.simple_builder;

public class SimpleBuilderBurger {
    private int bun;
    private int patty;
    private boolean cheese;
    private boolean tomato;

    public static SimpleBuilderBurger.Builder builder() {
        return new SimpleBuilderBurger.Builder();
    }

    private SimpleBuilderBurger(Builder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.tomato = builder.tomato;
    }

    public static class Builder {
        private int bun;
        private int patty;
        private boolean cheese;
        private boolean tomato;

        public Builder bun(int bun) {
            this.bun = bun;
            return this;
        }

        public Builder patty(int patty) {
            this.patty = patty;
            return this;
        }

        public Builder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder tomato(boolean tomato) {
            this.tomato = tomato;
            return this;
        }

        public SimpleBuilderBurger build() {
            return new SimpleBuilderBurger(this);
        }
    }
}
