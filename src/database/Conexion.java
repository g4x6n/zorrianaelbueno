/*
 * Clase: Conexion.java
 * Fecha: 15/08/2013
 *
 * Desarrollador: Carlos Cortés Bazán
 * 
 * Descripción: Realiza la conexión a la base de datos
 *
 */

package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class Conexion {
    public Connection conn = null;
    public ArrayList<Statement> statements;
    public Statement s;
    public String sentenciaSQL;
    public ResultSet rs;
    public PreparedStatement ps;
    public CallableStatement cstmt;
    
    // Conecta a la base de datos del sistema y la crea
    public void conectar (){
        // Lee los controladores
        loadDriver();
        conn = null;
        // Lista de sentencias
        statements = new ArrayList();
        try{
            // Propiedades de la conexión
            Properties props = new Properties();
            props.put("user", ConfigDataBase.JDBC_USER);
            props.put("password", ConfigDataBase.JDBC_PSW);
            
            // Obtiene la conexión
            conn = DriverManager.getConnection(ConfigDataBase.JDBC_PROTOCOL, props);
            conn.setAutoCommit(true);
            // Crea la sentencia
            s = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            statements.add(s);
        }
        catch (SQLException sqle){
            System.out.println(ConfigDataBase.DB_T_ERROR +  sqle.getSQLState() + 
                    ConfigDataBase.DB_NOCONECT);
            s = null;
        }
    }
    
    // Lee los controladores de Oracle
    private void loadDriver(){
        try {
            Class.forName(ConfigDataBase.JDBC_DRIVER_ORACLE).newInstance();
        } 
        catch (ClassNotFoundException cnfe) {
            System.out.println(ConfigDataBase.DB_T_ERROR + ConfigDataBase.DB_DRIVERNO_REC);
        } 
        catch (InstantiationException ie) {
            System.out.println(ConfigDataBase.DB_T_ERROR + ConfigDataBase.DB_NOINST_DRIVER);
        } 
        catch (IllegalAccessException iae) {
            System.out.println(ConfigDataBase.DB_T_ERROR + ConfigDataBase.DB_NOACCESS_DRIVER);
        }
    }
    
    // Desconecta la base de datos
    public void desconectar (){
        if (statements != null) 
            statements.clear();
        try{
            if (s != null)
                s.close();
            if (conn != null) 
                conn.close();
        }
        catch (SQLException sqle) {
            System.out.println(ConfigDataBase.DB_T_ERROR + sqle.getSQLState() +
                    ConfigDataBase.DB_CLOSECON_ERR + " " + sqle.getMessage());
        }
    }    
}