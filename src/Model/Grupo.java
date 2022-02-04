package Model;

import java.util.ArrayList;
import java.util.Iterator;

import Vista.print;

public class Grupo {
    private String nombre;
    private ArrayList<Alumno> array;

    public Grupo(String nombre) {
        this.nombre = nombre;
        array=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean add(Alumno a){
        boolean result=false;

        if (a!=null&&!this.array.contains(a)){
            this.array.add(a);
            result=true;
        }
        return result;
    }

    public Alumno remove(String nombre){
        //Iterator<Alumno> it= array.iterator();
        Alumno b=null;
        /*
        while (it.hasNext()){
            Alumno a=it.next();
            if (a.getNombre().equals(nombre)) {
                b=a;
                it.remove();
            }
        }*/
        /*
        for (Alumno a:array) {
            if (a.getNombre().equals(nombre)){
                b=a;
                array.remove(a);
            }
        }
         */
        /*
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getNombre().equals(nombre)){
                b=array.get(i);
                array.remove(b);
            }
        }
        */
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getNombre().equals(nombre)){
                b=array.get(i);
                array.remove(i);
            }
        }
        return b;
    }

    /**
     *Encontrar posición de un alumno por su nombre
     * @param name nombre del alumno a buscar
     * @return (devuelve la posición, -1 si no lo encuentra).
     */
    public int searchAlum(String name){
        int pos=-1;
        for (Alumno a: array) {
            if (a.getNombre().equals(nombre)){
                pos= array.indexOf(a);
            }
        }
        return pos;
    }

    /**
     *Devolver datos de un alumno en función de su nombre
     * @param name nombre del alumno a buscar
     * @return devuelve el alumno, si no lo encuentra, devuelve NULL
     */
    public Alumno findAlum(String name){
        Alumno a=null;
        for (Alumno b:array) {
            if (b.getNombre().equals(name)){
                a=b;
            }
        }
        return a;
    }

    /**
     * Modifica la nota de un alumno segun su nombre
     * @param name nombre del alumno al que le queremos cambiar la nota
     * @param newNote la nueva nota a cambiar
     * @return devuelve true si se a camiado y false si no se a encontrado el alumno
     */
    public boolean editNote(String name, Double newNote){
        boolean cambiada=false;
        for (Alumno a:array) {
            if (a.getNombre().equals(nombre)){
                a.setNota(newNote);
                cambiada=true;
            }
        }
        return cambiada;
    }

    /**
     * Devuelve la nota media de la clase
     * @return
     */
    public Double average(){
        Double average=0.0;
        Double total=0.0;
        for (Alumno a:array) {
            total+=a.getNota();
        }
        average=total/ array.size();
        return average;
    }

    /**
     * Metodo para devolver el alumno con la nota mas alta del grupo
     * @return devuelve el alumno con la nota mas alta
     */
    public Alumno highestNote(){
        Alumno a=null;
        Double alta=0.0;
        for (Alumno b:array) {
            if (b.getNota()>alta){
                alta=b.getNota();
                a=b;
            }
        }
        return a;
    }

    /**
     * Metodo para devolver el alumno con la nota mas baja del grupo
     * @return devuelve el alumno con la nota mas baja
     */
    public Alumno lowestNote(){
        Alumno a=null;
        Double baja=array.get(0).getNota();
        for (Alumno b:array) {
            if (b.getNota()<baja){
                baja=b.getNota();
                a=b;
            }
        }
        return a;
    }

    @Override
    public String toString() {
        String s="GRUPO: "+ this.nombre;

        for (Alumno a:array) {
            s+= a.toString();
        }
        return s;
    }
}
