package EX5;

public class OddThread implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i < 10 ; i=i+2) {
            System.out.println("Odd Number" + i);
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
