package ulead.ac.cr.entidades;
import ulead.ac.cr.cola.PriorityQueue;
import ulead.ac.cr.cola.Queue;
import ulead.ac.cr.ui.UIHelper;

import java.util.ArrayList;


public class cajas {

    public static ArrayList<Double> tiempocola = new ArrayList<Double>();
    public static ArrayList<Double> tiempocaja = new ArrayList<Double>();
    public static int numcolas_personas= 0;

    public static int SumadorPersonas = 0;
    public static int numcajas_pago = 0;

    public static ArrayList<Persona> ListaPersona = new ArrayList<Persona>();

    static int personaQuedaronCola = 0;
    static boolean cargardatos = false;

    public static int CalculoMinutos() {

        int minuto = 0;
        double NumRand = Math.random();

        if (NumRand >= 0 && NumRand < 0.3) {
            minuto = 1;
        } else if (NumRand >= 0.3 && NumRand < 0.4) {
            minuto = 2;
        } else if (NumRand >= 0.4 && NumRand < 0.6) {
            minuto = 3;
        } else if (NumRand >= 0.6 && NumRand < 0.8) {
            minuto = 5;
        } else if (NumRand >= 0.8 && NumRand < 0.9) {
            minuto = 8;
        } else if (NumRand >= 0.9 && NumRand < 0.95) {
            minuto = 13;
        } else if (NumRand >= 0.95) {
            minuto = 13 + (int) (13 * Math.random());
        }
        return minuto;

    }

    public Persona caja(int PersonasColaNormal, int PersonasColaPreferencial, int numCajas, int numcolas) {
        Persona persona = new Persona();
        Queue queue = new Queue();
        PriorityQueue priorityQueue = new PriorityQueue();
        PersonaPrioridad personaPrioridad = new PersonaPrioridad();


        int ColaTiempoA = (int)(Math.random() * 3);

        int contador = 0;


        while (contador < PersonasColaNormal) {
            queue.enqueue(persona);
            ++contador;
        }

        if (PersonasColaPreferencial!=0){
            contador = 0;
        }
            while (contador < PersonasColaNormal) {
                priorityQueue.enqueue(persona);
                ++contador;
        }

        contador=0;

        while(contador<PersonasColaPreferencial){
            if (contador==0){
                personaPrioridad.setTiempoCola(0);
                personaPrioridad.setTiempoCaja(cajas.CalculoMinutos());
                tiempocola.add(personaPrioridad.getTiempoCola());
                tiempocaja.add(personaPrioridad.tiempoCaja);

                PersonasColaPreferencial--;
            }else{
                personaPrioridad.setTiempoCola(ColaTiempoA);
                personaPrioridad.setTiempoCaja(cajas.CalculoMinutos());
                tiempocola.add(personaPrioridad.getTiempoCola());
                tiempocaja.add(personaPrioridad.tiempoCaja);
                personaQuedaronCola++;
                PersonasColaPreferencial--;
            }
        }


        if (PersonasColaNormal < numCajas) {
            contador = 0;
            while (contador < PersonasColaNormal) {
                queue.dequeue();
                persona.setTiempoCola(0);
                persona.setTiempoCaja(cajas.CalculoMinutos());

                tiempocola.add(persona.getTiempoCola()+ ColaTiempoA);
                tiempocaja.add(persona.getTiempoCaja());

                ListaPersona.add(persona);

                System.out.println(persona);

                ++contador;
            }
        } else if (PersonasColaNormal > numCajas) {
            contador = 0;
            while (contador < PersonasColaNormal) {
                if (contador <= numCajas) {
                    queue.dequeue();
                    persona.setTiempoCola(0);
                    persona.setTiempoCaja(cajas.CalculoMinutos());

                    tiempocola.add(persona.getTiempoCola()+ColaTiempoA);
                    tiempocaja.add(persona.getTiempoCaja());

                    ListaPersona.add(persona);

                    System.out.println(persona);
                    personaQuedaronCola++;
                } else {
                    queue.dequeue();
                    persona.setTiempoCola(contador / numCajas);
                    persona.setTiempoCaja(cajas.CalculoMinutos());

                    tiempocola.add(persona.getTiempoCola()+ColaTiempoA);
                    tiempocaja.add(persona.getTiempoCaja());

                    ListaPersona.add(persona);
                    System.out.println(persona);
                    personaQuedaronCola++;

                }

                ++contador;
            }
        }
        SumadorPersonas = SumadorPersonas + PersonasColaNormal;
        numcajas_pago = numCajas;
        numcolas_personas = numcolas;
        cargardatos = true;

        return persona;
    }


    public static void Calculos() {
        String calculos = "";
        if (cargardatos == true) {
            double sumacola = 0;
            double sumacaja = 0;

            for (int i = 0; i < tiempocola.size(); i++) {
                sumacola += tiempocola.get(i) + 3;
            }
            for (int i = 0; i < tiempocaja.size(); i++) {
                sumacaja += tiempocaja.get(i);}

            double mediacola = sumacola / ListaPersona.size();
            double mediatramite = sumacaja/ListaPersona.size();
            double mediaTiempoPersona = mediacola+mediatramite;


            calculos = "El promedio en espera de las personas fue de: " + mediacola+"\n"
            + "El promedio en tramite de las personas: " + mediatramite+"\n"+
                    "El promedio de duracion total de las personas fue: " + mediaTiempoPersona + "\n" +
                    "Las total de personas que quedaron en cola fue:" + personaQuedaronCola + "\n"
            + "El total de personas atendias son: " + SumadorPersonas + " con " + numcolas_personas + " colas"+ " y " + numcajas_pago + " puntos de servicio" + "\n"
            + "El pago a los cajeros fue de: " + "$" +numcajas_pago*100;
            System.out.println(calculos);
        }else{
            System.out.println("No has hecho una simulacion");
        }
    }


}
