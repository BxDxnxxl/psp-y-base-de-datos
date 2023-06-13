package relojdigital;

import java.util.Observable;

public class Tiempo extends Observable implements Runnable {

    private int segundos;
    private int minutos;
    private int horas;

    
    public Tiempo(int segundos, int minutos, int horas) {
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
    }


    @Override
    public void run() {
        String tiempo;

        while (true) {
            try {
                
            
            tiempo="";
            if(horas<10){
                tiempo+= "0"+horas;
            }else{
                tiempo+= horas;
            }
            tiempo+= ":";
            if(minutos<10){
                tiempo+= "0"+minutos;
            }else{
                tiempo+= minutos;
            }
            tiempo+= ":";
            if(segundos<10){
                tiempo+= "0"+segundos;
            }else{
                tiempo+= segundos;
            }
            this.setChanged();
            this.notifyObservers(tiempo);
            this.clearChanged();
            Thread.sleep(1000);
            if(segundos==60){
                minutos++;
                segundos=0;
                if(minutos==60){
                    horas++;
                    minutos=0;
                        if(horas==24){
                            horas=0;
                        }
                }
            }
            
        }catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
}
