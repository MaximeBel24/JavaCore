package javacore.chapter05.object.exercise;

public class BasicStopwatchV2 {

    String name;

    int seconds;
    int minutes;
    int hours;

    public BasicStopwatchV2(String name, int seconds, int minutes, int hours) {
        this.name = name;
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public void launch() throws InterruptedException {
        while(true) {

            displayTime();

            Thread.sleep(1000);

            seconds++;
            if (seconds == 60){
                minutes++;
                seconds = 0;
            }

            if (minutes == 60){
                hours++;
                minutes = 0;
            }

        }
    }

    public void displayTime() {
        System.out.printf("%s : %02d:%02d:%02d%n", name, hours, minutes, seconds);
    }

    public static void main(String[] args) throws InterruptedException {
        BasicStopwatchV2 stopwatch = new BasicStopwatchV2("Oeufs Durs", 0, 0, 0);

        stopwatch.launch();
    }
}
