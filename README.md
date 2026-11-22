Practica uno

Asignatura: Estructura de Datos
Carrera: Computación
Práctica: PL2.1
Tema: Ordenamiento de estudiantes con Comparator y Comparable
Autor: Galo Prieto, Martín Villacrés
Repositorio: https://github.com/MartinViN16/icc-est-u1-practicaUno.git
JDK: Java 25

# Objetivo
El objetivo de la práctica es la implementación de métodos de ordenamiento para un arreglo de estudiantes previamente definido usando
comparable y comparator, se han aplicado criterios de manera que se ordena de manera ascendente o descendente incluso con ciertos
condicionales, además de comprobar la estabilidad de los ordenamientos y verificar que la lista original conserve sus registros y orden 
inicial en cuanto al método implementado.

¿Qué representa el signo del resultado de compareTo()?
El método a.compareTo(b) devuelve un entero cuyo signo indica cómo se ubica "a" respecto a "b" en el orden natural, es decir,
en el caso que se devuelva un número negativo, significa que "a" es menor que "b", si devuelve cero, significa que "a" es igual a "b" 
y por ultimo, si el retorno devuelve un número positivo, significa que "a" es mayor que "b".
Tomando en cuenta esto puede explicarse de manera que si "a" es mayor que "b", "a" va despues de "b".

# Conclusiones

- Los metodos de comparable y comparator funcionan de tal manera que permiten el ordenamiento de objetos mientras que uno se encarga
de organizar por el orden natural de la clase, comparator permite ordenar los objetos dependiendo de los criterios que se le impongan
permitiendo que los ordenamientos se puedan adaptar de mejor manera a lo que uno necesite.

- La implementación de los criterios de ordenamiento permite limitar la obtención de resultados a unos mucho m+as precisos y adaptados
a la necesitad del usuario, ya que al momento de utilizar los comparadores con condicionales específicas se puede resolver ordenes de
objetos que tengan ciertos valores repetidos, pudiendo evitar que existan altercados en la posición final de los objetos.

- Hablando por parte de la estabilidad de los ordenamientos, al momento que el ordenamiento se realiza de una manera correcta, se deben
mantener todos los elementos de la lista y se debe respetar el orden relativo de aquellos con datos iguales, logrando así que se puedan
realizar algunas consultas sin alterar innecesariamente la información original.