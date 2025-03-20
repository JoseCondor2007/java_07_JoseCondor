
package Guia07_actividad5;

public class Libro {
    String titulo;
    String autor;
    
    public Libro(String titulo,String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public void mostrarinformacion(String[] args){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor:" + autor);
    }

}
