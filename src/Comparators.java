import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Models.Estudiante;

public class Comparators {


    // C2 	Nombre ascendente; código ascendente. Lambda de dos parámetros.
    public static Comparator<Estudiante> nombreCodigoAsc = (e1, e2) -> {
        int res = e1.getNombre().compareTo(e2.getNombre());
        if(res == 0){
            res =  e1.getCodigo().compareTo(e2.getCodigo());
        }
        return res;
    };
     
    // C2   Utilizando Comparing y thenComparing.
    public static Comparator<Estudiante> nombreCodigoAsc2 = Comparator.comparing(Estudiante::getNombre).thenComparing(Estudiante::getCodigo);

    // C3 	Nota ascendente, sin desempate. comparingDouble y referencia a método.
    public static Comparator<Estudiante> notaAsc = Comparator.comparingDouble(Estudiante :: getNota).thenComparing(Estudiante :: getCodigo);

    // C4 	Nota descendente; nombre ascendente. Nota del estudiante con reversed y thenComparing para el nombre.
    public static Comparator<Estudiante> notaDescNombreAsc = Comparator.comparingDouble(Estudiante :: getNota).reversed().thenComparing(Estudiante :: getNombre);

    // C5 	Edad ascendente; nombre descendente. 	comparingInt y sentido independiente para el criterio secundario.
    public static Comparator<Estudiante> edadAscNombreDesc = Comparator.comparingInt(Estudiante::getEdad).thenComparing(Estudiante::getNombre).reversed();
        
    // C6 	Carrera ascendente; nota descendente; nombre ascendente; código ascendente. 	Composición de cuatro criterios.
    public static Comparator<Estudiante> carreraAscNotaDescNombreCodigoAsc = Comparator.comparing(Estudiante :: getCarrera).thenComparing(Estudiante :: getNota).thenComparing(Estudiante :: getNombre).thenComparing(Estudiante::getCodigo);

    // C7 	Nota ajustada descendente; nombre ascendente; código ascendente. 	Lambda que calcule Math.min(10.0, nota + 0.5) para estudiantes de Computacion y conserve la nota de las demás carreras. 
    
   public static Comparator<Estudiante> notaAjusDescNombreAscCodigoAsc = (e1 , e2) -> {
        
    double nota1 = e1.getNota();
    double nota2 = e2.getNota();

    if(e1.getCarrera().equals("Computacion")) {
        nota1 = e1.getNota() + 0.5;
        if(nota1 > 10){
            nota1 = 10;
            }
        }
        if(e2.getCarrera().equals("Computacion")) {
                nota2 = e2.getNota() + 0.5;
            if(nota2 > 10) {
                nota2 = 10;
                }
            }
            int resultado = Double.compare(nota1, nota2);
            if(resultado !=0){
                return resultado;
            }
            resultado = e1.getNombre().compareTo(e2.getNombre());
            if(resultado !=0) {
                return resultado ;

            }
                return e1.getCodigo().compareTo(e2.getCodigo());

    };
}



