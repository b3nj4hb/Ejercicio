package vistacontrol;

import java.util.List;
import modelo.Biblioteca;
import modeloDAO.BibliotecaDAO;
import utils.Leer;

public class Index {

    public static void listarBiblioteca() {
        BibliotecaDAO bibliotecaDAO = new BibliotecaDAO();
        List<Biblioteca> bibliotecas = bibliotecaDAO.listarbiblioteca();
        System.out.println("Listado de Cursos");
        System.out.println("ID\tApellidos y Nombre\tDNI\tCódigo\tEstado");
        for (Biblioteca biblioteca : bibliotecas) {
            System.out.println(
                    biblioteca.getIdbiblioteca() + "\t"
                    + biblioteca.getNombre() + "\t"
                    + biblioteca.getCodigo() + "\t"
                    + biblioteca.getDireccion() + "\t"
                    + biblioteca.getTelefono() + "\t"
                    + biblioteca.getEstado() + "\t"
            );
        }
    }

    public static void eliminarBiblioteca() {
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

    public static void menu() {
        System.out.println("Menu Principal");
        System.out.println("1. Menu Ciclo 1");
        System.out.println("2. Menu Ciclo 2");
        System.out.println("3. Salir");
        System.out.print("Escoja opción [1-3]: ");
    }

    public static void menu_biblioteca() {
        System.out.println("Menu Ciclo 1");
        System.out.println("1. Agregar Biblioteca");
        System.out.println("2. Eliminar Biblioteca");
        System.out.println("3. Editar Biblioteca");
        System.out.println("4. Listar Biblioteca");
        System.out.println("5. Salir");
        System.out.print("Escoja opción [1-5]: ");
    }

    public static void inicio() {
        int opcion;
        do {
            menu_biblioteca();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    agregarBiblioteca();
                    break;
                case 2:
                    eliminarBiblioteca();
                    break;
                case 3:
                    editarBiblioteca();
                    break;
                case 4:
                    listarBiblioteca();
                    break;
                case 5:
                    System.out.println("Hasta la proxima");
                    break;
                default:
                    System.out.println("Error");
                    inicio();
                    break;
            }
        } while (opcion != 5);

    }

    public static void main(String[] args) {
        inicio();
    }
}
