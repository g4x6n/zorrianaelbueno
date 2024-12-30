package database.dao;

import database.Conexion;
import java.sql.*;

public class DaoEmpleado extends Conexion {
    
    // This method checks if the user exists in the database
    public boolean verifyUser(String usr, char psw[]) {
        // Use getEmployeeByUsr to validate the user
        Object[] employee = getEmployeeByUsr(usr, psw);
        
        // If employee[0] is not 0, it means the user was found in the database
        return employee != null && (int) employee[0] != 0;
    }
    
    public Object[] getEmployeeByUsr(String usr, char psw[]) {
        // Search for an employee by their username and password
        // Connect to the database
        conectar();
        
        // Variable to store the employee data
        Object employee[];
        
        try {       
            employee = new Object[6]; // Array size 6 to include all fields
            // SQL query with JOIN to get employee data
            sentenciaSQL  = "SELECT ID_EMPLEADO, ID_PUESTO, PUESTO, NOMBRE, AP_PATERNO, AP_MATERNO " +
                            "FROM EMPLEADO " +
                            "JOIN PUESTO USING (ID_PUESTO) " +
                            "WHERE UPPER(USUARIO_EMPLEADO) LIKE UPPER(?) " +
                            "AND UPPER(CONTRASENIA_EMPLEADO) LIKE UPPER(?)";
            ps = conn.prepareStatement(sentenciaSQL);
            // Set parameters for username and password
            ps.setString(1, usr);
            ps.setString(2, String.valueOf(psw));
            rs = ps.executeQuery();
            
            if (rs.next()) {
                // Retrieve employee data if found
                employee[0] = rs.getString("ID_EMPLEADO"); 
                employee[1] = rs.getString("ID_PUESTO");
                employee[2] = rs.getString("PUESTO"); 
                employee[3] = rs.getString("NOMBRE"); 
                employee[4] = rs.getString("AP_PATERNO"); 
                employee[5] = rs.getString("AP_MATERNO"); 
            } else {
                employee[0] = 0; // Return 0 if no employee found
            }
            return employee;
        } catch (SQLException ex) {
            System.out.println("Error " +  ex.getSQLState() + "\n\n" + ex.getMessage() + 
                    "\n\n" + sentenciaSQL + "\n\nLocation: getEmployeeByUsr");
            return null;
        } finally {
            desconectar(); // Close the database connection
        }
    }
}
