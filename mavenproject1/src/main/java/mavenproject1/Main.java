/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package mavenproject1;
import gui.VentanaPrincipal;
import java.util.*;
import java.io.*;

public class Main {
    public static GAMLP Gamlp = new GAMLP();
    public static ArchivoGAMLP miArchGuarda = new ArchivoGAMLP("D:/misEscuelasNuevo.dat");
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        /*
        //Escuela 1 *231
        Gamlp.agregarEscuela(new EscuelaDeportiva("Piscina Municipal de Obrajes","Obrajes calle 11", 19),
                new Director("Bruno","Cifuentes","Palacios",54,784541,"M","15/01/2025","15/01/2026"),
                new Curso("101A","Natacion","M",12,15,20,"10:00","12:00","Lunes","Miercoles"));
        Gamlp.agregarEntrenador("Piscina Municipal de Obrajes","101A",
                new Entrenador("Santiago","Correa","Toledo",42,245877,"M","30/01/2025","20/12/2025"));
        Gamlp.inscribirEst("Piscina Municipal de Obrajes","101A",
                new Estudiante("Zoe","Figueroa","Navarro",13,786998,"M"),"01/02/2025",25,3);
        Gamlp.inscribirEst("Piscina Municipal de Obrajes","101A",
                new Estudiante("Thiago","Herrera","Luna",14,786998,"M"),"01/02/2025",25,3);
        
        Gamlp.agregarCurso(Gamlp.getEscuela("Piscina Municipal de Obrajes"),
                new Curso("102A","Gimnasia acuatica","F",18,21,10,"10:00","12:00","Martes","Jueves"));
        Gamlp.agregarEntrenador("Piscina Municipal de Obrajes","102A",
                new Entrenador("Renata", "Arias", "Gallardo",39,245877,"F","30/01/2025","20/12/2025"));
        Gamlp.inscribirEst("Piscina Municipal de Obrajes","102A",
                new Estudiante("Andres","Mendez","Rosales",18,786998,"F"),"01/02/2025",25,3);
        Gamlp.inscribirEst("Piscina Municipal de Obrajes","102A",
                new Estudiante("Mariano","Avini","Pino",20,786998,"F"),"01/02/2025",25,3);
        Gamlp.inscribirEst("Piscina Municipal de Obrajes","102A",
                new Estudiante("Raul","Padilla","Pino",19,745998,"F"),"01/02/2025",25,3);
        
        Gamlp.agregarCurso(Gamlp.getEscuela("Piscina Municipal de Obrajes"),
                new Curso("103A","Salto acuatico","M",15,18,50,"12:00","14:00","Lunes","Miercoles"));
        Gamlp.agregarEntrenador("Piscina Municipal de Obrajes","103A",
                new Entrenador("Daniel", "Pereira", "Arias",45,874577,"M","30/01/2025","20/12/2025"));
        Gamlp.inscribirEst("Piscina Municipal de Obrajes","103A",
                new Estudiante("Andrea","Arias","Padilla",18,786998,"M"),"01/02/2025",25,3);
        
        //Escuela 2 *32
        Gamlp.agregarEscuela(new EscuelaDeportiva("Escuela de Talentos Luis Lastre","Final calle Presbitero Medina",2),
                new Director("Andrea","Medrano","Pereira",60,754257,"F","15/01/2025","15/01/2026"),
                new Curso("201A","Raquetbol","M",15,18,20,"10:00","12:00","Lunes","Miercoles"));
        Gamlp.agregarEntrenador("Escuela de Talentos Luis Lastre","201A",
                new Entrenador("Renata", "Arias", "Gallardo",39,245877,"F","30/01/2025","20/12/2025"));
        Gamlp.inscribirEst("Escuela de Talentos Luis Lastre","201A",
                new Estudiante("Eduardo","Gomez","Padilla",18,786998,"M"),"01/02/2025",25,3);
        Gamlp.inscribirEst("Escuela de Talentos Luis Lastre", "201A",
                new Estudiante("Ivan", "Ramos", "Aliaga", 16, 527348, "M"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Escuela de Talentos Luis Lastre", "201A", 
                new Estudiante("Axel", "Chambi", "Torrez", 15, 294738, "M"), "01/02/2025", 25, 3);
        
        Gamlp.agregarCurso(Gamlp.getEscuela("Escuela de Talentos Luis Lastre"),
                new Curso("202A","Atletismo","M",15,18,50,"12:00","14:00","Lunes","Miercoles"));
        Gamlp.inscribirEst("Escuela de Talentos Luis Lastre", "202A", 
                new Estudiante("Alejandro", "Gutierrez", "Mamani", 17, 159437, "M"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Escuela de Talentos Luis Lastre", "202A", 
                new Estudiante("Gabriel", "Lopez", "Calle", 15, 749621, "M"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Escuela de Talentos Luis Lastre", "202A", 
                new Estudiante("Ivan", "Ramos", "Aliaga", 16, 527348, "M"), "01/02/2025", 25, 3);
        
        // Escuela 3 *423
        Gamlp.agregarEscuela(new EscuelaDeportiva("Cancha Venus","Pampahasi bajo calle 8",15),
                new Director("Andres","Rojas","Palacios",48,554645,"M","15/01/2025","15/01/2026"),
                new Curso("301A","Futbol","M",12,15,30,"10:00","12:00","Lunes","Miercoles"));
        Gamlp.agregarEntrenador("Cancha Venus","301A",
                new Entrenador("Marco", "Yujra", "Gonzales", 43, 528934, "M", "30/01/2025", "20/12/2025"));
        Gamlp.inscribirEst("Cancha Venus", "301A", 
                new Estudiante("Mateo", "Quispe", "Choque", 13, 247915, "M"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Cancha Venus", "301A", 
                new Estudiante("Andres", "Salinas", "Flores", 14, 572938, "M"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Cancha Venus", "301A", 
                new Estudiante("Bruno", "Garcia", "Copa", 15, 834761, "M"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Cancha Venus", "301A", 
                new Estudiante("Thengy", "Vargas", "Quenta", 12, 618742, "M"), "01/02/2025", 25, 3);
        
        Gamlp.agregarCurso(Gamlp.getEscuela("Cancha Venus"),
                new Curso("302A","Basket","F",15,18,50,"12:00","14:00","Lunes","Miercoles"));
        Gamlp.agregarEntrenador("Cancha Venus","302A",
                new Entrenador("Lorena", "Chura", "Yupanqui", 35, 614253, "F", "30/01/2025", "20/12/2025"));
        Gamlp.inscribirEst("Cancha Venus", "302A", 
                new Estudiante("Daniela", "Callisaya", "Choque", 16, 846129, "F"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Cancha Venus", "302A", 
                new Estudiante("Andrea", "Salazar", "Yupanqui", 18, 638295, "F"), "01/02/2025", 25, 3);
        
        Gamlp.agregarCurso(Gamlp.getEscuela("Cancha Venus"),
                new Curso("303A","Taekwondo","M",12,15,50,"10:00","12:00","Martes","Jueves"));
        Gamlp.agregarEntrenador("Cancha Venus","303A",
                new Entrenador("Daniela", "Quenta", "Ramos", 38, 612849, "F", "30/01/2025", "20/12/2025"));
        Gamlp.inscribirEst("Cancha Venus", "303A", 
                new Estudiante("Joaquin", "Cruz", "Mamani", 14, 617843, "M"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Cancha Venus", "303A", 
                new Estudiante("Esteban", "Apaza", "Medina", 13, 895126, "M"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Cancha Venus", "303A", 
                new Estudiante("Sebastian", "Canaviri", "Llanos", 14, 912387, "M"), "01/02/2025", 25, 3);

        // Escuela 4 *213
        Gamlp.agregarEscuela(new EscuelaDeportiva("Club de Tenis La Paz","Av. Arequipa 8450",19),
                new Director("Andres","Rojas","Palacios",48,554645,"M","15/01/2025","15/01/2026"),
                new Curso("401A","Tenis","M",15,18,20,"10:00","12:00","Lunes","Miercoles"));
        Gamlp.agregarEntrenador("Club de Tenis La Paz","401A",
                new Entrenador("Andres","Peñaloza","Ulo",42,136578,"M","30/01/2025","20/12/2025"));
        Gamlp.inscribirEst("Club de Tenis La Paz","401A",
                new Estudiante("Raul","Quispe","Melendez",16,122334,"M"),"01/02/2025",25,3);
        Gamlp.inscribirEst("Club de Tenis La Paz","401A",
                new Estudiante("Jorge","Padilla","Perez",17,123455,"M"),"01/02/2025",25,3);
        
        Gamlp.agregarCurso(Gamlp.getEscuela("Club de Tenis La Paz"),
                new Curso("402A","Padel","F",15,18,50,"10:00","12:00","Martes","Jueves"));
        Gamlp.agregarEntrenador("Club de Tenis La Paz","402A",
                new Entrenador("MAriana", "Avini", "Lopez",45,857425,"F","30/01/2025","20/12/2025"));
        Gamlp.inscribirEst("Club de Tenis La Paz","402A",
                new Estudiante("Lucy","Heart","Blade",17,12455,"F"),"01/02/2025",25,3);
        
        Gamlp.agregarCurso(Gamlp.getEscuela("Club de Tenis La Paz"),
                new Curso("403A","Badminton","F",15,18,50,"12:00","14:00","Martes","Jueves"));
        Gamlp.agregarEntrenador("Club de Tenis La Paz","403A", 
                new Entrenador("Paola", "Medina", "Apaza", 45, 394872, "F", "30/01/2025", "20/12/2025"));
        Gamlp.inscribirEst("Club de Tenis La Paz", "403A", 
                new Estudiante("Renata", "Flores", "Mamani", 15, 978346, "F"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Club de Tenis La Paz", "403A", 
                new Estudiante("Maria", "Gomez", "Quispe", 17, 537128, "F"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Club de Tenis La Paz", "403A", 
                new Estudiante("Melany", "Choque", "Llanque", 17, 623781, "F"), "01/02/2025", 25, 3);

        // Escuela 5 *34
        Gamlp.agregarEscuela(new EscuelaDeportiva("Campo Deportivo El Carmen","Alto Obrajes calle 10",19),
                new Director("Luis", "Gutierrez", "Quispe", 54, 284159, "M", "15/01/2025", "15/01/2026"),
                new Curso("501A","Fubol","M",18,21,20,"10:00","12:00","Lunes","Miercoles"));
        Gamlp.agregarEntrenador("Campo Deportivo El Carmen", "501A",
                new Entrenador("Raul", "Loayza", "Condori", 50, 459721, "M", "30/01/2025", "20/12/2025"));
        Gamlp.inscribirEst("Campo Deportivo El Carmen", "501A", 
                new Estudiante("Francisco", "Mamani", "Salinas", 19, 319842, "M"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Campo Deportivo El Carmen", "501A", 
                new Estudiante("Mauricio", "Torrez", "Aliaga", 21, 961824, "M"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Campo Deportivo El Carmen", "501A", 
                new Estudiante("Kevin", "Gutierrez", "Poma", 18, 648293, "M"), "01/02/2025", 25, 3);
        
        Gamlp.agregarCurso(Gamlp.getEscuela("Campo Deportivo El Carmen"),
                new Curso("502A","Volley","F",15,18,50,"12:00","14:00","Lunes","Miercoles"));
        Gamlp.agregarEntrenador("Campo Deportivo El Carmen","502A", 
                new Entrenador("Karen", "Lopez", "Ticona", 37, 548726, "F", "30/01/2025", "20/12/2025"));
        Gamlp.inscribirEst("Campo Deportivo El Carmen", "502A", 
                new Estudiante("Mariana", "Zambrana", "Quispe", 17, 948213, "F"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Campo Deportivo El Carmen", "502A", 
                new Estudiante("Noelia", "Medina", "Gomez", 16, 861934, "F"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Campo Deportivo El Carmen", "502A", 
                new Estudiante("Melany", "Choque", "Llanque", 17, 623781, "F"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Campo Deportivo El Carmen", "502A", 
                new Estudiante("Rosario", "Poma", "Mollo", 17, 623781, "F"), "01/02/2025", 25, 3);

        // Escuela 6 *243
        Gamlp.agregarEscuela(new EscuelaDeportiva("Cancha San Luis Cristo Rey","Zona Cristo Rey",13),
                new Director("Ana", "Salazar", "Flores", 41, 359812, "F", "15/01/2025", "15/01/2026"),
                new Curso("601A","Tenis","M",12,15,20,"10:00","12:00","Lunes","Miercoles"));
        Gamlp.agregarEntrenador("Cancha San Luis Cristo Rey", "601A",
                new Entrenador("Oscar", "Canaviri", "Mollo", 47, 892436, "M", "30/01/2025", "20/12/2025"));
        Gamlp.inscribirEst("Cancha San Luis Cristo Rey", "601A", 
                new Estudiante("Luis", "Salazar", "Perez", 13, 124567, "M"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Cancha San Luis Cristo Rey", "601A", 
                new Estudiante("Esteban", "Gutierrez", "Luna", 12, 345689, "M"), "01/02/2025", 25, 3);
        
        Gamlp.agregarCurso(Gamlp.getEscuela("Cancha San Luis Cristo Rey"),
                new Curso("602A","Volley","M",15,18,50,"12:00","14:00","Lunes","Miercoles"));
        Gamlp.agregarEntrenador("Cancha San Luis Cristo Rey","602A", 
                new Entrenador("Rafael","Lupa","Huanca",42,734521,"M","30/01/2025","20/12/2025"));
        Gamlp.inscribirEst("Cancha San Luis Cristo Rey", "602A", 
                new Estudiante("Oscar", "Paredes", "Vega", 16, 823458, "M"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Cancha San Luis Cristo Rey", "602A", 
                new Estudiante("Enzo", "Herrera", "Vargas", 15, 145670, "M"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Cancha San Luis Cristo Rey", "602A", 
                new Estudiante("Aaron", "Choque", "Mamani", 17, 367892, "M"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Cancha San Luis Cristo Rey", "602A", 
                new Estudiante("Diego", "Soria", "Flores", 16, 589014, "M"), "01/02/2025", 25, 3);
        
        Gamlp.agregarCurso(Gamlp.getEscuela("Cancha San Luis Cristo Rey"),
                new Curso("603A","Defensa personal","F",12,15,30,"12:00","14:00","Lunes","Miercoles"));
        Gamlp.agregarEntrenador("Cancha San Luis Cristo Rey","602A", 
                new Entrenador("Vanessa","Apaza","Ticona",36,849372,"F","30/01/2025","20/12/2025"));
        Gamlp.inscribirEst("Cancha San Luis Cristo Rey", "603A", 
                new Estudiante("Carla", "Rojas", "Lopez", 14, 234578, "F"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Cancha San Luis Cristo Rey", "603A", 
                new Estudiante("Diana", "Mamani", "Torrez", 15, 456781, "F"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Cancha San Luis Cristo Rey", "603A", 
                new Estudiante("Valeria", "Quispe", "Martinez", 13, 678903, "F"), "01/02/2025", 25, 3);

        // Escuela 7 *43
        Gamlp.agregarEscuela(new EscuelaDeportiva("Piscina Orkojahuira","Av.Pasoskanki",6),
                new Director("Jorge", "Aliaga", "Calle", 58, 945276, "M", "15/01/2025", "15/01/2026"),
                new Curso("701A","Natacion","F",12,15,20,"10:00","12:00","Lunes","Miercoles"));
        Gamlp.agregarEntrenador("Piscina Orkojahuira", "701A",
                new Entrenador("Paola", "Medina", "Apaza", 45, 394872, "F", "30/01/2025", "20/12/2025"));
        Gamlp.inscribirEst("Piscina Orkojahuira", "701A", 
                new Estudiante("Luciana", "Mendez", "Rojas", 13, 890125, "F"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Piscina Orkojahuira", "701A", 
                new Estudiante("Camila", "Zamora", "Aliaga", 14, 612347, "F"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Piscina Orkojahuira", "701A", 
                new Estudiante("Melany", "Castillo", "Cruz", 12, 156781, "F"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Piscina Orkojahuira", "701A", 
                new Estudiante("Noelia", "Gutierrez", "Torrez", 15, 712347, "F"), "01/02/2025", 25, 3);
        
        Gamlp.agregarCurso(Gamlp.getEscuela("Piscina Orkojahuira"),
                new Curso("702A","Gimnasia acuatica","M",15,18,50,"12:00","14:00","Lunes","Miercoles"));
        Gamlp.agregarEntrenador("Piscina Orkojahuira","702A",
                new Entrenador("Wilmer","Callisaya","Marca",47,982361,"M","30/01/2025","20/12/2025"));
        Gamlp.inscribirEst("Piscina Orkojahuira", "702A", 
                new Estudiante("Nicolas", "Gutierrez", "Soto", 17, 801236, "M"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Piscina Orkojahuira", "702A", 
                new Estudiante("Joel", "Rojas", "Silva", 15, 123458, "M"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Piscina Orkojahuira", "702A", 
                new Estudiante("Bruno", "Zambrana", "Roca", 18, 345670, "M"), "01/02/2025", 25, 3);
        
        // Escuela 8 *433
        Gamlp.agregarEscuela(new EscuelaDeportiva("Polideportivo Villa Fatima","Av. Las Americas",12),
                new Director("Patricia", "Callisaya", "Lopez", 45, 123674, "F", "15/01/2025", "15/01/2026"),
                new Curso("801A","Judo","F",15,18,20,"12:00","14:00","Lunes","Miercoles"));
        Gamlp.agregarEntrenador("Polideportivo Villa Fatima", "801A",
                new Entrenador("Eliana", "Rojas", "Cespedes", 41, 869413, "F", "30/01/2025", "20/12/2025"));
        Gamlp.inscribirEst("Polideportivo Villa Fatima", "801A", 
                new Estudiante("Julieta", "Ortiz", "Quispe", 17, 934569, "F"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Polideportivo Villa Fatima", "801A", 
                new Estudiante("Dayana", "Reyes", "Montano", 16, 256781, "F"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Polideportivo Villa Fatima", "801A", 
                new Estudiante("Emilia", "Ramos", "Aguirre", 18, 478903, "F"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Polideportivo Villa Fatima", "801A", 
                new Estudiante("Carmen", "Aliaga", "Perez", 15, 690125, "F"), "01/02/2025", 25, 3);
                
        Gamlp.agregarCurso(Gamlp.getEscuela("Polideportivo Villa Fatima"),
                new Curso("802A","Basket","M",12,15,30,"12:00","14:00","Lunes","Miercoles"));
        Gamlp.agregarEntrenador("Polideportivo Villa Fatima","802A",
                new Entrenador("Jhonatan","Quenta","Alarcon",33,758209,"M","30/01/2025","20/12/2025"));
        Gamlp.inscribirEst("Polideportivo Villa Fatima", "802A", 
                new Estudiante("Hugo", "Callisaya", "Paredes", 13, 567892, "M"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Polideportivo Villa Fatima", "802A", 
                new Estudiante("Felipe", "Vega", "Condori", 14, 789014, "M"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Polideportivo Villa Fatima", "802A", 
                new Estudiante("Mateo", "Flores", "Rivera", 14, 567892, "M"), "01/02/2025", 25, 3);
        
        Gamlp.agregarCurso(Gamlp.getEscuela("Polideportivo Villa Fatima"),
                new Curso("803A","Gimnasia artistica","F",12,15,30,"12:00","14:00","Lunes","Miercoles"));
        Gamlp.agregarEntrenador("Polideportivo Villa Fatima","803A",
                new Entrenador("Silvia","Catari","Nina",39,673184,"F","30/01/2025","20/12/2025"));
        Gamlp.inscribirEst("Polideportivo Villa Fatima", "803A", 
                new Estudiante("Gaby", "Sanchez", "Rosales", 13, 267892, "F"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Polideportivo Villa Fatima", "803A", 
                new Estudiante("Ariana", "Morales", "Suarez", 14, 378903, "F"), "01/02/2025", 25, 3);
        Gamlp.inscribirEst("Polideportivo Villa Fatima", "803A", 
                new Estudiante("Ximena", "Pinto", "Llanos", 13, 590125, "F"), "01/02/2025", 25, 3);
        
                
                
        /*ALUMNOS 12-15

Gamlp.inscribirEst("-", "-", new Estudiante("Sebastian", "Vargas", "Camacho", 15, 789014, "M"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Brayan", "Choque", "Fernandez", 12, 901236, "M"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("David", "Medina", "Perez", 13, 723458, "M"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Ivan", "Torrico", "Mamani", 14, 945670, "M"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Cristian", "Delgado", "Borda", 15, 489014, "M"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Alvaro", "Callisaya", "Rojas", 12, 601236, "M"), "01/02/2025", 25, 3);
                
        /*ALUMONS 15-18

Gamlp.inscribirEst("-", "-", new Estudiante("Isabel", "Llanos", "Vargas", 16, 912347, "F"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Daniela", "Cruz", "Mamani", 17, 234569, "F"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Alison", "Miranda", "Mendoza", 16, 456781, "F"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Eva", "Morales", "Lopez", 17, 678903, "F"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Sara", "Torrez", "Aliaga", 18, 890125, "F"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Axel", "Condori", "Choque", 15, 901236, "M"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Micaela", "Sanchez", "Reyes", 16, 612347, "F"), "01/02/2025", 25, 3);
        
        /*ALUMNOS 18-21

Gamlp.inscribirEst("-", "-", new Estudiante("Leo", "Rios", "Camacho", 18, 723458, "M"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Karen", "Zeballos", "Soto", 19, 834569, "F"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Rodrigo", "Gutierrez", "Ramos", 20, 945670, "M"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Patricia", "Aliaga", "Soria", 21, 156781, "F"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Martin", "Montano", "Paz", 19, 267892, "M"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Pamela", "Miranda", "Vargas", 18, 378903, "F"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Andres", "Lopez", "Callisaya", 21, 489014, "M"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Marina", "Borda", "Torrico", 20, 590125, "F"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Ivan", "Perez", "Delgado", 19, 601236, "M"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Anahi", "Fernandez", "Rojas", 20, 712347, "F"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Cristian", "Mamani", "Gutierrez", 21, 823458, "M"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Lorena", "Rios", "Zamora", 19, 934569, "F"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Sergio", "Zambrana", "Vega", 18, 145670, "M"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Tatiana", "Soria", "Loayza", 20, 256781, "F"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Franco", "Camacho", "Ramos", 21, 367892, "M"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Natalia", "Torrez", "Montano", 19, 478903, "F"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Jhonatan", "Luna", "Silva", 20, 589014, "M"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Elena", "Reyes", "Flores", 18, 690125, "F"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Miguel", "Morales", "Borda", 21, 801236, "M"), "01/02/2025", 25, 3);
Gamlp.inscribirEst("-", "-", new Estudiante("Valentina", "Cruz", "Delgado", 20, 912347, "F"), "01/02/2025", 25, 3);
        */
        
        
// Persistencia Archivos
        // CREAR
        //miArchGuarda.creacion();
        
        // LEER
        //miArchGuarda.leerNuevo("D:/misEscuelasNuevo.dat");

        Gamlp.mostrar();
        
        // GUARDAR
        //miArchGuarda.guardarNuevo("D:/misEscuelasNuevo.dat", Gamlp.getAllEscuelas(), Gamlp.getNroEscuelas(),Gamlp.getAllDeportes(),Gamlp.getAllContDeportes(), Gamlp.getNroDeportes());
        
        //Gamlp.getEscuela("Don Bosco").mostrarTodo();
        //Gamlp.getEscuela("Jerusalem").mostrarTodo();
        /*
        System.out.println("\n    EJERCICIOS");
//ej1. mostrar ranking deportes
        System.out.println("******** 1 ********");
        Gamlp.ordenarDeportes();
        Gamlp.mostrarDeportes();
        
//ej2. buscar por apellido
        System.out.println("******** 2 ********");
        Gamlp.buscaApellido("Mamani");
//ej3. listar escuelas de distrito X
        System.out.println("******** 3 ********");
        Gamlp.escuelasDistrito(19);
//ej4. mostrar curso(s) con mas estudiantes por escuela
        System.out.println("******** 4 ********");
        Gamlp.mejoresCursos();
//ej5. mostrar curso disponible segun edad y genero
        System.out.println("******** 5 ********");
        Gamlp.cursosDisponibles(12,"F");
        
        */
        
        VentanaPrincipal vent = new VentanaPrincipal();
        vent.setVisible(true);
        
    
    } 
}


