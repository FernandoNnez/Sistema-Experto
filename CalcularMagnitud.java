package SistemaExperto;

public class CalcularMagnitud {
    public static double Calcular(double Amplitud, double Delta){
        double oa = Math.log10(Amplitud) + 3*Math.log10(8*Delta)-2.92;
        return Math.round(oa * 10.0) /10.0;
    }
}
