package javacore.chapter02.condition.exercise;

public class AgeBasedDiscount {
    public static void main(String[] args) {
        // 25, 65
        int age = 27;

        //37.5 12.5
        double price = 50;

        System.out.println("Vous avez " + age + " ans.");


        if( age <= 25 ) {
            price -= ( price * 25 / 100 );
            System.out.println("Vous bénéficiez du forfait Jeune.");
            System.out.println("Le prix de votre billet de train est de " + price + "€.");
        }
        else if ( age >= 65 ) {
            price -= ( price * 75 / 100 );
            System.out.println("Vous bénéficiez du forfait Senior.");
            System.out.println("Le prix de votre billet de train est de " + price + "€.");
        }
        else {
            System.out.println("Le forfait basique est appliqué.");
            System.out.println("Le prix de votre billet de train est de " + price + "€.");
        }
    }
}
