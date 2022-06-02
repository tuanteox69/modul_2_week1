package Tao_thread_dongian;

public class NumberGenerator extends Thread{

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println( i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }
    }

