package database.dao;

import database.Conexion;
import java.sql.*;

public class DaoEmpleado extends Conexion {

    public Object[] getEmployeeByUsr(String usr, char[] psw) {
        conectar(); // Establece conexión con la base de datos
        Object[] employee = new Object[6]; // Arreglo para almacenar datos del empleado

        try {
            // Consulta SQL para obtener los datos del empleado
            sentenciaSQL = "SELECT ID_EMPLEADO, ID_PUESTO, PUESTO, NOMBRE, AP_PATERNO, AP_MATERNO " +
                           "FROM EMPLEADO " +
                           "JOIN PUESTO USING (ID_PUESTO) " +
                           "WHERE UPPER(USUARIO_EMPLEADO) = UPPER(?) " +
                           "AND UPPER(CONTRASENIA_EMPLEADO) = UPPER(?)";

            ps = conn.prepareStatement(sentenciaSQL);
            ps.setString(1, usr); // Establece el parámetro del usuario
            ps.setString(2, String.valueOf(psw)); // Establece el parámetro de la contraseña

            rs = ps.executeQuery();

            if (rs.next()) {
                // Verifica y asigna valores del resultado
                employee[0] = rs.getObject("ID_EMPLEADO");
                employee[1] = rs.getObject("ID_PUESTO");
                employee[2] = rs.getString("PUESTO");
                employee[3] = rs.getString("NOMBRE");
                employee[4] = rs.getString("AP_PATERNO");
                employee[5] = rs.getString("AP_MATERNO");
            } else {
                employee = null; // No se encontró ningún registro
            }
        } catch (SQLException ex) {
            System.out.println("Error SQL: " + ex.getSQLState());
            System.out.println("Mensaje: " + ex.getMessage());
            System.out.println("Consulta: " + sentenciaSQL);
            employee = null; // Devuelve nulo en caso de error
        } finally {
            desconectar(); // Cierra la conexión a la base de datos
        }
        return employee; // Retorna el arreglo con los datos o nulo
    }
}

