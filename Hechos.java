package SistemaExperto;

import java.util.Scanner;

public class Hechos {
    static Scanner scanner = new Scanner(System.in);
    public static double SismoDebil = 2;
    public static double SismoLigero = 3;
    public static double SismoLigeroFuerte = 4;
    public static double SismoModerado = 5;
    public static double SismoFuerte = 6;
    public static double SismoMuyFuerte = 7;
    public static double SismoViolento = 8;
    public static double ProfundidadPeligrosa = 50;
    public static double ProfundidadMedia = 150;
    public static double ProfundidadSegura = 500;
    public static void SueloPeligroso() {
        System.out.println("Ingresa un tipo de suelo");
        String suelo = scanner.nextLine();
        switch (suelo) {
            case "Arcilla":
                System.out.println("Si");
                return;
            case "Urbano":
                System.out.println("Si");
                return;
            case "Arenoso":
                System.out.println("Si");
                return;
            case "Piedra":
                System.out.println("No");
                return;
            case "PiedraVolcanica":
                System.out.println("No");
                return;
            case "VariosElementos":
                System.out.println("Si");
                return;
            default:
                System.out.println("No se encontro ese tipo de suelo");
        }
    }
    public static void ZonaSismicaRiesgosa() {
        System.out.println("Ingresa el nombre de Alcaldia");
        String Alcaldia = scanner.nextLine();
        switch (Alcaldia) {
            case "Azcapotzalco":
                System.out.println("No");
                return;
            case "Coyoacan":
                System.out.println("No");
                return;
            case "Cuajimalpa":
                System.out.println("No");
                return;
            case "Magdalena":
                System.out.println("No");
                return;
            case "MilpaAlta":
                System.out.println("No");
                return;
            case "AlvaroObregon":
                System.out.println("No");
                return;
            case "Tlalpan":
                System.out.println("No");
                return;
            case "Xochimilco":
                System.out.println("No");
                return;
            case "BenitoJuarez":
                System.out.println("No");
                return;
            case "MiguelHidalgo":
                System.out.println("No");
                return;
            case "GAM":
                System.out.println("Si");
                return;
            case "Iztacalco":
                System.out.println("Si");
                return;
            case "Iztapalapa":
                System.out.println("Si");
                return;
            case "Tlahuac":
                System.out.println("Si");
                return;
            case "Cuauhtemoc":
                System.out.println("Si");
                return;
            case "VenustianoCarranza":
                System.out.println("Si");
                return;
            default:
                System.out.println("No se encontro esa Alcaldia");
        }
    }
    public static void EsSismoDebil(){
        System.out.println("Ingresa una Magnitud");
        double magnitud = Double.parseDouble(scanner.nextLine());
        if (magnitud <= SismoDebil) {
            System.out.println("Si");
        } else System.out.println("No");
    }
    public static void  EsSismoLigero(){
        System.out.println("Ingresa una Magnitud");
        double magnitud = Double.parseDouble(scanner.nextLine());
        if (magnitud <= SismoLigero && magnitud > SismoDebil) {
            System.out.println("Si");
        } else System.out.println("No");
    }
    public static void EsSismoLigeroFuerte(){
        System.out.println("Ingresa una Magnitud");
        double magnitud = Double.parseDouble(scanner.nextLine());
        if (magnitud <= SismoLigeroFuerte && magnitud > SismoLigero) {
            System.out.println("Si");
        } else System.out.println("No");
    }
    public static void EsSismoModerado(){
        System.out.println("Ingresa una Magnitud");
        double magnitud = Double.parseDouble(scanner.nextLine());
        if (magnitud <= SismoModerado && magnitud > SismoLigeroFuerte) {
            System.out.println("Si");
        } else System.out.println("No");
    }
    public static void EsSismoFuerte(){
        System.out.println("Ingresa una Magnitud");
        double magnitud = Double.parseDouble(scanner.nextLine());
        if (magnitud <= SismoFuerte && magnitud > SismoModerado) {
            System.out.println("Si");
        } else System.out.println("No");
    }
    public static void EsSismoMuyFuerte(){
        System.out.println("Ingresa una Magnitud");
        double magnitud = Double.parseDouble(scanner.nextLine());
        if (magnitud <= SismoMuyFuerte && magnitud > SismoFuerte) {
            System.out.println("Si");
        } else System.out.println("No");
    }
    public static void EsSismoViolento(){
        System.out.println("Ingresa una Magnitud");
        double magnitud = Double.parseDouble(scanner.nextLine());
        if (magnitud <= SismoViolento && magnitud > SismoMuyFuerte || magnitud >= SismoViolento) {
            System.out.println("Si");
        } else System.out.println("No");
    }
    public static void EsSeguro(){
        System.out.println("Ingresa una Profundidad");
        double profundidad = Double.parseDouble(scanner.nextLine());
        if (profundidad >= ProfundidadSegura) {
            System.out.println("Si");
        } else System.out.println("No");
    }
    public static void EsMedia(){
        System.out.println("Ingresa una Profundidad");
        double profundidad = Double.parseDouble(scanner.nextLine());
        if (profundidad <= ProfundidadMedia && profundidad > ProfundidadPeligrosa) {
            System.out.println("Si");
        } else System.out.println("No");
    }
    public static void EsPeligroso(){
        System.out.println("Ingresa una Profundidad");
        double profundidad = Double.parseDouble(scanner.nextLine());
        if (profundidad <= ProfundidadPeligrosa) {
            System.out.println("Si");
        } else System.out.println("No");
    }
}
