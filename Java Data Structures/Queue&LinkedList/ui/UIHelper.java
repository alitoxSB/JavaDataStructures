package ulead.ac.cr.ui;

public class UIHelper {

    public void MenuUI(){
        System.out.println("Escoja una opcion:");
        System.out.println("1: Iniciar Simulacion");
        System.out.println("2: Conocer datos recopilados de la simulacion");
        System.out.println("3: Salir");
    }
    public void CuantasCajas(){
        System.out.println("Cuantas cajas normales quiere abrir?");
    }
    public void CuantasCajasPrioridad(){
        System.out.println("Cuantas cajas de prioridad quiere abrir?");
    }
    public void MensajeAlerta(){
        System.out.println("Debe abrir minimo una caja");
    }
    public void MensajeLineaCompletada(){
        System.out.println("--------COLA COMPLETADA--------");
    }
    public void MensajeCajaNovata(){
        System.out.println("Quiere que haya un cajero novato?");
        System.out.println("1: Si");
        System.out.println("2: No");
    }
    public void MensajeNumColas(){
        System.out.println("Cuantas colas quiere que hayan?");
    }
}
