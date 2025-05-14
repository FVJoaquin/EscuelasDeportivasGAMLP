/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package mavenproject1;
public class Main {

    public static void main(String[] args) {
        // Creacion de escuela
        EscuelaDeportiva escuela1 = new EscuelaDeportiva("Don Bosco","calle 78",7);
        escuela1.mostrarTodo();         //1ra impresion
        escuela1.inscribirEstudiante("Jordy","Rodriguez","Chacon",19,123456);
        escuela1.mostrarTodo();         //2da impresion
        // Creacion de cursos y entrenadores
        Curso curso101 = new Curso("101","futbol",15,18,45);
        Curso curso102 = new Curso("102","volley",14,20,50);
        Entrenador ent1 = new Entrenador("Jose","Flores","Mamani",42,789789,
                "05/03/2025","20/06/2025");
        escuela1.agregarEntrenador(ent1);
        escuela1.agregarEntrenador(new Entrenador("Andrea","Perez","Loza",38,456456,
                "08/03/2025","20/06/2025"));
        curso101.asignarEntrenador(ent1);
        curso102.asignarEntrenador(escuela1.getPlantel(2));
        escuela1.agregarCurso(curso101);
        escuela1.agregarCurso(curso102);
        //Inscripcion de ESTUDIANTE a ESCUELA
        Inscripcion Futbol101 = new Inscripcion("futbol","10:00","12:00","Lunes","Miercoles",
            "01/02/2025",50,4);
        Inscripcion Volley102 = new Inscripcion("volley","12:00","14:00","Lunes","Miercoles",
            "01/02/2025",50,4);
        Estudiante est2 = new Estudiante();
        Estudiante est3 = new Estudiante("Joaquin","Flores","Vasquez",22,125897);
        escuela1.inscribirEstudiante(est2);
        escuela1.inscribirEstudiante(est3);
        escuela1.inscribirEstudiante("Bryan","Patty","Tancara",20,645645);
        escuela1.mostrarTodo();         //3ra impresion
        //Inscripcion de ESTUDIANTE a CURSO
        escuela1.getEsts(1).inscribir(Futbol101, curso101);
        est3.inscribir(Volley102, curso102);
        escuela1.getEsts(4).inscribir(Futbol101, curso101);
        //Mostrar escuela
        escuela1.mostrarTodo();
        
        
    }
}
