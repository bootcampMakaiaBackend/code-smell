package codesmellDuplicado;

public class Empleado {
    private double salarioBase;
    private double horasExtras;
    private double bonificaciones;
    private String tipoEmpleado;

    public double calcularSalarioTotal() {
        double salarioTotal = salarioBase;

        if(tipoEmpleado == "VINCULADO") {
            // Cálculo de horas extras
            if (horasExtras > 0) {
                salarioTotal += horasExtras * 25; // Tarifa por hora extra
            }
            // Cálculo de bonificaciones
            if (bonificaciones > 0) {
                salarioTotal += bonificaciones * 0.1; // 10% de bonificación
            }
        }

        if(tipoEmpleado == "PRESTADOR") {
            // Cálculo de horas extras
            if (horasExtras > 0) {
                salarioTotal += horasExtras * 1; // Tarifa por hora extra
            }
            // Cálculo de bonificaciones
            if (bonificaciones > 0) {
                salarioTotal += bonificaciones * 0.05; // 10% de bonificación
            }
        }


        return salarioTotal;
    }
}
