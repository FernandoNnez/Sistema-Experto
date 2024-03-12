package SistemaExperto;

import java.util.Scanner;

public class Determinador {
    public static String DeterminarIntensidad(String Amplitud, String Delta, String Magnitud){
        Double intensidad;
        if (Double.parseDouble(Magnitud) == 0.0){
            intensidad = CalcularMagnitud.Calcular(Double.parseDouble(Amplitud),Double.parseDouble(Delta));
        } else {
            intensidad = Double.parseDouble(Magnitud);
        }

        String intensidadDeterminada;

        if (intensidad <= Hechos.SismoDebil) {
            intensidadDeterminada = "sismo de intensidad Débil";
            return intensidadDeterminada;
        }
        if (intensidad <= Hechos.SismoLigero) {
            intensidadDeterminada = "sismo de intensidad Ligera";
            return intensidadDeterminada;
        }
        if (intensidad <= Hechos.SismoLigeroFuerte) {
            intensidadDeterminada = "sismo de intensidad Ligera Fuerte";
            return intensidadDeterminada;
        }
        if (intensidad <= Hechos.SismoModerado) {
            intensidadDeterminada = "sismo de intensidad Moderada";
            return intensidadDeterminada;
        }
        if (intensidad <= Hechos.SismoFuerte) {
            intensidadDeterminada = "sismo de intensidad Fuerte";
            return intensidadDeterminada;
        }
        if (intensidad <= Hechos.SismoMuyFuerte) {
            intensidadDeterminada = "sismo de intensidad Muy Fuerte";
            return intensidadDeterminada;
        }
        if (intensidad < Hechos.SismoViolento) {
            intensidadDeterminada = "sismo de intensidad Violenta";
            return intensidadDeterminada;
        }
        if (intensidad >= Hechos.SismoViolento) {
            intensidadDeterminada = "sismo de intensidad Severa";
            return intensidadDeterminada;
        }
        return "Intensidad Determinada";
    }

    public static String DeterminarProfundidad(String Profundidad){
        int profundidadKm = Integer.parseInt(Profundidad);
        String profundidadDeterminada;

        if (profundidadKm <= 10) {
            profundidadDeterminada = "el sismo se percibirá demasiado";
            return profundidadDeterminada;
        }
        if (profundidadKm <= 20) {
            profundidadDeterminada = "el sismo se percibirá mucho";
            return profundidadDeterminada;
        }
        if (profundidadKm <= 40) {
            profundidadDeterminada = "el sismo será perceptible";
            return profundidadDeterminada;
        }
        if (profundidadKm <= 60) {
            profundidadDeterminada = "el sismo se percibirá";
            return profundidadDeterminada;
        }
        if (profundidadKm <= 80) {
            profundidadDeterminada = "el sismo se percibirá poco";
            return profundidadDeterminada;
        }
        if (profundidadKm <= 100) {
            profundidadDeterminada = "el sismo se percibirá leve";
            return profundidadDeterminada;
        }
        if (profundidadKm > 100) {
            profundidadDeterminada = "el sismo puede no se percibirse";
            return profundidadDeterminada;
        }
        return "Profundidad Determinada";
    }
    static Scanner scanner = new Scanner(System.in);
    public static void SismoPeligroso(){
        System.out.println("Ingresa una magnitud");
        String magnitud = scanner.nextLine();
        System.out.println("Ingresa una profundidad");
        String profundidad = scanner.nextLine();
        System.out.println("Con los datos, se sabe que " + DeterminarProfundidad(profundidad) + " y " + "es un " + DeterminarIntensidad("0.0", "0.0", magnitud));
    }
}
