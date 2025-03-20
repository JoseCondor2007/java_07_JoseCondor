
package Guia07_actividad4;

public class main {
    public static void main(String[] args) {
        Persona miPersona = new Persona();
        miPersona.establecerNombre("Juan");
        miPersona.establecerEdad(30);
        System.out.println("Nombre: " + miPersona.nombre);
        System.out.println("Edad: " + miPersona.edad);
    }
}
