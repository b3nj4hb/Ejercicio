package vistacontrol;

import java.util.List;
import modelo.Biblioteca;
import modeloDAO.BibliotecaDAO;
import utils.Leer;

public class Index {
    
    public static void listarBiblioteca() {
        BibliotecaDAO bibliotecaDAO = new BibliotecaDAO();
        List<Biblioteca> bibliotecas = bibliotecaDAO.listarbiblioteca();
        System.out.println("Listado de Bibliotecas");
        System.out.println("ID\tNombre\tCódigo\tDirección\tTelefono\tEstado");
        for (Biblioteca biblioteca : bibliotecas) {
            System.out.println(
                    biblioteca.getIdbiblioteca()+ "\t"
                    + biblioteca.getNombre() + "\t"
                    + biblioteca.getCodigo() + "\t"
                    + biblioteca.getDireccion()+ "\t"
                    + biblioteca.getTelefono()+ "\t"
                    + biblioteca.getEstado()+ "\t"
            );
        }
    }

    public static void eliminarBiblioteca() {
        listarBiblioteca();
        System.out.println("Ingrese el ID del la biblioteca a Eliminar");
        int id = Leer.entero();
        BibliotecaDAO bibliotecaDAO = new BibliotecaDAO();
        bibliotecaDAO.eliminarbiblioteca(id);
    }

    public static void editarBiblioteca() {
        listarBiblioteca();
        System.out.println("Ingrese el ID del la biblioteca a editar: ");
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

    public static void agregarCurso_c1() {
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
        Curso_c1 curso = new Curso_c1(nombre, codigo, ciclo, turno, creditos, horas_semanales);
        CursoDAO_c1 cursoDAO_c1 = new CursoDAO_c1();
        cursoDAO_c1.agregarcurso_c1(curso);
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
    
    public static void switch_c1(){
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
                    listarCurso_c1();
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
    
    public static void switch_c2(){
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


