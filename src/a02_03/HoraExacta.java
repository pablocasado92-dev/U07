package a02_03;

import a01.Hora;

public class HoraExacta extends Hora{
    private int segundo;

    public HoraExacta(int hora, int minuto, int segundo){
        super(hora, minuto);
        if (segundo<0)
            this.segundo=0;
        else if (segundo>59) 
            this.segundo=59;
        else
            this.segundo=segundo;
    }

    //GET
    public int getSegundo() {
        return segundo;
    }

    //SET
    public boolean setSegundo(int segundo) {
        boolean valido;
        if (segundo<0 || segundo>59) {
            System.out.println("Segundo inválido. Deve ser entre 0 e 59.");
            valido = false;
        }else {
            this.segundo = segundo;
            valido = true;
        }  
        return valido;
    }

    //METODOS
    @Override
    public void inc() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo());
    }

    @Override
    public boolean equals(Object otro) {
        boolean resultado;
        if (this == otro) {
            resultado = true;
        } else if (otro instanceof HoraExacta) {
            HoraExacta otraHora = (HoraExacta) otro;
            resultado = getHora() == otraHora.getHora()
                && getMinuto() == otraHora.getMinuto()
                && segundo == otraHora.segundo;
        } else {
            resultado = false;
        }
        return resultado;
    }
}
