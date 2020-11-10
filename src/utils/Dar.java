

package utils;

public class Dar {
    
    public static String f10(String cadena) {
        
        if (cadena.length() >= 10) {
            return cadena.substring(0, 10) + "...\t";
        } else if (cadena.length() >= 7) {
            return cadena + "\t\t";
        } else {
            return cadena;
        }
    }
    
}
