/*
 * Clase: ConfigDataBase.java
 * Fecha: 15/08/2013
 *
 * Desarrollador: Carlos Cortés Bazán
 * 
 * Descripción: Configuración para conectarse a la base de datos
 *
 */

package database;

public class ConfigDataBase {

    //AVISOS DB
    public static final String DB_CONTACT = "Contacte al proveedor.";
    public static String DB_NOCONECT = "No se pudo conectar a la base de datos. " + DB_CONTACT;
    public static String DB_NO_DB = "No se encuentra la base de datos. " + DB_CONTACT;
    public static String DB_DRIVERNO_REC = "No se reconoce el controlador. " + DB_CONTACT;
    public static String DB_NOINST_DRIVER = "No se puede crear una instancia del controlador JDBC. " + DB_CONTACT;
    public static String DB_NOACCESS_DRIVER = "No se permite el acceso a controlador JDBC. " + DB_CONTACT;
    public static String DB_T_ERROR = "Error de la base de datos.";
    public static String DB_CLOSECON_ERR = "No se puede cerrar la base de datos. " + DB_CONTACT;
    public static String DB_CLOSESTA_ERR = "No se puede cerrar el statement. " + DB_CONTACT;
    
    // Errores de transacción
    public static String DB_ERR_QUERY = "Error al consultar la base de datos. " + DB_CONTACT;
    public static String DB_ERR_INSERT = "Error al insertar en la base de datos. " + DB_CONTACT;
    public static String DB_ERR_UPDATE = "Error al modificar la base de datos. " + DB_CONTACT;
    public static String DB_ERR_DELATE = "Error al borrar en la base de datos. " + DB_CONTACT;
    
    // Configuración de la conexión
    public static String JDBC_DRIVER_ORACLE = "oracle.jdbc.driver.OracleDriver";
    public static String JDBC_PROTOCOL = "jdbc:oracle:thin:@localhost:1521/xepdb1";
    public static String JDBC_USER = "ltcgun";
    public static String JDBC_PSW = "mheealx";
}