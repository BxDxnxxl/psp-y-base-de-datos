package Bufferconchar;

public class Buffer{
    private char[] buffer;
    private int siguiente;
    private boolean estaVacia;
    private boolean estaLlena;

    public Buffer(int tamanio){
            this.buffer=new char[tamanio];
            this.siguiente = 0;
            this.estaVacia = true;
            this.estaLlena =false;
    }

    public synchronized char consumir(){

        while(estaVacia){
            try {
                wait();
            } catch (Exception e) {
                
            }
        }
        siguiente--;
        this.estaLlena=false;
        if(siguiente==0){
            this.estaVacia=true;
        }
        notifyAll();
        return this.buffer[this.siguiente];
    }

    public synchronized void producir(char c){
        while(estaLlena){
            try {
                wait();
            } catch (Exception e) {
                
            }
        }
        buffer[siguiente]= c;
        siguiente++;
        this.estaVacia=false;

        if(siguiente== this.buffer.length){
            this.estaLlena=true;
        }
        notifyAll();
    }
}
