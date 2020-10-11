import java.util.Random;

public class Launcher {

    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        int xRandom = 0;
        int aRandom = 0;
        int yRandom = 0;

        CircularQueue q = new CircularQueue(10);

        Random rnd = new Random();
        rnd.setSeed(3);

        for(int i = 0; i < 3; i++) {
            min = 1;
            max = 5;
            xRandom = rnd.nextInt((max - min) + 1) + min;

            for(int x = 0; x < xRandom; x++) {
                min = 0;
                max = 99;
                aRandom = rnd.nextInt((max - min) + 1) + min;
                q.enQueue(aRandom);
            }
            min = 1;
            max = 5;
            yRandom = rnd.nextInt((max - min) + 1) + min;
            for(int y = 0; y < yRandom; y++) {
                q.deQueue();
            }
            //q.displayQueue();
        }
        System.out.println("\nFinally, Output the resulting queue.." +
                "\n\tIf the queue is empty, output:\n\t\t'Empty Queue'");
        q.displayQueue();
    }
}
