package Ejercicios;

public class ejercicio_09 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 50;
        for (int i = 0; i < n; ++i) {
            sum = sum + i;
        }
        System.out.println("La suma de los  " + n + " primeros números naturales es " + sum );
    }
}
