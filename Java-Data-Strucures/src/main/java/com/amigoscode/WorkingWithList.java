package com.amigoscode;
import java.util.List;
import java.util.ArrayList;
public class WorkingWithList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList();

        colors.add("blue");
        colors.add("green");
        //1
        System.out.println(1);
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println();
        System.out.println();

        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("green"));
        System.out.println();
        System.out.println();
       //2
        System.out.println(2);
        for(String color : colors){
            System.out.println(color);
        }
//3
        System.out.println(3);
        colors.forEach(System.out::println);
        System.out.println();
        System.out.println();
        //4
        System.out.println(4);
        for(int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }

    }
}
