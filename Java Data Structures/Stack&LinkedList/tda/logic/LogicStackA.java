package cr.ac.ulead.tda.logic;

import cr.ac.ulead.objetos.Persona;
import sun.invoke.empty.Empty;

public class LogicStackA {
    static int ElementosPila;
    static Persona[] stack;
    static boolean MaximoPila = false;



    public static void Push(Persona persona){
        if (MaximoPila == true) {
            MaximoPila();
        }
        else{
            stack[ElementosPila] = persona;
            ElementosPila++;
        }
    }
    public static void Pop(Persona persona){
        ElementosPila = ElementosPila-1;
        System.out.println(stack[ElementosPila]);
    }
    public static void empty() {
        if (ElementosPila==0) {
            MaximoPila = true;
            System.out.println("False");
        }
    }
    public static void MaximoPila(){
        if(ElementosPila<50){System.out.println("Pila llena");}
    }

    public static void MenuStackA(){
    System.out.println("Bienvenido al StackA. Que quieres hacer?");
    System.out.println("1.Hacer Push");
    System.out.println("2.Hacer Empty");
    System.out.println("3.Hacer Pop");
    System.out.println("4.Salir");
    }

    public static void EjecucioPilaA(int opcion){
        Persona persona = new Persona();
        switch (opcion){

            case 1:
                Push(persona);
                break;
            case 2:
                empty();
                break;
            case 3:
                Pop(persona);
                break;
            case 4:
                break;
        }
    }
}
