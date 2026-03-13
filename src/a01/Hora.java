package a01;

public class Hora {
    private int hora;
    private int minuto;

    public Hora(int hora, int minuto) {
        if (hora<0)
            this.hora=0;
        else if (hora>23) 
            this.hora=23;
        else
            this.hora=hora;
        if (minuto<0)
            this.minuto=0;
        else if (minuto>59) 
            this.minuto=59;
        else
            this.minuto=minuto;  
    }

    //GET
    public int getHora() {
        return hora;
    }
    public int getMinuto() {
        return minuto;
    }

    //SET
    public boolean setHora(int hora) {
        boolean valido;
        if (hora<0 || hora>23){
            System.out.println("Hora inválida. Deve ser entre 0 e 23.");
            valido = false;
        }else {
            this.hora = hora;
            valido=true;
        }
        return valido;
    }

    public boolean setMinuto(int minuto) {
        boolean valido;
        if (minuto<0 || minuto>59) {
            System.out.println("Minuto inválido. Deve ser entre 0 e 59.");
            valido = false;

        }else {
            this.minuto = minuto;
            valido = true;
        }
        return valido;
    }

    // METODOS

    public void inc() {
        minuto++;
        if (minuto == 60) {
            minuto = 0;
            hora++;
            if (hora == 24) {
                hora = 0;
            }
        }
    } 
    
    @Override
    public String toString(){
        return String.format("%02d:%02d", getHora(), getMinuto());
    }
}
