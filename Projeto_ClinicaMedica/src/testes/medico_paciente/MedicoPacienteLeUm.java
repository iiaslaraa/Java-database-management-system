package testes.medico_paciente;

import persistencia.MedicoPacienteDAO;

public class MedicoPacienteLeUm {

    public static void main(String[] args) throws Exception {
        System.out.println(MedicoPacienteDAO.leUm("88888888888", "44444444444"));
    }
}
