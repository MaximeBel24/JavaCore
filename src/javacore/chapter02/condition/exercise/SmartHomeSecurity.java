package javacore.chapter02.condition.exercise;

public class SmartHomeSecurity {

    public static  void main(String[] args){

        boolean isHouseEmpty = false;

        boolean isOwnerAsleep = false;

        boolean areAllDoorsAndWindowsClosed = false;

        boolean isAlarmActivated = false;

        boolean isSafeModeActivated = ((isHouseEmpty && !isOwnerAsleep) || isHouseEmpty ) && areAllDoorsAndWindowsClosed && isAlarmActivated;

        if (isSafeModeActivated) {
            System.out.println("La maison est en mode sécurisé.");
        }
        else {
            System.out.println("Impossible d'activer le mode sécurisé");
            if (!isHouseEmpty){
                System.out.println("La maison n'est pas vide.");
            }
            if(!isOwnerAsleep){
                System.out.println("Le propriétaire ne dort pas. ");
            }
            if(!areAllDoorsAndWindowsClosed) {
                System.out.println("Les portes et les fenêtres ne sont pas toutes fermées.");
            }
            if(!isAlarmActivated) {
                System.out.println("L'alarme n'est pas activé.");
            }
        }

    }
}
