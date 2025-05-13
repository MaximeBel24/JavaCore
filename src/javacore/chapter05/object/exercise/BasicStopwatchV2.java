package javacore.chapter05.object.exercise;

public class BasicStopwatchV2 {

    int seconds;
    int minutes;
    int hours;

    public void launch() throws InterruptedException {
        while(true) {

            displayTime();

            Thread.sleep(1);

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
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }

    public static void main(String[] args) throws InterruptedException {
        BasicStopwatchV2 stopwatch = new BasicStopwatchV2();

        stopwatch.seconds = 0;
        stopwatch.minutes = 0;
        stopwatch.hours = 0;

        stopwatch.launch();
    }
}
