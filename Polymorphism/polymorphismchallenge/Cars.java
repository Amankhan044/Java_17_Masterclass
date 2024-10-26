// Cars.java
package Polymorphism.polymorphismchallenge;

public class Cars {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Cars(int cylinders, String name) {
        engine = true;
        wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return this.getClass().getSimpleName() + " engine is starting...";
    }

    public String accelerate() {
        return this.getClass().getSimpleName() + " is accelerating....";
    }

    public String brake() {
        return this.getClass().getSimpleName() + " is braking...";
    }

    public static class Mitsubishi extends Cars {
        public Mitsubishi(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String accelerate() {
            return this.getClass().getSimpleName() + " is accelerating....";
        }

        @Override
        public String brake() {
            return this.getClass().getSimpleName() + " is braking...";
        }

        @Override
        public String startEngine() {
            return this.getClass().getSimpleName() + " engine is starting...";
        }
    }

    public static class Holden extends Cars {
        public Holden(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String accelerate() {
            return this.getClass().getSimpleName() + " is accelerating....";
        }

        @Override
        public String brake() {
            return this.getClass().getSimpleName() + " is braking...";
        }

        @Override
        public String startEngine() {
            return this.getClass().getSimpleName() + " engine is starting...";
        }
    }

    public static class Ford extends Cars {
        public Ford(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String accelerate() {
            return this.getClass().getSimpleName() + " is accelerating....";
        }

        @Override
        public String brake() {
            return this.getClass().getSimpleName() + " is braking...";
        }

        @Override
        public String startEngine() {
            return this.getClass().getSimpleName() + " engine is starting...";
        }
    }
}
