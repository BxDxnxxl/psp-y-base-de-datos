package Bufferconchar;

public class Productor extends Thread {
    
    private Buffer buffer;
    private final String letras = "eufsdigfdsugiusfgfdhs";

    public Productor(Buffer buffer){
        this.buffer=buffer;
    }

    @Override
    public void run() {
        while(true){
            try {
             char c = letras.charAt((int) (Math.random() * letras.length()));
             buffer.producir(c);
             System.out.println("sacando letra "+ c);
             
                sleep((int)Math.random() * 4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }

    
}
