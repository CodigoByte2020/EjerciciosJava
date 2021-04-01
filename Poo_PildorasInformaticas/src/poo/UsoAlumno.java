package poo;

//import javax.swing.*;
public class UsoAlumno {

    public static void main(String[] args) {

        Alumno ArrayAlumnos[] = new Alumno[3];

        ArrayAlumnos[0] = new Alumno("Gianmi", 25, 18, 15, 20);
        ArrayAlumnos[1] = new Alumno("Jordy", 17, 14, 11, 12);
        ArrayAlumnos[2] = new Alumno("Miguel", 35, 19, 10, 14);

        //Otra forma correcta
//        for (int i = 0; i < ArrayAlumnos.length; i += 1) {
//            ArrayAlumnos[i] = new Alumno(JOptionPane.showInputDialog("¿ Cual es tu nombre ?"),
//                    Integer.parseInt(JOptionPane.showInputDialog("¿ Cual es tu edad ?")),
//                    Integer.parseInt(JOptionPane.showInputDialog("Nota 1: ")),
//                    Integer.parseInt(JOptionPane.showInputDialog("Nota 2: ")),
//                    Integer.parseInt(JOptionPane.showInputDialog("Nota 3: ")));
//        }
        //El iterador i recorre todo el array y ejecuta el método en cada posición de este
        for (Alumno i : ArrayAlumnos) {
            i.setPromedio();
        }

//        System.out.println("Promedio: " + ArrayAlumnos[0].getPromedio());
//        System.out.println("Promedio: " + ArrayAlumnos[1].getPromedio());
//        System.out.println("Promedio: " + ArrayAlumnos[2].getPromedio());
        for (Alumno i : ArrayAlumnos) {
            System.out.println("El alumno " + i.getNombre() + " tiene "
                    + i.getEdad() + " años, con notas: " + i.getNota1()
                    + ", " + i.getNota2() + ", " + i.getNota3()
                    + ". Promedio: " + i.getPromedio() + ". " + i.getMensajeFinal());
        }

//        for (Alumno i : ArrayAlumnos) {
//            System.out.println("Alumno " + i.getNombre() + ". "
//                    + i.getMensajeFinal());
//        }
    }
}
