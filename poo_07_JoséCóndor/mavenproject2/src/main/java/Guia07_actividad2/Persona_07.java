
package Guia07_actividad2;
class Persona {
   String nombre;
   int edad;

    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }

    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ahora tiene " + edad + " años.");
    } 
}
