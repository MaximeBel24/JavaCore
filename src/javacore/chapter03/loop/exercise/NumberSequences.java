package javacore.chapter03.loop.exercise;

public class NumberSequences {

    public static void main(String[] args){

        System.out.println("Ordre croissant : ");
        int x = 1;
        while(x <= 10){
            System.out.println(x);
            x++;
        }

        System.out.println("Ordre décroissant : ");
        int y = 10;
        while (y >= 1){
            System.out.println(y);
            y--;
        }

        System.out.println("Nombres pairs : ");
        int z = 2;
        while (z <= 20){
            System.out.println(z);
            z += 2;
        }

    }
}
