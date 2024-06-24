package com.amigoscode;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls= new HashSet();

        balls.add(new Ball("Red"));
        balls.add(new Ball("Blue"));

        balls.add(new Ball("Orange"));
        balls.forEach(System.out::println);
        System.out.println();
        balls.remove(new Ball("red"));
        balls.forEach(System.out::println);
        System.out.println(balls.size());
    }
    record Ball(String color){

    }
}
