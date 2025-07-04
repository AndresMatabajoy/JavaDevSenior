package PROYECTO;

import java.util.Scanner;
public class app {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        RegistrarLaInformacionDelEstudiante estudiante = new RegistrarLaInformacionDelEstudiante();

        do{

            System.out.println("--- Sistema de Registro de Estudiantes ---");
            System.out.println("""
            1. Registrar datos de un estudiante
            2. Mostrar datos del estudiante actual
            3. Calcular promedio de notas del estudiante actual
            0. Salir
            Ingrese su opción:
            """);
            
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1: System.out.println("--- Registrar datos de un estudiante ---");
                        scanner.nextLine();
                        System.out.println("Ingrese el nombre del estudiante:");
                        String nombre = scanner.nextLine();
                        if(!RegistrarLaInformacionDelEstudiante.validarNombre(nombre)) {
                            System.out.println("Nombre inválido. Intente de nuevo.");
                            break;
                        }
                        System.out.println("Ingrese la nota 1:");
                        double nota1 = scanner.nextDouble();   
                        if(!estudiante.validarNota(nota1)) {
                            System.out.println("Nota inválida. Debe estar entre 0 y 100.");
                            break;
                        }
                        System.out.println("Ingrese la nota 2:");
                        double nota2 = scanner.nextDouble();
                        if(!estudiante.validarNota(nota2)) {
                            System.out.println("Nota inválida. Debe estar entre 0 y 100.");
                            break;
                        }
                        System.out.println("Ingrese la nota 3:");
                        double nota3 = scanner.nextDouble();
                        if(!estudiante.validarNota(nota3)) {
                            System.out.println("Nota inválida. Debe estar entre 0 y 100.");
                            break;
                        }
                        estudiante = new RegistrarLaInformacionDelEstudiante(nombre, nota1, nota2, nota3);
                        System.out.println("Estudiante registrado con éxito.");
                    break;
                case 2: System.out.println("--- Mostrar datos del estudiante actual ---");
                        if(estudiante != null) {
                            estudiante.mostrarInfoEstudiante();
                        } else {
                            System.out.println("No hay datos de estudiante registrados.");
                        }
                    break;
                    
                

                case 3: System.out.println("--- Calcular promedio de notas del estudiante actual ---");
                        if(estudiante != null) {
                            double promedio = estudiante.calcularPromedio();
                            System.out.println("El promedio de notas es: " + promedio);
                        } else {
                            System.out.println("No hay datos de estudiante registrados.");
                        }
                    break;
                    
                case 0: System.out.println("Saliendo del sistema...");
                        scanner.close();
                        return;
            
                default:
                    break;
            }

        }while(true);
      
    }
}