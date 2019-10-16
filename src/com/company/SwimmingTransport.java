package com.company;

public abstract class SwimmingTransport implements transport {
    public abstract void swim ();
    public abstract void transfer();
    public abstract void fuel();
    public abstract void capacity();

    public static int swimming = 100;

    static class Submarine extends SwimmingTransport {
        public int depthInLevel = 100;


        @Override
        public void swim () {
            System.out.println("Плывем " + swimming + "m");
        }
        @Override
        public void transfer () {
            System.out.println("Перевозим");
        }
        @Override
        public void fuel() {
            System.out.println("Остаток топлива " + fuelVolume);
        }

        public void depth(){
            System.out.println("Глубина погружения - " + depthInLevel);
        }

        @Override
        public void capacity() {
            System.out.println("Мощность подлодки велика");
        }

    }

    static class Boat extends SwimmingTransport {
        @Override
        public void swim () {
            System.out.println("Плывем " + distance + "km");
        }
        @Override
        public void transfer () {
            System.out.println("Перевозим");
        }
        @Override
        public void fuel() {
            System.out.println("Остаток топлива " + fuelVolume);
        }

        @Override
        public void capacity() {
            System.out.println("Мощность у лодки не велика");
        }

        public void name() {
            System.out.println("Это лодка Константин");
        }
    }

    static class Ship extends SwimmingTransport {


        @Override
        public void swim () {
            System.out.println("Плывем " + swimming + "m");
        }
        @Override
        public void transfer () {
            System.out.println("Перевозим");
        }
        @Override
        public void fuel() {
            System.out.println("Остаток топлива");
        }

        public void weigth() {
            System.out.println("Корабль тяжелая штука");
        }

        @Override
        public void capacity(){
            System.out.println("Вместимость людей");
        }
    }


}


