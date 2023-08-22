package codeSmellParametros;

public class Doctor {
    private String nombreDoctor;
    private String apellidoDoctor;
    private String especialidad;

    public Doctor(String nombreDoctor, String apellidoDoctor, String especialidad) {
        this.nombreDoctor = nombreDoctor;
        this.apellidoDoctor = apellidoDoctor;
        this.especialidad = especialidad;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public String getApellidoDoctor() {
        return apellidoDoctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}
