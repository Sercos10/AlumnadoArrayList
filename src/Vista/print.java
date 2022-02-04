package Vista;

import Model.Alumno;
import Model.Grupo;

public class print {
    public static void Bienvenida(){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("|       BIENVENIDO A LA APLICACION DE GESTORIA DE ALUMNOS DEL INSTITUTO        |");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();
    }

    public static void MainMenu(){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("|           ESCOGA UNA DE LAS OPCIONES QUE SE MUESTRAN ABAJO                   |");
        System.out.println("|------------------------------------------------------------------------------|");
        System.out.println("|                                                                              |");
        System.out.println("|------------------------------------------------------------------------------|");
        System.out.println("|  Pulse 1 para añadir nuevos alumnos a la gestoria y a sus respectivos grupos |");
        System.out.println("|  Pulse 2 para acceder a las opciones de grupos                               |");
        System.out.println("|  Pulse 3 para mostrar todos los grupos con sus respectivos alumnos           |");
        System.out.println("|  Pulse 4 para salir del programa                                             |");
        System.out.println("|------------------------------------------------------------------------------|");
        System.out.println();
    }

    public static void SecundaryMenu(){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("|                   BIENVENIDO A LAS OPCIONES DE GRUPOS                        |");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("|                                                                              |");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("|                      Por favor seleccione un grupo                           |");
        System.out.println("|------------------------------------------------------------------------------|");
        System.out.println("| Pulse 1 para escoger PrimeroSMR                                              |");
        System.out.println("| Pulse 2 para escoger SegundoSMR                                              |");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();
    }

    public static void optionsSecundary(){
        System.out.println("|------------------------------------------------------------------------------|");
        System.out.println("|  Pulse 1 para eliminar un alumno del grupo dado su nombre                    |");
        System.out.println("|  Pulse 2 para para obtener la posicion de un alumno dado su nombre           |");
        System.out.println("|  Pulse 3 para mostrar los datos de un alumno dado su nombre                  |");
        System.out.println("|  Pulse 4 para modificar la nota de un alumno dado su nombre                  |");
        System.out.println("|  Pulse 5 para mostrar la nota media de este grupo                            |");
        System.out.println("|  Pulse 6 para mostrar el alumno con la nota más alta de este grupo           |");
        System.out.println("|  Pulse 7 para mostrar el alumno con la nota más baja de este grupo           |");
        System.out.println("|  Pulse 8 para salir de este menu                                             |");
        System.out.println("|------------------------------------------------------------------------------|");
        System.out.println();
    }

    public static void selectGroup(){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("|                      Por favor seleccione un grupo                           |");
        System.out.println("|------------------------------------------------------------------------------|");
        System.out.println("| Pulse 1 para escoger PrimeroSMR                                              |");
        System.out.println("| Pulse 2 para escoger SegundoSMR                                              |");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();
    }

    public static void añadido(Grupo grupo, Alumno añadido){
        System.out.println(" Alumno añadido exitosamente a: "+añadido.getNombre()+" de: "+grupo.getNombre());
    }
    public static void eliminado(Grupo grupo, Alumno eliminado){
        System.out.println(" Alumno eliminado exitosamente a: "+eliminado.getNombre()+" de: "+grupo.getNombre());
    }
    public static void encontradoPos(Grupo grupo,Alumno encontrado, int pos){
        System.out.println(" El alumno "+encontrado.getNombre()+" se encuemtra en la posicion "+pos+" del grupo "+grupo.getNombre());
    }
    public static void encotradoNom(Grupo grupo, Alumno encotrado){
        System.out.println("El alumno "+encotrado.getNombre()+" de "+grupo.getNombre()+" tiene una nota de"+encotrado.getNota());
    }
    public static void newNote(Grupo grupo, Alumno alumno, Double newNote){
        System.out.println("La nueva nota del alumno "+alumno.getNombre()+" en el grupo "+grupo.getNombre()+" es "+newNote );
    }
    public static void media(Grupo grupo, Double media){
        System.out.println("La nota media de "+grupo.getNombre()+" es "+media);
    }
    public static void alta(Grupo grupo, Alumno alto){
        System.out.println("El alumno con mas nota de "+grupo.getNombre()+" es "+alto.getNombre());
    }
    public static void baja(Grupo grupo, Alumno bajo){
        System.out.println("El alumno con menos nota de "+grupo.getNombre()+" es "+bajo.getNombre());
    }
    public static void muestraGrupo(Grupo grupo){
        System.out.println(grupo);
        System.out.println();
    }
    public static void adios(){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("|                               HASTA LA PROXIMA                                |");
        System.out.println("--------------------------------------------------------------------------------");
    }
    public static void errorGrupo(){
        System.out.println("Introduce un numero asociado a un grupo registrado");
    }
    public static void incorrecto(){
        System.out.println("La opcion que has seleccionado no se encuentra en el menu");
    }
    public static void error(){
        System.out.println("Error no se ha podido encontrar al alumno en este grupo o no existe");
    }
}
