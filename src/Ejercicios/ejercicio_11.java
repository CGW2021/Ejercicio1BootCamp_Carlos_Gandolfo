package Ejercicios;

public class ejercicio_11 {
    public static void main(String[] args) {
        int fib = 1;
        int n = 10;
        for (int i = 2; i < (n + 1); ++i) {
            fib = fib + (i-1) + (i-2);
        }
        System.out.println("El Fibonacci de  " + n + " es " + fib);
    }
}
