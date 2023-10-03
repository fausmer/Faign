package Modelo;

import java.sql.Connection;

public class AlumnoBase {
    private Connection conexion;
    public AlumnoBase (){
        this.conexion=Conexion.conectar();
    }
    public void agregarAlumnoBase(AlumnoBase unAlumno) {

        try (Statement sentenciaInsert = conexion.createStatement()) {
            String insert = "insert into alumno (id_alumno, nombre) values(";
            insert += unAlumno.getIdAlumno() + ", ";
            //
            String nombreAlumno = unAlumno.getNombre().replace("'", "\'");
            insert += "'" + nombreAlumno + "'";
            insert += ")";
            sentenciaInsert.executeUpdate(insert);

        }
        catch (SQLException ex) {
            System.out.println("Error: en sentencia de creación del alumno: \n" + ex.getMessage());
            ex.printStackTrace();
        }

    }

    public Casa getIdAlumno(int idAlumno){
        Casa result = null;
        try (Statement sentenciaConsulta = conexion.createStatement()) {
            String query = "select nombre from Alumno where id_alumno = ";
            query += idAlumno;
            ResultSet rs = sentenciaConsulta.executeQuery(query);

            while (rs.next())
            {
                String nombre = rs.getString(1);
                result = new AlumnoBase(idAlumno, nombre);

            }

        }
        catch (SQLException ex) {
            System.out.println("Error: en sentencia de selección de alumno \n" + ex.getMessage());
            ex.printStackTrace();
        }
        return result;
    }

