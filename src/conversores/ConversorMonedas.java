package conversores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Inicio del programa
        System.out.println("Eliga su moneda");
        System.out.println("0-dolar 1-peso argentino 2-euro 3-libra esterlina 4-yen japones 5-won sur coreano");
        int monedaInicial = sc.nextInt();
        System.out.println("Indique la cantidad a convertir");
        float cantidadAConvertir = sc.nextFloat();
        System.out.println("Indique la monneda a la que convertir");
        int monedaElegida = sc.nextInt();
        convertir(monedaInicial, cantidadAConvertir, monedaElegida);
    }
    public static void convertir(int monedaInicial, float cantidadAConvertir, int monedaElegida) {
        DecimalFormat df = new DecimalFormat("#.##");
        // Array de las monedas
        float[] monedas = new float[6];
        float dolar = 265.03f;
        float peso_argentino = 1.0f;
        float euro = 297.54f;
        float libra_esterlina = 347.13f;
        float yen_japones = 1.91f;
        float won_sur_coreano = 0.21f;
        monedas[0] = dolar;
        monedas[1] = peso_argentino;
        monedas[2] = euro;
        monedas[3] = libra_esterlina;
        monedas[4] = yen_japones;
        monedas[5] = won_sur_coreano;

//      Conversion
        float resultado = monedas[monedaInicial] / monedas[monedaElegida] * cantidadAConvertir;

        System.out.println("El resultado es: " + df.format(resultado));
    }
}
// Tipo de cambio del 13 jul 2023