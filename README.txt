Maven: 
Administrador de dependencias (librerias del proyecto) , sirve para la generacion de una estructura adecuada y el import de las librerias necesarias para el proyecto. 
Asimismo provee otras funcionalidades como la gestion de empaquetado , buildeo de las versiones del proyecto.

Pom: 
Archivo de configuracion principal de maven donde se configuran dependencias , librerias , plugins , scopes y demas interventores que provee maven.

Dif arquetipo y artefacto:  
Arquetipo es la estructura de carpetas del proyecto a modo de template , artefacto es la solucion compilada y empaquetada en jar o war el cual puede ser
dispuesto por otro proyecto.

clean: limpia el directorio receptor del build.
package: empaqueta el codigo en un jar / war. 
install: instala el package en el repositorio local. 
compile: compila el codigo fuente.

scope: delimita el alcance de la dependencia.

compile: necesaria para compilar , aplica en proyectos dependientes.
provided: mismo alcance que compile , pero antes del despliegue chequea que la libreria no este desplegada en otro modulo o en otra parte del proyecto.
runtime: necesaria en tiempo de ejecucion pero no para compilar.
