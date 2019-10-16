package com.company;

public abstract class LandTransport implements transport {
   public abstract void ride();
   public abstract void transfer();
   public abstract void fuel();
   public abstract void wheel();
}

class Car extends LandTransport {


   @Override
   public void ride() {
      System.out.println("Ехать на " + distance + "km");
   }

   @Override
   public void transfer() {
      System.out.println("Перевозить");
   }
   @Override
   public void fuel() {
      System.out.println("Топливо " + fuelVolume);
   }

   public void gearChange(int countGear) {
      if (countGear < 3) {
         System.out.println("Вы видели нечто с таким количеством передач?");
      } else if (countGear < 7 || countGear > 3) {
         System.out.println("Нормальный автомобиль с нормальным колчиеством передач -" + countGear);
      } else {
         System.out.println(" Это уже бред какой - то ");
      }
   }

   @Override
   public void wheel() {
      System.out.println("Ну тут попроще -" +  " 4 колеса");
   }

   public void name() {
      System.out.println("Это машина");
   }
}

class Tractor extends LandTransport {
   @Override
   public void ride() {
      System.out.println("Ехать на" + distance + "km");
   }
   @Override
   public void transfer() {
      System.out.println("Перевозить");
   }
   @Override
   public void fuel() {
      System.out.println("Топливо");
   }

   public void trailerChange() {
      System.out.println("А тащить трактор может много");
   }

   @Override
   public void wheel() {
      System.out.println("Колес может быть еще больше...");
   }
}

class Moto extends LandTransport {
   @Override
   public void ride() {
      System.out.println("Ехать на" + distance + "km");
   }
   @Override
   public void transfer() {
      int countMoto = count - 8;
      System.out.println("Перевозить " + countMoto);
   }
   @Override
   public void fuel() {
      System.out.println("Топливо " + fuelVolume);
   }

   @Override
   public void wheel() {
      System.out.println("А колес у мотоцикла - 2");
   }
}

