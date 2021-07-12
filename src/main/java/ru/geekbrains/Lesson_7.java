package ru.geekbrains;

public class Lesson_7 {
    public static void main(String [] args){
        Cat [] cats = {
                new Cat("Barsik",25, true),
                new Cat("Snejok",10, true),
                new Cat("Myrka",5, true),
                new Cat("Myrzik",35, true),
                new Cat("Dimok",45, true),
        };
        Plate plate = new Plate(100);
        plate.info();
        for (int i=0; i <cats.length; i++){
            cats[i].eat(plate);
            plate.info();
        }

    }
}
