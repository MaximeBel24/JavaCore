package javacore.chapter01.variable.exercise;

public class VariablesPermutation {

    public static void main(String[] args){

        int a = 5;
        int b = 10;

        System.out.println("Avant permutation :");
        System.out.println("a vaut " + a);
        System.out.println("b vaut " + b);

        int c  = a;
        a = b;
        b = c;

        System.out.println("Après permutation :");
        System.out.println("a vaut " + a);
        System.out.println("b vaut " + b);


    }




}
