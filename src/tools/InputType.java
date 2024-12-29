/*
 * Clase: InputType.java
 * 
 * Descripción: Condiciones para la entrada de texto en un campo
 *
 */


package tools;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class InputType extends PlainDocument{
    int tipo;                           // Tipo de dato
    int tamanio;                        // Tamaño de la cadena    
    boolean conPunto = false;           // Para permitir o no punto en numericos
    boolean conEspacio = false;         // para permitir o no espacios
    boolean conMenos = false;           // Pra el signo de menos    
    // Tipos de datos permitidos
    public static int TIPO_HEXADEC = 0;
    public static int TIPO_SOLO_NUMEROS = 1;
    public static int TIPO_SOLO_LETRAS = 2;    

    public InputType(int tipo, int tamanio, boolean conEspacio){
        // Constructor para hexadecimal y solo letras
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.conEspacio = conEspacio;
    }
    
    public InputType(int tipo, int tamanio, boolean conEspacio, boolean conPunto){
        // Constructor para solo numeros
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.conPunto = conPunto;
        this.conEspacio = conEspacio;
    }
    
    public InputType(int tipo, int tamanio, boolean conEspacio, boolean conPunto, boolean conMenos){
        // Constructor para solo numeros, negativos
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.conPunto = conPunto;
        this.conEspacio = conEspacio;
        this.conMenos = conMenos;
    }

    @Override
    public void insertString(int offset, String str, AttributeSet a)throws BadLocationException{
        // Contador de puntos para permitir solo uno
        int contconPunto = 0;
        int contconMenos = 0;
        // Para seber si el caracter es valido
        boolean valid = true;
        
        // Caracteres insertados
        char[] insertChars = str.toCharArray();
        
        // Verifica el espacio
        if(insertChars.length + getLength() <= this.tamanio){
            if (!conEspacio){
                for(int i=0;i<insertChars.length;i++)
                    if (insertChars[i] == 32){
                        valid = false;
                        break;
                    }
            }
            // verifica si solo son letras
            if (tipo == TIPO_SOLO_LETRAS){
                for(int i=0;i<insertChars.length;i++){
                    if(!Character.isLetter(insertChars[i])){
                        valid = false;
                    }
                    break;
                }
            }
            // Verifica si solo son numeros
            else if (tipo == TIPO_SOLO_NUMEROS){
                for(int i=0;i<insertChars.length;i++){
                    if(!Character.isDigit(insertChars[i])){
                        valid = false;
                        if (conPunto)
                            if (insertChars[i] == '.' && contconPunto == 0){
                                valid = true;
                                contconPunto++;
                            }
                        if (conMenos)
                            if (insertChars[i] == '-' && contconMenos == 0){
                                valid = true;
                                contconMenos++;
                            }
                    }
                    break;
                }
            }
        }
        else
            valid = false;
        // Evalua el resultado
        if (valid)
            super.insertString(offset, str, a);
        else
            java.awt.Toolkit.getDefaultToolkit().beep();
    }
}