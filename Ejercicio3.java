import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double Numero1=0;
        double Numero2=0;
        double Resultado=0;
        System.out.println("Ingrese el numero 1");
        Numero1=sc.nextDouble();
        System.out.println("Ingrese el numero 2");
        Numero2=sc.nextDouble();
        if (Numero1>Numero2) {
            Resultado=Numero1+Numero2;
            System.out.println("El numero 1 es mayor por lo tanto se suman y da "+ Resultado);
        } 
        
        if (Numero1==Numero2) {
            System.out.println("Los numeros son iguales");
        } 
        if (Numero2>Numero1) {
            Resultado=(Numero1*Numero1)+(Numero2*Numero2);
            System.out.println("El numero 2 es mayor al numero 1 por lo tanto se ^2 y da "+ Resultado);
        }
    }
}