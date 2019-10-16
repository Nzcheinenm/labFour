package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        SwimmingTransport.Boat boatSwim = new SwimmingTransport.Boat(); // Проверяем и создаем вложенный  класса обьект
        boatSwim.name(); // Что б красив вывод был
        boatSwim.fuel(); // Проверяем топливо
        boatSwim.swim(); // Плывем
        System.out.println("\n");

        Car car = new Car(); // Инициализируем обьект класса
        car.name(); // Что б красив вывод был
        car.fuel(); // Топлива залили
        car.gearChange(1); // Точно 1 передача??
        car.gearChange(4); // Так более походит на правду
        car.ride(); // Едем
        System.out.println("\n");

        Destroyer destFly = new Destroyer(); // Грозный самолет
        destFly.fly(); // Полетели
        destFly.stelsTakeoff(); // Орудия
        destFly.fuel();


    }
}
