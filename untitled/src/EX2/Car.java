package EX2;

import java.io.IOException;
import java.util.Random;

public class Car implements Runnable {
    private String name;

    public Car(String name) {
        this.name = name;
    }


    @Override
    public  void run(){
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        int DISTANCE = 100;
        int STEP = 2;

        while (runDistance < DISTANCE) {
            int speed = (new Random()).nextInt(20);
            runDistance += speed;
            String log = "|";
            int percentTravel = (runDistance * 100) / DISTANCE;
            for (int i = 0; i < DISTANCE; i+= STEP) {
                if (percentTravel >= i + STEP) {
                    log += "=";
                } else if (percentTravel >= i && percentTravel < i + STEP) {
                    log += "o";
                } else {
                    log += "-";
                }
            }
            log += "|";
            System.out.println("Car" + this.name + ":" + log + " " + Math.min(DISTANCE, runDistance) + "KM");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "ms" );
    }
}

