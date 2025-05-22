package javacore.chapter05.object.exercise;

public class Timer {

    private String name;
    private int seconds;
    private int minutes;
    private int hours;

    public Timer(String name, int seconds, int minutes, int hours) {
        this.name = name;
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public void launch() throws InterruptedException {
        while (!(this.hours == 0 && this.minutes == 0 && this.seconds == 0)) {
            displayTime();
            Thread.sleep(1000);
            this.seconds--;
            if (this.seconds < 0) {
                this.seconds = 59;
                this.minutes--;
                if (this.minutes < 0) {
                    this.minutes = 59;
                    this.hours--;
                }
            }
        }
        displayTime();
        System.out.println("Fin du minuteur");
    }


    public void displayTime() {
        System.out.printf("%s : %02d:%02d:%02d%n", this.name, this.hours, this.minutes, this.seconds);
    }

    public static void main(String[] args) {


        try {
            if (args.length != 4 || args[0].equals("-h") || args[0].equals("--help")) {
                System.out.println("""
                Usage: java -jar Timer.jar <name> <hours> <minutes> <seconds>
                Example: java -jar Timer.jar "Pates Carbonara" 0 10 30
                """);
                return;
            }

            String name = args[0];
            int hours = Integer.parseInt(args[1]);
            int minutes = Integer.parseInt(args[2]);
            int seconds = Integer.parseInt(args[3]);

            Timer stopwatch = new Timer(name, seconds, minutes, hours);
            stopwatch.launch();
        } catch (NumberFormatException e) {
            System.err.println("Erreur : les heures, minutes et secondes doivent etre des entiers.");
        } catch (Exception e) {
            System.err.println("Erreur inattendue : " + e.getMessage());
        }
    }
}
