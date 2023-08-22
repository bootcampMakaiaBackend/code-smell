package codesmellDuplicado;

public class Empleado {
    private double salarioBase;
    private double horasExtras;
    private double bonificaciones;
    private String tipoEmpleado;

    public double calcularSalarioTotal() {
        double salarioTotal = salarioBase;

        if(tipoEmpleado == "VINCULADO") {
            salarioTotal = calcularPagosExtras(salarioTotal,
                    0.25,
                    0.1);
        }

        if(tipoEmpleado == "PRESTADOR") {
            salarioTotal = calcularPagosExtras(salarioTotal,
                    0.1,
                    0.05);

        }
        return salarioTotal;
    }

    private double calcularPagosExtras(double salarioTotal,
                                       double porcentajeHoraExtra,
                                       double porcentajeBonificacion) {
        // Cálculo de horas extras
        if (horasExtras > 0) {
            salarioTotal += horasExtras * porcentajeHoraExtra;
        }
        // Cálculo de bonificaciones
        if (bonificaciones > 0) {
            salarioTotal += bonificaciones * porcentajeBonificacion;
        }
        return salarioTotal;
    }
}
