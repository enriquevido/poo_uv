import escuela.Section;
import escuela.Student;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        Section lis301 = new Section();

        do {
            System.out.println("1) Agregar\n2) Buscar\n3) Borrar\n4) Imprimir por género\n5) Imprimir todos\n6) Salir");
            opcion = input.nextInt();

            switch (opcion) {
                case 1: // Agregar estudiante
                    System.out.println("Ingresa ID, nombre, edad y género: ");
                    Student st = new Student(input.nextInt(), input.next(), input.nextInt(), input.next());
                    lis301.addStudent(st);
                    break;
                case 2: // Buscar estudiante
                    System.out.println("Ingresa el ID del estudiante a buscar: ");
                    lis301.searchStudent(input.nextInt());
                    break;
                case 3: // Borrar estudiante
                    System.out.println("Ingresa el ID del estudiante a eliminar: ");
                    lis301.deleteStudent(input.nextInt());
                    break;
                case 4: // Imprimir por género
                    System.out.println("Ingresa el género de l@s estudiantes a imprimir: ");
                    lis301.printStudentsByGender(input.next());
                    break;
                case 5: // Imprimir todos los estudiantes
                    lis301.printAllStudents();
                    break;
                case 6: // Salir
                    System.out.println("Adios!");
                    break;
            }
        } while (opcion != 6);
    }
}
