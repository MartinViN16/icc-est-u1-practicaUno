import java.util.Comparator;
import java.util.List;

import Models.Estudiante;

public class Compadores {
    
    // C2 	Nombre ascendente; código ascendente. 	Comparator con lambda de dos parámetros.
    public static Comparator<Estudiante> nombreCodigoAsc = (e1, e2) -> {
        int res = e1.getNombre().compareTo(e2.getNombre());
        if(res != 0){
            return res;
        }
        return e1.getCodigo().compareTo(e2.getCodigo());
    };

    // C3 	Nota ascendente, sin desempate. 	comparingDouble y referencia a método.
    public static Comparator<Estudiante> notaAsc = Comparator.comparingDouble(Estudiante :: getNota);

    // C4 	Nota descendente; nombre ascendente. 	reversed y thenComparing.
    public static Comparator<Estudiante> notaDescNombreAsc = Comparator.comparingDouble(Estudiante :: getNota).reversed().thenComparing(Estudiante :: getNombre);

    // C5 	Edad ascendente; nombre descendente. 	comparingInt y sentido independiente para el criterio secundario.
    public static Comparator<Estudiante> edadAscNombreDesc = Comparator.comparingInt(Estudiante::getEdad).thenComparing(Estudiante::getNombre, Comparator.reverseOrder());
        
    // C6 	Carrera ascendente; nota descendente; nombre ascendente; código ascendente. 	Composición de cuatro criterios.
    public static Comparator<Estudiante> carreraAscNotaDescNombreCodigoAsc = Comparator.comparing(Estudiante :: getCarrera).thenComparing(Estudiante :: getNota).thenComparing(Estudiante :: getNombre).thenComparing(Estudiante::getCodigo);

    // C7 	Nota ajustada descendente; nombre ascendente; código ascendente. 	Lambda que calcule Math.min(10.0, nota + 0.5) para estudiantes de Computacion y conserve la nota de las demás carreras. 
    

}
