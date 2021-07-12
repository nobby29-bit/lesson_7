package ru.geekbrains;

public class Plate {
    private int food;
    public Plate (int food){
        this.food = food;
    }
    public boolean decreaseFood(int n, String nameCat) {
       boolean enough = n>food;
        if (n>food){
            System.out.println("В миске недостаточно еды. Коту "+nameCat+" не хватило");
        }else {
        food -= n;
            System.out.println("Кот: "+nameCat+" сыт");}
        return enough;
    }
    public void info(){
        System.out.println("в тарелке: "+food);
    }
}
