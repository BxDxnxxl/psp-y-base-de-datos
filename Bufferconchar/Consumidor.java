package Bufferconchar;

public class Consumidor extends Thread {
    private Buffer buffer;
    

    public Consumidor(Buffer buffer){
        this.buffer=buffer;
    }

    @Override
    public void run() {
        while(true){
            try {
             char c = this.buffer.consumir();
             System.out.println("cogiendo "+ c);
             
                sleep((int)Math.random() * 4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }

}
