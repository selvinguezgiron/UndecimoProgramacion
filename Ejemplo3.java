
import java.util.*;
class Main {  
  public static void main(String args[]) { 
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese el numero 1:");
    int numero1 = leer.nextInt();
    System.out.println("Ingrese el numero 2:");
    int numero2 = leer.nextInt();
    int suma = numero1 + numero2;
    int mult = numero1 * numero2;
    int resta = numero1 - numero2;
    int div = numero1 / numero2;
    System.out.println("Suma:\t"+suma);
    System.out.println("Resta:\t"+resta);
    System.out.println("Multiplicacion:\t"+mult);
    System.out.println("Division:\t"+div);
 
  } 
}
