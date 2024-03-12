package SistemaExperto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\tSistema experto\nDetermina la intensidad sismica en escala Richter a traves de su profundidad, amplitud y tiempo\n");

        Scanner m = new Scanner(System.in);

        System.out.println("¿Quieres hacer una consulta?");
        String menu = m.nextLine();
        if (menu.equals("si")) {
            System.out.println("Escribe tu consulta");
            String func = m.nextLine();
            switch (func) {
                case "EsSismoDebil":
                    Hechos.EsSismoDebil();
                    break;
                case "EsSismoLigero":
                    Hechos.EsSismoLigero();
                    break;
                case "EsSismoLigeroFuerte":
                    Hechos.EsSismoLigeroFuerte();
                    break;
                case "EsSismoModerado":
                    Hechos.EsSismoModerado();
                    break;
                case "EsSismoFuerte":
                    Hechos.EsSismoFuerte();
                    break;
                case "EsSismoMuyFuerte":
                    Hechos.EsSismoMuyFuerte();
                    break;
                case "EsSismoViolento":
                    Hechos.EsSismoViolento();
                    break;
                case "EsSeguro":
                    Hechos.EsSeguro();
                    break;
                case "EsMedia":
                    Hechos.EsMedia();
                    break;
                case "EsPeligroso":
                    Hechos.EsPeligroso();
                    break;
                case "ZonaSismicaRiesgosa":
                    Hechos.ZonaSismicaRiesgosa();
                    break;
                case "SueloPeligroso":
                    Hechos.SueloPeligroso();
                    break;
                case "SismoPeligroso":
                    Determinador.SismoPeligroso();
                    break;
                default:
                    System.out.println("No se encontro ese Hecho");
            }
            return;
        } else if (menu.equals("no")) {
        }

        System.out.println("\nIngresa la profundidad del epicentro en kilometros");
        String ProfundidadEpicentroKilometros = m.nextLine();

        System.out.println("Ingresa la Amplitud en milímetros");
        String AmplitudMilimetros = m.nextLine();

        System.out.println("Ingresa el tiempo entre ondas P y S en segundos");
        String DeltaTiempoSegundos = m.nextLine();

        String intensidadCalculada = Determinador.DeterminarIntensidad(AmplitudMilimetros, DeltaTiempoSegundos, "0.0");
        String profundidadCalculada = Determinador.DeterminarProfundidad(ProfundidadEpicentroKilometros);

        System.out.println(
                "La magnitud del sismo es de: " + CalcularMagnitud.Calcular(Double.parseDouble(AmplitudMilimetros), Double.parseDouble(DeltaTiempoSegundos)) +
                "\nEs un " + intensidadCalculada + " y " + profundidadCalculada
        );
    }
}
