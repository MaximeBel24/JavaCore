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
        while (!(hours == 0 && minutes == 0 && seconds == 0)) {
            displayTime();
            Thread.sleep(1000);
            if (seconds > 0) {
                seconds--;
            } else {
                seconds = 59;
                if (minutes > 0) {
                    minutes--;
                } else {
                    minutes = 59;
                    if (hours > 0) {
                        hours--;
                    }
                }
            }
        }
        displayTime();
        System.out.println("Fin du minuteur");
    }

    public void displayTime() {
        System.out.printf("%s : %02d:%02d:%02d%n", name, hours, minutes, seconds);
    }

    public static void main(String[] args) throws InterruptedException {
        Timer stopwatch = new Timer("Boeuf Bourguignon", 5, 1, 3);
        stopwatch.launch();
    }
}
