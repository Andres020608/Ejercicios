import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Alumnos_a_calcula = 0;
        String Nombre_alumno = "";
        int Clases_vistas = 0;
        int Clases_vistas_por_alumno = 0;
        
        System.out.println("Ingrese el número de alumnos a calcular:");
        Alumnos_a_calcula = sc.nextInt();
        
        System.out.println("Ingrese el número de clases vistas:");
        Clases_vistas = sc.nextInt();
        
        for (int i = 1; i <= Alumnos_a_calcula; i++) {
            System.out.println("Ingrese el nombre del alumno:");
            Nombre_alumno = sc.next();
            
            System.out.println("Ingrese la asistencia del alumno:");
            Clases_vistas_por_alumno = sc.nextInt();
 
            int Aprobado_o_reprobado = (Clases_vistas_por_alumno * 100) / Clases_vistas;
            if (Aprobado_o_reprobado >= 80) {
                System.out.println("El estudiante " + Nombre_alumno + " aprobó con " + Aprobado_o_reprobado + "% de asistencia");
            } else {
                System.out.println("El estudiante " + Nombre_alumno + " no aprobó con " + Aprobado_o_reprobado + "% de asistencia");
            }
        }
        sc.close();
    }
}

