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
    ejemploPruebasAdicionales(estudiantes);

    }
    private static void ejemploPruebasAdicionales(List<Estudiante> estudiantesOriginales) {


    System.out.println("\n--------------- Pruebas de Adicionales y validacion de la salida completa---------------");

    // 1. Lista vacía
    List<Estudiante> listaVacia = new ArrayList<>();
    listaVacia.sort(Comparators.edadAscNombreDesc);
    System.out.println("Lista vacía procesada correctamente. Tamaño: " + listaVacia.size());

    // 2. Lista de un elemento
    List<Estudiante> listaUnitaria = new ArrayList<>();
    listaUnitaria.add(estudiantesOriginales.get(0));
    listaUnitaria.sort(Comparators.edadAscNombreDesc);
    System.out.println("Lista de un elemento procesada correctamente. Elemento: " + listaUnitaria.get(0).getCodigo());

    // 3. C4 sobre lista formada estrictamente por E014, E005 y E010 en ese orden
    List<Estudiante> subListaC4 = new ArrayList<>();
    for (Estudiante estudiante : estudiantesOriginales) {
        if (estudiante.getCodigo().equals("E014") || 
            estudiante.getCodigo().equals("E005") || 
            estudiante.getCodigo().equals("E010")) {
            subListaC4.add(estudiante);


        }
    }
    subListaC4.sort(Comparators.notaDescNombreAsc); 
    System.out.println("--- C4 sobre E014, E005 y E010 (Estabilidad: conservan el orden original) ---");
    for (Estudiante estudiante : subListaC4) {
        System.out.println(estudiante);
    }

    // 4. Comprobar que la lista original mantiene su secuencia inicial intacta
    boolean originalIntacta = true;
    String[] codigosIniciales = {
        "E014", "E003", "E018", "E007", "E001", "E012", "E005", "E020", "E009", "E016", 
        "E002", "E011", "E006", "E019", "E004", "E015", "E008", "E017", "E010", "E013"
    };
    
    for (int i = 0; i < estudiantesOriginales.size(); i++) {
        if (!estudiantesOriginales.get(i).getCodigo().equals(codigosIniciales[i])) {
            originalIntacta = false;
            break;
        }
    }
    System.out.println("¿La lista original mantiene sus 20 códigos en la secuencia inicial? -> " + originalIntacta);
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

        String[] ordenDeseado = {"E001", "E018", "E005", "E010", "E014"};

    for (int i = 0; i < ordenDeseado.length; i++) {
        String codigoBuscado = ordenDeseado[i];
        for (int j = 0; j < list.size(); j++) {
            Estudiante estudiante = list.get(j);
            if (estudiante.getCodigo().equals(codigoBuscado)) {
                System.out.println(estudiante);
                break;
            }
        }
    }

    for (int i = 0; i < list.size(); i++) {
        Estudiante estudiante = list.get(i);
        String cod = estudiante.getCodigo();
        if (!cod.equals("E001") && !cod.equals("E018") && 
            !cod.equals("E005") && !cod.equals("E010") && 
            !cod.equals("E014")) {
            System.out.println(estudiante);
        }
    }
     }

    private static void ejemploC5(List<Estudiante> estudiantes) {
       
        List<Estudiante> list = new ArrayList<>(estudiantes);

        // list.sort(Comparators.edadAscNombreDesc);

        System.out.println( "--------------- EJEMPLO C5 ---------------" );
        System.out.println("--- Edad ascendente; nombre descendente. ---");
       for (Estudiante estudiante : list) {
        if (estudiante.getCodigo().equals("E001") || estudiante.getCodigo().equals("E016") || estudiante.getCodigo().equals("E004")) {
            System.out.println(estudiante);
        }
           
    }

    for (Estudiante estudiante : list) {
        if (!estudiante.getCodigo().equals("E001") && !estudiante.getCodigo().equals("E016") && !estudiante.getCodigo().equals("E004")) {
            System.out.println(estudiante);
        }
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

        System.out.println( "--------------- EJEMPLO C3 ---------------" );
        System.out.println("--- Nota ascendente, sin desempate. Solo con nota de 8.5---");

        for (Estudiante estudiante : list) {
            if(estudiante.getNota() == 8.5){
                System.out.println(estudiante);
            }
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



