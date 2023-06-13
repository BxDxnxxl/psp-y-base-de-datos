package filosofos;

public class Filosofo extends Thread {
    private Mesa mesa;
    private int comensal;
    private int indiceComensal;
    public Filosofo(Mesa mesa, int comensal) {
        this.mesa = mesa;
        this.comensal = comensal;
        this.indiceComensal = comensal-1;
    }
    @Override
    public void run() {
        while(true){
            this.pensando();
            this.mesa.cogerTenedores(indiceComensal);
            this.comiendo();
            System.out.println("el filoso " + comensal +  "deja los tenedores "+ this.mesa.tenedorDerecha(indiceComensal +1)+ " , "+ this.mesa.tenedorIzquierda(indiceComensal +1));
            this.mesa.dejarTenedores(indiceComensal);
        }
    }

public void comiendo(){
    System.out.println("filosofo "+ comensal+ " esta comiendo");
    try {
        sleep(4000);
    } catch (Exception e) {
        
    }
}

public void pensando(){
    System.out.println("filosofo "+ comensal+ " esta pensandop");

    try {
        sleep(4000);
    } catch (Exception e) {
       
    }
}
    
}
