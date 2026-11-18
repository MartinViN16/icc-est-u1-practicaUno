import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Models.Estudiante;

public class App {

    public static void main(String[] args) throws Exception {


        List<Estudiante> estudiantes = new ArrayList<>(List.of(
    new Estudiante("E014", "Ana",    20, 8.5, "Computacion"),
    new Estudiante("E003", "Luis",   19, 7.8, "Electronica"),
    new Estudiante("E018", "Maria",  21, 9.2, "Computacion"),
    new Estudiante("E007", "Pedro",  20, 8.5, "Mecatronica"),
    new Estudiante("E001", "Sofia",  18, 9.5, "Computacion"),
    new Estudiante("E012", "Diego",  22, 6.8, "Electronica"),
    new Estudiante("E005", "Ana",    19, 8.5, "Computacion"),
    new Estudiante("E020", "Carlos", 21, 7.8, "Mecatronica"),
    new Estudiante("E009", "Lucia",  20, 9.2, "Electronica"),
    new Estudiante("E016", "Mateo",  18, 7.0, "Computacion"),
    new Estudiante("E002", "Elena",  22, 8.0, "Mecatronica"),
    new Estudiante("E011", "Pablo",  21, 9.5, "Electronica"),
    new Estudiante("E006", "Sara",   19, 6.8, "Computacion"),
    new Estudiante("E019", "Juan",   20, 8.0, "Mecatronica"),
    new Estudiante("E004", "Diana",  18, 9.2, "Electronica"),
    new Estudiante("E015", "Bruno",  22, 7.0, "Computacion"),
    new Estudiante("E008", "Carla",  21, 8.5, "Mecatronica"),
    new Estudiante("E017", "Andres", 19, 9.5, "Electronica"),
    new Estudiante("E010", "Ana",    20, 8.5, "Computacion"),
    new Estudiante("E013", "Luis",   19, 7.8, "Electronica")
));
 
    
    ejemploC1(estudiantes);
    ejemploC2(estudiantes);
    ejemploC3(estudiantes);
    ejemploC4(estudiantes);
    ejemploC5(estudiantes);
    ejemploC6(estudiantes);
    ejemploC7(estudiantes);

    }

    private static void ejemploC7(List<Estudiante> estudiantes) {
      
        List<Estudiante> list = new ArrayList<>(estudiantes);

        list.sort(Comparators.notaAjusDescNombreAscCodigoAsc);

        System.out.println( "--------------- EJEMPLO C7 ---------------" );
        System.out.println("--- Nota ajustada descendente; nombre ascendente; código ascendente.. ---");

        for (Estudiante estudiante : list) {
            
            double notaAjustada = estudiante.getNota();

            if(estudiante.getCarrera().equals("Computacion")){
                notaAjustada = estudiante.getNota()+ 0.5;
                if( notaAjustada > 10) {
                    notaAjustada = 10;
            }

            System.out.println(estudiante + " -> Nota Ajustada = " + notaAjustada);

        }else {
            System.out.println(estudiante);
        }
    }
}
    private static void ejemploC6(List<Estudiante> estudiantes) {
        
        List<Estudiante> list = new ArrayList<>(estudiantes);

        list.sort(Comparators.carreraAscNotaDescNombreCodigoAsc);

        System.out.println( "--------------- EJEMPLO C6 ---------------" );
        System.out.println("--- Carrera ascendente; nota descendente; nombre ascendente; código ascendente. ---");

        for (Estudiante estudiante : list) {
            System.out.println(estudiante);
        }
    }

    private static void ejemploC5(List<Estudiante> estudiantes) {
       
        List<Estudiante> list = new ArrayList<>(estudiantes);

        list.sort(Comparators.edadAscNombreDesc);

        System.out.println( "--------------- EJEMPLO C5 ---------------" );
        System.out.println("--- Edad ascendente; nombre descendente. ---");

        for (Estudiante estudiante : list) {
            System.out.println(estudiante);
        }
    }

    private static void ejemploC4(List<Estudiante> estudiantes) {
       
        List<Estudiante> list = new ArrayList<>(estudiantes);

        list.sort(Comparators.notaDescNombreAsc);

        System.out.println( "--------------- EJEMPLO C4 ---------------" );
        System.out.println("--- Nota descendente; nombre ascendente. ---");

        for (Estudiante estudiante : list) {
            System.out.println(estudiante);
        }
    }

    private static void ejemploC3(List<Estudiante> estudiantes) {
       
        List<Estudiante> list = new ArrayList<>(estudiantes);

        list.sort(Comparators.notaAsc);

        System.out.println( "--------------- EJEMPLO C3 ---------------" );
        System.out.println("--- Nota ascendente, sin desempate. ---");

        for (Estudiante estudiante : list) {
            System.out.println(estudiante);
        }
    }

    private static void ejemploC2(List<Estudiante> estudiantes) {
       
        List<Estudiante> list = new ArrayList<>(estudiantes);
        List<Estudiante> list1 = new ArrayList<>(estudiantes);


        list.sort(Comparators.nombreCodigoAsc);
        list1.sort(Comparators.nombreCodigoAsc2);

        System.out.println( "--------------- EJEMPLO C2 ---------------" );
        System.out.println("--- Nombre ascendente; código ascendente. ---");

        for (Estudiante estudiante : list) {
            System.out.println(estudiante);
        }

        boolean iguales = true;
        for(int i = 0; i < list.size(); i++) {
            String nombreCodigoAsc = list.get(i).getCodigo();
            String nombreCodigoAsc2 = list1.get(i).getCodigo();
        

        if(!nombreCodigoAsc.equals(nombreCodigoAsc2)) {
            iguales = false;
            break;
        
        }
    }
    System.out.println( "Ambos comparadores son los mismos = " + iguales);
}
    

    private static void ejemploC1(List<Estudiante> estudiantes) {
    
    List<Estudiante> list = new ArrayList<>(estudiantes);
    
    list.sort(null); // Ordenamiento natural (C1)

    System.out.println( "--------------- EJEMPLO C1 ---------------" );
    System.out.println("--- Código ascendente (ordenamiento natural) ---");

        for (Estudiante estudiante : list) {
            System.out.println(estudiante);

        }
    }
}



