package com.company;


public abstract class FlyingTransport implements transport {

   public abstract void transfer();
   public abstract void fuel();
   public abstract void fly();

}

class Destroyer extends FlyingTransport {

   @Override
   public void transfer() {
      System.out.println("Перевоз груза и оружия" + count);
   }

   @Override
   public void fuel() {
      System.out.println("Топливо в любом случае заправлять, а так тут - " + fuelVolume + "л");
   }

   @Override
   public void fly() {
      System.out.println("Мощно летает на расстояние " + distance + "km");
   }

   private Stels stels = new Stels("Stels");


   private class Stels {

      private int countWeap;

      private Stels(String nameWeap) {
         System.out.println("Самолет, вида - " + nameWeap);
         countWeap = 3;
      }

   }

   public void stelsTakeoff() {
      System.out.println("Орудия у истребителя - " + stels.countWeap);
   }


}

class Aircraft extends FlyingTransport {

   @Override
   public void transfer() {
      System.out.println("Сколько людей перевозит?" + count);
   }

   @Override
   public void fuel() {
      System.out.println("Топлива много надо " + fuelVolume);
   }

   @Override
   public void fly() {
      System.out.println("Летает рейсами на " + distance + "km");
   }

   public void capacity() {
      System.out.println("Вместимость людей " + count);
   }
}

class Cornhusker extends FlyingTransport {

   @Override
   public void transfer() {
      System.out.println("Перевоз груза -" + count + "human");
   }

   @Override
   public void fuel() {
      System.out.println("Обьем топлива кукурузника - " + fuelVolume);
   }

   @Override
   public void fly() {
      System.out.println("Летает на расстояние " + distance + "km");
   }

   public void volumePollination() {
      System.out.println("Обьем опыления кукурузы");
   }
}
