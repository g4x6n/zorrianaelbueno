package database.dao;

import database.Conexion;
import java.sql.*;

public class DaoEmpleado extends Conexion {
    
    // Este método verifica si el usuario y la contraseña existen en la base de datos
    public boolean verifyUser(String usr, char psw[]) {
        // Usamos getEmployeeByUsr para validar el usuario
        Object[] employee = getEmployeeByUsr(usr, psw);
        
        // Si employee[0] no es 0, significa que el usuario fue encontrado en la base de datos
        return employee != null && employee[0] != null && !employee[0].equals(0);
    }
    
    // Este método obtiene los datos del empleado a partir de su usuario y contraseña
    public Object[] getEmployeeByUsr(String usr, char psw[]) {
        // Conectamos a la base de datos
        conectar();
        
        // Variable para almacenar los datos del empleado
        Object[] employee = new Object[6]; // Array de tamaño 6 para los campos

        // Convertir la contraseña char[] a String
        String password = String.valueOf(psw);
        
        try {       
            // Consulta SQL para obtener datos del empleado
            sentenciaSQL = "SELECT ID_EMPLEADO, ID_PUESTO, PUESTO, NOMBRE, AP_PATERNO, AP_MATERNO " +
                            "FROM EMPLEADO " +
                            "JOIN PUESTO USING (ID_PUESTO) " +
                            "WHERE UPPER(USUARIO_EMPLEADO) = UPPER(?) " +
                            "AND UPPER(CONTRASENIA_EMPLEADO) = UPPER(?)";
            ps = conn.prepareStatement(sentenciaSQL);
            // Asignar parámetros para el usuario y la contraseña
            ps.setString(1, usr);
            ps.setString(2, password);
            rs = ps.executeQuery();
            
            // Verificar si se encontró el empleado
            if (rs.next()) {
                employee[0] = rs.getString("ID_EMPLEADO"); // ID del empleado
                employee[1] = rs.getString("ID_PUESTO"); // ID del puesto
                employee[2] = rs.getString("PUESTO"); // Nombre del puesto
                employee[3] = rs.getString("NOMBRE"); // Nombre del empleado
                employee[4] = rs.getString("AP_PATERNO"); // Apellido paterno
                employee[5] = rs.getString("AP_MATERNO"); // Apellido materno
            } else {
                employee[0] = null; // Si no se encuentra el usuario, devolver null
            }
            return employee;
        } catch (SQLException ex) {
            System.out.println("Error: " +  ex.getSQLState() + "\n\n" + ex.getMessage() + 
                    "\n\n" + sentenciaSQL + "\n\nLocation: getEmployeeByUsr");
            return null;
        } finally {
            desconectar(); // Cerramos la conexión a la base de datos
        }
    }
}
