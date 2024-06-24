package com.amigoscode;
import java.util.ListIterator;
import java.util.Queue;
import java.util.LinkedList;
public class WorkingWithLinkedList {


    public static void main(String[] args) {

LinkedList<Person> linkedList = new LinkedList();

linkedList.add(new Person("alex",18));
linkedList.add(new Person("alexa",17));
        linkedList.addFirst(new Person("ali",15));
        linkedList.addLast(new Person("Yash",18));




ListIterator<Person> personListIterator=linkedList.listIterator();
while(personListIterator.hasNext()){
    System.out.println(personListIterator.next());

}
        System.out.println();
        System.out.println();
        while(personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());

        }
        queues();
    }
    private static void queues() {
        Queue<WorkingWithQueues.Person> supermarket= new LinkedList<>();
        supermarket.add(new WorkingWithQueues.Person("Yash",18));
        supermarket.add(new WorkingWithQueues.Person("Suraj",22));

        supermarket.add(new WorkingWithQueues.Person("Ravi",26));
       /* System.out.println(supermarket.size());

        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size ());
        System.out.println(supermarket.peek());*/


    }
    public record Person(String name,int age){}
}


