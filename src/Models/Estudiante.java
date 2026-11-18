package Models;

public class Estudiante implements Comparable<Estudiante>{
   private String codigo;
   private String nombre;
   private int edad;
   private double nota;
   private String carrera;
   public String getCodigo() {
    return codigo;   }
   public void setCodigo(String codigo) {
    this.codigo = codigo;   }
   public String getNombre() {
    return nombre;   }
   public void setNombre(String nombre) {
    this.nombre = nombre;   }
   public int getEdad() {
    return edad;   }
   public void setEdad(int edad) {
    this.edad = edad;   }
   public double getNota() {
    return nota;   }
   public void setNota(double nota) {
    this.nota = nota;   }
   public String getCarrera() {
    return carrera;   }
   public void setCarrera(String carrera) {
    this.carrera = carrera;   }
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
