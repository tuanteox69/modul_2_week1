package hienthi_so_chan_le;

public class EvenThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <11; i++) {
            if (i%2!=0){
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
