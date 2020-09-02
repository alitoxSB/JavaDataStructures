package ulead.ac.cr.entidades;

public class PersonaPrioridad {
    double tiempoCola;
    double tiempoCaja;

    public double getTiempoCola() {
        return tiempoCola;
    }

    public void setTiempoCola(double tiempoCola) {
        this.tiempoCola = tiempoCola;
    }

    public double getTiempoCaja() {
        return tiempoCaja;
    }

    public void setTiempoCaja(double tiempoCaja) {
        this.tiempoCaja = tiempoCaja;
    }

    @Override
    public String toString() {
        return "PersonaPrioridad{" +
                "tiempoCola=" + tiempoCola +
                ", tiempoCaja=" + tiempoCaja +
                '}';
    }
}

