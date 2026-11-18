package Models;

public class Estudiante implements Comparable<Estudiante>{
   private String codigo;
   private String nombre;
   private int edad;
   private double nota;
   private String carrera;
   public String getCodigo() {
    return codigo;   }
   public String getNombre() {
    return nombre;   }
   public int getEdad() {
    return edad;   }
   public double getNota() {
    return nota;   }
   public String getCarrera() {
    return carrera;   }
   public Estudiante(String codigo, String nombre, int edad, double nota, String carrera) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.edad = edad;
    this.nota = nota;
    this.carrera = carrera;   }
   @Override
   public String toString() {
    return "Estudiante [codigo=" + codigo + ", nombre=" + nombre + ", edad=" + edad + ", nota=" + nota + ", carrera="
            + carrera + "]";   }


   @Override
   public int compareTo(Estudiante e2) {
        
    // C1 	Código ascendente. 	Comparable y ordenamiento natural.
    return this.codigo.compareTo(e2.getCodigo());

   }

   
}
