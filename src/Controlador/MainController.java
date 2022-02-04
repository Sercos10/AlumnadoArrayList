package Controlador;

import Model.Alumno;
import Model.Grupo;
import Utils.pedir;
import Vista.print;

public class MainController {
    public void start() {
        print.Bienvenida();
        print.MainMenu();
        int option = pedir.leeEntero();
        Grupo primeroSMR = new Grupo("PrimeroSMR");
        Grupo segundoSMR = new Grupo("SegundoSMR");
        do {
            switch (option) {
                case 1:
                    String nombre = pedir.leeRespuesta("Introduzca el nombre del alumno a añadir");
                    Double nota = pedir.leeDouble("Introduzca la nota del nuevo alumno");
                    Alumno nuevo = new Alumno(nombre, nota);
                    boolean introducido = false;
                    print.selectGroup();
                    do {
                        int grupo = pedir.leeEntero();
                        if (grupo > 0 && grupo < 3) {
                            if (grupo == 1) {
                                primeroSMR.add(nuevo);
                                print.añadido(primeroSMR, nuevo);
                            } else {
                                segundoSMR.add(nuevo);
                                print.añadido(segundoSMR, nuevo);
                            }
                            introducido = true;
                        } else {
                            print.errorGrupo();
                        }
                    } while (!introducido);
                    break;
                case 2:
                    print.SecundaryMenu();
                    boolean escogido = false;
                    do {
                        int grupo = pedir.leeEntero();
                        if (grupo > 0 && grupo < 3) {
                            if (grupo == 1) {
                                print.optionsSecundary();
                                int escoger = pedir.leeEntero();
                                do {
                                    switch (escoger) {
                                        case 1:
                                            Alumno eliminado = null;
                                            nombre = pedir.leeRespuesta("Introduce el nombre del alumno a eliminar");
                                            eliminado = primeroSMR.remove(nombre);
                                            print.eliminado(primeroSMR, eliminado);
                                            break;
                                        case 2:
                                            int pos = -1;
                                            pos = primeroSMR.searchAlum(nombre = pedir.leeRespuesta("Introduce el nombre del alumno a buscar"));
                                            Alumno encontrado = primeroSMR.findAlum(nombre);
                                            print.encontradoPos(primeroSMR, encontrado, pos);
                                            break;
                                        case 3:
                                            encontrado = primeroSMR.findAlum(nombre = pedir.leeRespuesta("Introduce el nombre del alumno a buscar"));
                                            print.encotradoNom(primeroSMR, encontrado);
                                            break;
                                        case 4:
                                            boolean correcto = false;
                                            Double newNote = pedir.leeDouble("Introduce la nueva nota del alumno");
                                            correcto = primeroSMR.editNote(nombre = pedir.leeRespuesta("Introduce el nombre del alumno al qe quieres modificar la nota"), newNote);
                                            encontrado = primeroSMR.findAlum(nombre);
                                            if (correcto) {
                                                print.newNote(primeroSMR, encontrado, newNote);

                                            } else {
                                                print.error();
                                            }
                                            break;
                                        case 5:
                                            Double media = primeroSMR.average();
                                            print.media(primeroSMR, media);
                                            break;
                                        case 6:
                                            Alumno empollon = primeroSMR.highestNote();
                                            print.alta(primeroSMR, empollon);
                                            break;
                                        case 7:
                                            Alumno vago = primeroSMR.lowestNote();
                                            print.baja(primeroSMR, vago);
                                            break;
                                        default:
                                            print.incorrecto();
                                            break;
                                    }
                                    print.optionsSecundary();
                                    escoger = pedir.leeEntero();
                                } while (escoger != 8);

                            } else {
                                print.optionsSecundary();
                                int escoger = pedir.leeEntero();
                                do {
                                    switch (escoger) {
                                        case 1:
                                            Alumno eliminado = null;
                                            nombre = pedir.leeRespuesta("Introduce el nombre del alumno a eliminar");
                                            eliminado = segundoSMR.remove(nombre);
                                            print.eliminado(segundoSMR, eliminado);
                                            break;
                                        case 2:
                                            int pos = -1;
                                            pos = segundoSMR.searchAlum(nombre = pedir.leeRespuesta("Introduce el nombre del alumno a buscar"));
                                            Alumno encontrado = segundoSMR.findAlum(nombre);
                                            print.encontradoPos(segundoSMR, encontrado, pos);
                                            break;
                                        case 3:
                                            encontrado = segundoSMR.findAlum(nombre = pedir.leeRespuesta("Introduce el nombre del alumno a buscar"));
                                            print.encotradoNom(segundoSMR, encontrado);
                                            break;
                                        case 4:
                                            boolean correcto = false;
                                            Double newNote = pedir.leeDouble("Introduce la nueva nota del alumno");
                                            correcto = segundoSMR.editNote(nombre = pedir.leeRespuesta("Introduce el nombre del alumno al qe quieres modificar la nota"), newNote);
                                            encontrado = segundoSMR.findAlum(nombre);
                                            if (correcto) {
                                                print.newNote(segundoSMR, encontrado, newNote);

                                            } else {
                                                print.error();
                                            }
                                            break;
                                        case 5:
                                            Double media = segundoSMR.average();
                                            print.media(segundoSMR, media);
                                            break;
                                        case 6:
                                            Alumno empollon = segundoSMR.highestNote();
                                            print.alta(segundoSMR, empollon);
                                            break;
                                        case 7:
                                            Alumno vago = segundoSMR.lowestNote();
                                            print.baja(segundoSMR, vago);
                                            break;
                                        default:
                                            print.incorrecto();
                                            break;
                                    }
                                    print.optionsSecundary();
                                    escoger = pedir.leeEntero();
                                } while (escoger != 8);
                            }
                            escogido = true;
                        } else {
                            print.errorGrupo();
                        }
                    } while (!escogido);
                    break;
                case 3:
                    print.muestraGrupo(primeroSMR);
                    print.muestraGrupo(segundoSMR);
                    break;
                case 4:
                    print.adios();
                    break;
                default:
                    print.incorrecto();
            }
            print.MainMenu();
            option = pedir.leeEntero();
        } while (option != 4);
    }
}
