package Ejercicios;

public class ejercicio_05 {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int c = 9;
        int mayor = a;


        if (a > b) { mayor = a;}
        else {mayor = b;}
        if (mayor < c) {mayor = c;}
        System.out.println(" mayor = " + mayor);
    }
}