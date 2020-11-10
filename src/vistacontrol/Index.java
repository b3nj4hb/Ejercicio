package vistacontrol;

import java.util.List;
import modelo.Biblioteca;
import modeloDAO.BibliotecaDAO;
import utils.Leer;

public class Index {

    public static void listarBiblioteca() {
        CursoDAO_c1 cursoDAO_c1 = new CursoDAO_c1();
        List<Curso_c1> cursos = cursoDAO_c1.listarcurso_c1();
        System.out.println("Listado de Cursos");
        System.out.println("ID\tApellidos y Nombre\tDNI\tCódigo\tEstado");
        for (Curso_c1 curso : cursos) {
            System.out.println(
                    curso.getIdcurso() + "\t"
                    + curso.getNombre() + "\t"
                    + curso.getCodigo() + "\t"
                    + curso.getCiclo() + "\t"
                    + curso.getTurno() + "\t"
                    + curso.getCreditos() + "\t"
                    + curso.getHoras_semanales() + "\t"
            );
        }
    }

    public static void eliminarCurso_c1() {
        listarBiblioteca();
        System.out.println("Ingrese el ID del curso a Eliminar");
        int id = Leer.entero();
        BibliotecaDAO bibliotecaDAO = new BibliotecaDAO();
        bibliotecaDAO.eliminarbiblioteca(id);
    }

    public static void editarBiblioteca() {
        listarBiblioteca();
        System.out.println("Ingrese el ID de la Biblioteca a editar: ");
        int id = Leer.entero();
        String nombre;
        String codigo;
        String direccion;
        String telefono;
        String estado;
        System.out.println("Editar Biblioteca");
        System.out.print("Nombre: ");
        nombre = Leer.cadena();
        System.out.print("Codigo: ");
        codigo = Leer.cadena();
        System.out.print("Direccion: ");
        direccion = Leer.cadena();
        System.out.print("Telefono: ");
        telefono = Leer.cadena();
        System.out.print("Estado: ");
        estado = Leer.cadena();
        Biblioteca biblioteca = new Biblioteca(id, nombre, codigo, direccion, telefono, estado);
        BibliotecaDAO bibliotecaDAO = new BibliotecaDAO();
        bibliotecaDAO.editarbiblioteca(biblioteca);
    }

    public static void agregarBiblioteca() {
        String nombre;
        String codigo;
        String direccion;
        String telefono;
        String estado;
        System.out.println("Editar Biblioteca");
        System.out.print("Nombre: ");
        nombre = Leer.cadena();
        System.out.print("Codigo: ");
        codigo = Leer.cadena();
        System.out.print("Direccion: ");
        direccion = Leer.cadena();
        System.out.print("Telefono: ");
        telefono = Leer.cadena();
        System.out.print("Estado: ");
        estado = Leer.cadena();
        Biblioteca biblioteca = new Biblioteca(nombre, codigo, direccion, telefono, estado);
        BibliotecaDAO bibliotecaDAO = new BibliotecaDAO();
        bibliotecaDAO.agregarbiblioteca(biblioteca);
    }

    public static void listarCurso_c2() {
        CursoDAO_c2 cursoDAO_c2 = new CursoDAO_c2();
        List<Curso_c2> cursos = cursoDAO_c2.listarcurso_c2();
        System.out.println("Listado de Cursos");
        System.out.println("ID\tApellidos y Nombre\tDNI\tCódigo\tEstado");
        for (Curso_c2 curso : cursos) {
            System.out.println(
                    curso.getIdcurso() + "\t"
                    + curso.getNombre() + "\t"
                    + curso.getCodigo() + "\t"
                    + curso.getCiclo() + "\t"
                    + curso.getTurno() + "\t"
                    + curso.getCreditos() + "\t"
                    + curso.getHoras_semanales() + "\t"
            );
        }
    }

    public static void eliminarCurso_c2() {
        listarCurso_c2();
        System.out.println("Ingrese el ID del curso a Eliminar");
        int id = Leer.entero();
        CursoDAO_c2 cursoDAO_c2 = new CursoDAO_c2();
        cursoDAO_c2.eliminarcurso_c2(id);
    }

    public static void editarCurso_c2() {
        listarCurso_c2();
        System.out.println("Ingrese el ID del curso a editar: ");
        int id = Leer.entero();
        String nombre;
        String codigo;
        String ciclo;
        String turno;
        int creditos;
        int horas_semanales;
        System.out.println("Editar Curso");
        System.out.print("Nombre: ");
        nombre = Leer.cadena();
        System.out.print("Codigo: ");
        codigo = Leer.cadena();
        System.out.print("Ciclo: ");
        ciclo = Leer.cadena();
        System.out.print("Turno: ");
        turno = Leer.cadena();
        System.out.print("Creditos: ");
        creditos = Leer.entero();
        System.out.print("Horas Semanales: ");
        horas_semanales = Leer.entero();
        Curso_c2 curso = new Curso_c2(id, nombre, codigo, ciclo, turno, creditos, horas_semanales);
        CursoDAO_c2 cursoDAO_c2 = new CursoDAO_c2();
        cursoDAO_c2.editarcurso_c2(curso);
    }

    public static void agregarCurso_c2() {
        String nombre;
        String codigo;
        String ciclo;
        String turno;
        int creditos;
        int horas_semanales;
        System.out.println("Editar Curso");
        System.out.print("Nombre: ");
        nombre = Leer.cadena();
        System.out.print("Codigo: ");
        codigo = Leer.cadena();
        System.out.print("Ciclo: ");
        ciclo = Leer.cadena();
        System.out.print("Turno: ");
        turno = Leer.cadena();
        System.out.print("Creditos: ");
        creditos = Leer.entero();
        System.out.print("Horas Semanales: ");
        horas_semanales = Leer.entero();
        Curso_c2 curso = new Curso_c2(nombre, codigo, ciclo, turno, creditos, horas_semanales);
        CursoDAO_c2 cursoDAO_c2 = new CursoDAO_c2();
        cursoDAO_c2.agregarcurso_c2(curso);
    }

    public static void menu() {
        System.out.println("Menu Principal");
        System.out.println("1. Menu Ciclo 1");
        System.out.println("2. Menu Ciclo 2");
        System.out.println("3. Salir");
        System.out.print("Escoja opción [1-3]: ");
    }

    public static void menu_c1() {
        System.out.println("Menu Ciclo 1");
        System.out.println("1. Agregar Cursos");
        System.out.println("2. Eliminar Cursos");
        System.out.println("3. Editar Cursos");
        System.out.println("4. Listar Cursos");
        System.out.println("5. Salir");
        System.out.print("Escoja opción [1-5]: ");
    }

    public static void menu_c2() {
        System.out.println("Menu Ciclo 2");
        System.out.println("1. Agregar Cursos");
        System.out.println("2. Eliminar Cursos");
        System.out.println("3. Editar Cursos");
        System.out.println("4. Listar Cursos");
        System.out.println("5. Salir");
        System.out.print("Escoja opción [1-5]: ");
    }

    public static void switch_c1() {
        int opcion;
        do {
            menu_c1();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    agregarCurso_c1();
                    break;
                case 2:
                    eliminarCurso_c1();
                    break;
                case 3:
                    editarCurso_c1();
                    break;
                case 4:
                    listarBiblioteca();
                    break;
                case 5:
                    inicio();
                    break;
                default:
                    System.out.println("Error");
                    switch_c1();
                    break;
            }
        } while (opcion != 5);

    }

    public static void switch_c2() {
        int opcion;
        do {
            menu_c2();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    agregarCurso_c2();
                    break;
                case 2:
                    eliminarCurso_c2();
                    break;
                case 3:
                    editarCurso_c2();
                    break;
                case 4:
                    listarCurso_c2();
                    break;
                case 5:
                    inicio();
                    break;
                default:
                    System.out.println("Error");
                    switch_c2();
                    break;
            }
        } while (opcion != 5);

    }

    public static void inicio() {

        int opcion;
        do {
            menu();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    switch_c1();
                    break;
                case 2:
                    switch_c2();
                    break;
                case 3:
                    System.out.println("Hasta la proxima...");
                    break;
                default:
                    System.out.println("Error");
                    inicio();
                    break;
            }
        } while (opcion != 3);
    }

    public static void main(String[] args) {
        inicio();
    }
}
