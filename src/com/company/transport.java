package com.company;

public interface transport {
   public static final int fuelVolume = 100; // Вливаем одинаковый обьем топлива
   public static final int distance = 400; // Расстояние пролететь/проехать/проплыть
   public static final int count = 10; // Перевозить 10 человек / орудий

   void transfer();
   void fuel();
}

