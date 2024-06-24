package com.amigoscode;
import java.util.Arrays;
public class TheArrays {
    public static void main(String[] args) {
        String[] colors=new String[5];
        colors[0] ="purpl";
        colors[1] ="Red";
        colors[2] ="Green";
        colors[3] ="Blue";
        colors[4] ="Orange";
        System.out.println(Arrays.toString(colors));

        int[] numbers = {100,200};
       for(int i=colors.length-1;i>=0;i--){
           System.out.println(colors[i]);
       }System.out.println();
        System.out.println();

       for(String color:colors){
           System.out.println(color);
       }
        System.out.println();
        System.out.println();
Arrays.stream(colors).forEach(System.out::println);


    }
}
