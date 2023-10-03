package Modelo;

import java.sql.Connection;

public class UsuarioBase {
    private Connection conexion;
    public UsuarioBase (){
        this.conexion=Conexion.conectar();
    }
    public void agregarUsario UsuarioBase unUsuario) {

        try (Statement sentenciaInsert = conexion.createStatement()) {
            String insert = "insert into Usuarios (id_Usuario, nombre) values(";
            insert += unUsuario.getIdUsuario() + ", ";
            //
            String nombreUsuario = unUsuario.getNombre().replace("'", "\'");
            insert += "'" + nombreUsuario + "'";
            insert += ")";
            sentenciaInsert.executeUpdate(insert);

        }
        catch (SQLException ex) {
            System.out.println("Error: en sentencia de creación de usuario: \n" + ex.getMessage());
            ex.printStackTrace();
        }

    }

    public UsuarioBase getIdUsuario(int idUsuario){
        Casa result = null;
        try (Statement sentenciaConsulta = conexion.createStatement()) {
            String query = "select nombre from Usuario where id_Usuario = ";
            query += idUsuario;
            ResultSet rs = sentenciaConsulta.executeQuery(query);

            while (rs.next())
            {
                String nombre = rs.getString(1);
                result = new Casa(idUsuario, nombre);

            }

        }
        catch (SQLException ex) {
            System.out.println("Error: en sentencia de selección de casa: \n" + ex.getMessage());
            ex.printStackTrace();
        }
        return result;
    }

}
