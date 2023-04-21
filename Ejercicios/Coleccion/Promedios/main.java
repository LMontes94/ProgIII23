package Coleccion.Promedios;

public class main {
    public static void main(String[] args){
        Alumno lucas = new Alumno();
        lucas.setNombreApellido("Lucas Montes");
        lucas.setEdad(29);
        
        Carrera tecSis = new Carrera();
        tecSis.setNombre("Tecnicatura Superior en Sistemas");
        tecSis.setCodigo(123);
        Materia prog1 = new Materia(01, "Programacion I", true);

        tecSis.setMaterias(prog1);
        tecSis.setMaterias(new Materia(02, "Laboratorio I", true));
        tecSis.setMaterias(new Materia(03, "Programacion II", false));
        tecSis.setMaterias(new Materia(04, "Laboratorio II", false));

        lucas.inscribirCarrera(tecSis, tecSis);

        
       lucas.inscribirMateria(prog1, lucas.getCarrera());

        lucas.mostrarNotas(prog1);
        
        System.out.println(lucas);
        lucas.mostrarNotasXMaterias();
    }
    

}
