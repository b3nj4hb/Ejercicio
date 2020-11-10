package interfaces;

import java.util.List;
import modelo.Biblioteca;

public interface CRUD {

    public List listarbiblioteca(); // Listar
    public Biblioteca buscarbiblioteca(int idbiblioteca); //buscar
    public boolean agregarbiblioteca(Biblioteca biblioteca); //agregar
    public boolean editarbiblioteca(Biblioteca biblioteca);  //editar
    public boolean eliminarbiblioteca(int idbiblioteca);  //eliminar
    
}
