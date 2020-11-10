package modeloDAO;

import config.bd.ConectaBd;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Biblioteca;

public class BibliotecaDAO implements CRUD{

    ConectaBd cn = new ConectaBd();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        Biblioteca e = new Biblioteca();
    
    @Override
    public List listarbiblioteca() {
         ArrayList<Biblioteca> bibliotecas = new ArrayList<>();
            String consulta = " select * from ciclo_1 ";
            try {
                con = cn.getConnection();
                pst = con.prepareStatement(consulta);
                rs = pst.executeQuery();

                while (rs.next()) {
                    Biblioteca biblioteca = new Biblioteca();
                    biblioteca.setIdcurso(rs.getInt("idcurso"));
                    biblioteca.setNombre(rs.getString("nombre"));
                    biblioteca.setCodigo(rs.getString("codigo"));
                    biblioteca.setCiclo(rs.getString("ciclo"));
                    biblioteca.setCreditos(rs.getInt("creditos"));
                    biblioteca.setHoras_semanales(rs.getInt("horas_semanales"));
                    bibliotecas.add(biblioteca);
                }

            } catch (Exception e) {
                System.out.println("Error: Problemas con el LISTAR");
                System.out.println(e.getMessage());
            }
            return cursos;
    }

    @Override
    public Biblioteca buscarbiblioteca(int idbiblioteca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregarbiblioteca(Biblioteca biblioteca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editarbiblioteca(Biblioteca biblioteca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarbiblioteca(int idbiblioteca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
