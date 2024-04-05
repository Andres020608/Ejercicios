import java.util.Scanner;
public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float descuento=0;
        float monto=0;
        System.out.println("Diga el monto a calcular el descuento");
        monto= sc.nextFloat();
        if (monto>=100) {
            descuento=(monto*10)/100;
            System.out.println("El descuento es "+ descuento);
        } else {
            descuento=(monto*2)/100;
            System.out.println("El descuento es "+ descuento);
        }
    }
}
