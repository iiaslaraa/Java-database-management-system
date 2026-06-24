package testes.medico_paciente;

import persistencia.MedicoPacienteDAO;

public class MedicoPacienteGrava {

    public static void main(String[] args) throws Exception {
        System.out.println(MedicoPacienteDAO.grava("88888888888", "44444444444"));
    }
}