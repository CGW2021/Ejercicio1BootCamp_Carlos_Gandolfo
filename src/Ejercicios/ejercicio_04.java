package Ejercicios;

public class ejercicio_04 {
    public static void main(String[] args) {
        int a = 29; // Inicializamos la variable a

        if (esPrimo(a)) {
            System.out.println(a + " es un número primo.");
        } else {
            System.out.println(a + " no es un número primo.");
        }
    }

    // Método que verifica si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si es divisible por cualquier número, no es primo
            }
        }
        return true; // Si no es divisible por ningún número, es primo
    }
}




