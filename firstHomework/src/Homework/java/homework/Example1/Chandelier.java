    package Homework.java.homework.Example1;

    public class Chandelier {
        private Bulb [] bulbs; //наш массив
        private static final Integer DEFAULT_BULB_COUNT = 3;

        public Chandelier(int countOfBulbs) {
            bulbs = new Bulb [countOfBulbs];
            for (int i = 0; i < countOfBulbs; i++) {
                bulbs[i] = new Bulb();
            }
        }
        public Chandelier() {
            bulbs = new Bulb[DEFAULT_BULB_COUNT];
            for (int i = 0; i < bulbs.length; i++) {
                bulbs[i] = new Bulb();
            }
        }

        public void turnOn() {
            for (Bulb bulb: bulbs) {
                bulb.turnOn();
            }
        }
        public void turnOff() {
            for (Bulb bulb: bulbs) {
                bulb.turnOff();
            }
        }
        public boolean isShining() {
            return bulbs[0].isShining();
        }

    }
