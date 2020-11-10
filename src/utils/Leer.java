package utils;

import java.util.Scanner;

public class Leer {

    public static Scanner sc = new Scanner(System.in);

    public static String cadena() {
        return sc.nextLine();
    }

    public static int entero() {
        return Integer.valueOf(cadena());
    }

    public static double decimal() {
        return Double.valueOf(cadena());
    }

    public static char letra() {
        return cadena().charAt(0);
    }
}