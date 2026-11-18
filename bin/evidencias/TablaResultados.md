
## Tabla de Resultados: 

| Escenario | Resultado esperado | Resultado Obtenido | Estado |
| :---------- | :---------- | :-------- | :-----------|
| **C1: Código ascendente** | Ejecutar los 20 registros totalmente ordenados de E001 a E020 en secuencia correlativa, es decir, con orden natural. | Todos los 20 registros se muestran ordenados de forma ascendente desde E001 hasta E020. | **Total Éxito** |
| **C2: Nombre ascendente; código ascendente** | Ejecutar los primeros registros de la lista: E005, E010, E014 y E017. | La consola demuestra correctamente ordenados a E005, E010, E014 y E017 junto con los 20 registros. | **Total Éxito** |
| **C3: Nota ascendente, sin desempate.** | Filtrar y añadir solamente a los estudiantes con la nota 8.5 en orden: E014, E007, E005, E008, E010. | Se muestran exactamente los 5 primeros registros cumpliendo el filtro y orden exacto. | **Total Éxito** |
| **C4: Nota descendente; nombre ascendente** | Obtener los primeros registros de la lista general y deben ser E017, E011 y E001. | Se muestra correctamente la posición de los siguientes códigos: E017, E011 y E001 en los primeros lugares de los 20 registros. | **Total Éxito** |
| **C5: Edad ascendente; nombre descendente** | Se necesita saber los primeros registros de la lista y deben ser E001, E016, E004. | La consola muestra a E001, E016 y E004 en las primeras posiciones de los 20 registros. | **Total Éxito** |
| **C6: Carrera ascendente; nota descendente; nombre ascendente; código ascendente** | Obtener los primeros registros de la lista: E001, E018, E005, E010 y E014. | Los primeros elementos de la lista general coinciden exactamente con la secuencia esperada. | **Total Éxito** |
| **C7: Nota ajustada descendente; nombre ascendente; código ascendente.** | Demostrar Lambda que calcule `Math.min(10.0, nota + 0.5)` para estudiantes de Computación y conserve la nota de las demás carreras. | Se muestra correctamente que el código E001 lidera con 10.0 y E018 sigue con 9.7 en la cima, preservando las notas base (9.5 y 9.2). | **Total Éxito** |
| **Lista vacía y lista de un elemento.** | Procesar listas sin elementos y de un solo elemento sin arrojar excepciones. | La lista vacía retorna tamaño 0 y la unitaria procesa el elemento sin errores. | **Total Éxito** |
| **C4 sobre una lista formada por E014, E005 y E010, en ese orden.** | Al aplicar C4 a una sublista con igual nota y nombre, se conserva el orden relativo original de llegada. | Se conserva estrictamente el orden de salida: E014, luego E005 y finalmente E010. | **Total Éxito** |
| **Original después de todas las consultas.** | Mantener los 20 códigos iniciales intactos en su secuencia original después de todas las consultas. | La validación final sobre la lista original de 20 elementos retorna en conclusión `true`. | **Total Éxito** |
