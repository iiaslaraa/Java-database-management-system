package modelo;
public class PacienteExame {
    private String pacienteCpfPaciente;
    private int exameIdExame;

    public String getPacienteCpfPaciente() {
        return pacienteCpfPaciente;
    }

    public void setPacienteCpfPaciente(String pacienteCpfPaciente) {
        this.pacienteCpfPaciente = pacienteCpfPaciente;
    }

    public int getExameIdExame() {
        return exameIdExame;
    }

    public void setExameIdExame(int exameIdExame) {
        this.exameIdExame = exameIdExame;
    }
    //CONSTRUTOR VAZIO
    public PacienteExame(){}

    public PacienteExame(String pacienteCpfPaciente, int exameIdExame) {
        this.pacienteCpfPaciente = pacienteCpfPaciente;
        this.exameIdExame = exameIdExame;
    }
    public String toString() {
        return "\n ________________________________" +
                "\n .......  PACIENTE EXAME ......." +
                "\n --------------------------------" +
                "\n CPF Paciente: " + getPacienteCpfPaciente() +
                "\n ID Exame: " + getExameIdExame();
    }
}