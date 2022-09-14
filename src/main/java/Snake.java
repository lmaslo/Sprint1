package main.java;

import java.util.Objects;

public class Snake {
    public String name;
    public int age;
    public int speed;

    public Snake(String name, int age, int speed) {
        this.name = name;
        this.age = age;
        this.speed = speed;
    }

    public Snake(){

    }

    public static void main(String[] args){
        Snake snake = new Snake("Nagayna", 10,100);

        assert snake.age == 10 : "Actual " + snake.age;
        assert Objects.equals("Nagayna",snake.name): "Actual " + snake.name;

        Snake snake2 = new Snake("Nag", 20,200);
        assert snake2.age == 20 : "Actual " + snake.age;
        assert Objects.equals("Nag",snake2.name): "Actual " + snake2.name;

    }
}
