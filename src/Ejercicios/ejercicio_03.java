package Ejercicios;

public class ejercicio_03 {
    public static void main(String[] args) {
        float a = 15;
        String resp = "";
        float y=(a/2);
        long iPart = (long) y;
        float fPart = y - iPart;
        if (fPart == 0) { resp = "Par";}
        else {resp = "Impar";}
        System.out.println(" y=" + y + "         iPart=" + iPart + "          fPart=" + fPart + "       El número " + a + " es " + resp);
    }
}
