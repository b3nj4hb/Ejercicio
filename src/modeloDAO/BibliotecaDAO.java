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
            String consulta = " select * from Huamani_biblioteca ";
            try {
                con = cn.getConnection();
                pst = con.prepareStatement(consulta);
                rs = pst.executeQuery();

                while (rs.next()) {
                    Biblioteca biblioteca = new Biblioteca();
                    biblioteca.setIdbiblioteca(rs.getInt("ididbiblioteca"));
                    biblioteca.setNombre(rs.getString("nombre"));
                    biblioteca.setCodigo(rs.getString("codigo"));
                    biblioteca.setDireccion(rs.getString("direccion"));
                    biblioteca.setTelefono(rs.getString("telefono"));
                    biblioteca.setEstado(rs.getString("estado"));
                    bibliotecas.add(biblioteca);
                }

            } catch (Exception e) {
                System.out.println("Error: Problemas con el LISTAR");
                System.out.println(e.getMessage());
            }
            return bibliotecas;
    }

    @Override
    public Biblioteca buscarbiblioteca(int idbiblioteca) {
        String consulta = " select * from Huamani_biblioteca  "
                    + " where Huamani_biblioteca = " + idbiblioteca;
            try {
                con = cn.getConnection();
                pst = con.prepareStatement(consulta);
                rs = pst.executeQuery();
                while (rs.next()) {
                    e.setIdbiblioteca(rs.getInt("ididbiblioteca"));
                    e.setNombre(rs.getString("nombre"));
                    e.setCodigo(rs.getString("codigo"));
                    e.setDireccion(rs.getString("direccion"));
                    e.setTelefono(rs.getString("telefono"));
                    e.setEstado(rs.getString("estado"));
                }
            } catch (Exception error) {
                System.out.println("Error: Problemas con el BUSCAR");
                System.out.println(error.getMessage());
            }

            return e;
    }

    @Override
    public boolean agregarbiblioteca(Biblioteca biblioteca) {
         String consulta = " insert into "
                    + "Huamani_biblioteca (nombre, codigo, direccion, telefono, estado) "
                    + " values ('" + biblioteca.getNombre() + "',"
                    + " '" + biblioteca.getNombre() + "',"
                    + " '" + biblioteca.getCodigo() + "',"
                    + " '" + biblioteca.getDireccion() + "',"
                    + " '" + biblioteca.getTelefono() + "',"
                    + " '" + biblioteca.getEstado() + "')";

            try {
                con = cn.getConnection();
                pst = con.prepareStatement(consulta);
                pst.executeUpdate();
            } catch (Exception error) {
                System.out.println("Error: Problemas con el INSERT");
                System.out.println(error.getMessage());
                return false;
            }

            return true;
        }

    @Override
    public boolean editarbiblioteca(Biblioteca biblioteca) {
         String consulta = " update Huamani_biblioteca "
                    + " set "
                    + " nombre = '" + biblioteca.getNombre() + "' "
                    + " codigo = '" + biblioteca.getCodigo() + "' "
                    + " direccion = '" + biblioteca.getDireccion() + "' "
                    + " telefono = '" + biblioteca.getTelefono() + "' "
                    + " estado = '" + biblioteca.getEstado() + "' "
                    + " where "
                    + " idbiblioteca = " + biblioteca.getIdbiblioteca();
            try {
                con = cn.getConnection();
                pst = con.prepareStatement(consulta);
                pst.executeUpdate();
            } catch (Exception error) {
                System.out.println("Error: Problemas con la EDICION");
                System.out.println(error.getMessage());
                return false;
            }

            return true;
        }

    @Override
    public boolean eliminarbiblioteca(int idbiblioteca) {
        String consulta = " delete from Huamani_biblioteca  "
                    + " where idbiblioteca = " + idbiblioteca;
            try {
                con = cn.getConnection();
                pst = con.prepareStatement(consulta);
                pst.executeUpdate();
            } catch (Exception error) {
                System.out.println("Error: Problemas con el ELIMINAR");
                System.out.println(error.getMessage());
                return false;
            }

            return true;
        }

    
    
}
