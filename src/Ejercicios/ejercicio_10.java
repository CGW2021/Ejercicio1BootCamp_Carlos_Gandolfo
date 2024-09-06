package Ejercicios;

public class ejercicio_10 {
    public static void main(String[] args) {
        int fact = 1;
        int n = 6;
        for (int i = 1; i < (n + 1); ++i) {
            fact = fact * i;
        }
        System.out.println("El Factorial de  " + n + " es " + fact);
    }
}
