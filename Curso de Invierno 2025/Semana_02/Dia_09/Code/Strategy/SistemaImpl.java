package Strategy;

public class SistemaImpl implements ISistema {
    private CalculadoraImpuestos calculadora = new CalculadoraImpuestos();

    @Override
    public double calcularImpuestoPersonaNatural(double ingresos) {
        calculadora.establecerEstrategia(new ImpuestoPersonaNatural());
        return calculadora.calcular(ingresos);
    }

    @Override
    public double calcularImpuestoEmpresaPequeña(double ingresos) {
        calculadora.establecerEstrategia(new ImpuestoEmpresaPequeña());
        return calculadora.calcular(ingresos);
    }

    @Override
    public double calcularImpuestoGranCorporacion(double ingresos) {
        calculadora.establecerEstrategia(new ImpuestoGranCorporacion());
        return calculadora.calcular(ingresos);
    }

    @Override
    public String mostrarInfoEstrategia() {
        return calculadora.obtenerDescripcionEstrategia();
    }
}
