import Model.Alumno;
import Model.Grupo;

public class mainEscuela {
    public static void main(String[] args) {
        Grupo g1= new Grupo("PrimeroSMR");

        Alumno a1= new Alumno("Prados",6.5);
        Alumno a2= new Alumno("Victor",8.5);
        Alumno a3= new Alumno("Sergio",9.0);
        Alumno a4= new Alumno("Prados",4.5);

        g1.add(a1);
        g1.add(a2);
        g1.add(a3);
        g1.add(a4);

        System.out.println(g1.remove("Victor"));
        System.out.println(g1);
    }
}
