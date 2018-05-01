
package boletin28;


public class Boletin28 {

  
    public static void main(String[] args) {
     
        Alumno al = new Alumno("Sara",7,"Rua Urzaiz",12);
        al.amosar();
        al.cambiarNota(8);
        al.amosar();
        al.enderezoNovo("Principe", 1);
        al.cambiarNumero(2);
        al.amosar();
    }
    
}
