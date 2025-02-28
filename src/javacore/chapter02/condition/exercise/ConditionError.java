package javacore.chapter02.condition.exercise;

public class ConditionError {

    public static void main(String[] args) {

        int age = 80;

        if (age <= 16) {
            System.out.println("Vous êtes mineur.");
        } else if (age == 17) {
            System.out.println("Vous êtes bientôt majeur !");
        } else if (age == 18) {
            System.out.println("Vous êtes majeur.");
        } else if (age > 18 && age <= 60) {
            System.out.println("Vous êtes un adulte.");
        } else if (age < 100) {
            System.out.println("Vous n'êtes plus tout jeune.");
        } else {
            System.out.println("Vous êtes une exception dans ce monde !");
        }

        // Dans le cas de age = 80, le programme entre dans la condition (age > 18) qui est la 1ere condition vraie
        // Pour corriger cela, il faut utilisé l'opérateur logique ET pour ajouté une limite à l'age de cette condiction ( && age <= 60)
        // Cette condition affichera donc "Vous êtes un adulte" pour un age supérieur à 18 ET inférieur ou égale à 60
        // Le programme pourra ensuite entré dans les prochaines conditions si l'age est supérieur à 60
    }
}
