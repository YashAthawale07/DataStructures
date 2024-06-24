package com.amigoscode;
import java.util.Queue;
import java.util.LinkedList;
public class WorkingWithQueues {
    public static void main(String[] args) {
        Queue<Person> supermarket= new LinkedList<>();
        supermarket.add(new Person("Yash",18));
        supermarket.add(new Person("Suraj",22));

        supermarket.add(new Person("Ravi",26));
        System.out.println(supermarket.size());

        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size ());
        System.out.println(supermarket.peek());


    }
    public record Person(String name,int age){}
}
