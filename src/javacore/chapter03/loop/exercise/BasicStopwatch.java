package javacore.chapter03.loop.exercise;

public class BasicStopwatch {

    public static void main(String[] args) throws InterruptedException {

        int seconds = 1;
        int minutes = 0;

        int hours = 0;

        /*
         * Une boucle while qui itèrera 100x grâce à l'incrémentation de la variable i (à la fin de la boucle)
         */
        while(seconds <= 60) {

            /*
             * Effectue une "pause" de 1000 millisecondes / 1 seconde
             */
            Thread.sleep(1000);

            if (seconds == 60){
                minutes++;
                seconds = 0;
            }

            if (minutes == 60){
                hours++;
                minutes=0;
            }

            System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);

            /*
             * Incrémente "i = i + 1;" pour atteindre la condition de la boucle while
             */
            seconds++;
        }

    }
}
