package controlador;

import java.util.*;
import clase.*;
import conexion.*;
import java.sql.*;

public class DaoSerie {

    public List<Serie> ListaSerie(int cadena) {
        List<Serie> lista = new ArrayList();
        String sql = "select * from serie where id_categoria = ?";
        Connection cn = null;
        PreparedStatement ps = null;

        try {
            cn = Conecta.getConexion();
            ps = cn.prepareStatement(sql);
            ps.setInt(1, cadena);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Serie s = new Serie();
                s.setIdSerie(rs.getString(1));
                s.setIdCategoria(rs.getInt(2));
                s.setName(rs.getString(3));
                s.setPrecio(rs.getDouble(4));
                s.setStock(rs.getInt(5));
                lista.add(s);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }

                if (ps != null) {
                    ps.close();
                }

            } catch (Exception ex) {
            }
        }

        return lista;
    }

}
