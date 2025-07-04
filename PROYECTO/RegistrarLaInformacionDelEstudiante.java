package PROYECTO;


   public class RegistrarLaInformacionDelEstudiante {

    private String nombre;
    private double nota1,nota2,nota3;

    public RegistrarLaInformacionDelEstudiante() {
        this.nombre = "";
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.nota3 = 0.0; 
    }

    RegistrarLaInformacionDelEstudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3; 
    }
    


    public void mostrarInfoEstudiante(){
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
    }


    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public boolean validarNota(double nota) {

       if(nota >= 0 && nota <= 100){
        return true;
       }
       return false;

    }

    public static boolean validarNombre(String nombre) {
        if(nombre != null && !nombre.trim().isEmpty()) {
            return true;
        }
        return false;
    }

} 
    

