package testes.medico_paciente;

import java.util.List;
import modelo.MedicoPaciente;
import persistencia.MedicoPacienteDAO;

public class MedicoPacienteLeTodos {

    public static void main(String[] args) throws Exception {

        List<MedicoPaciente> lista = MedicoPacienteDAO.leTodos();

        for (MedicoPaciente mp : lista) {
            System.out.println(mp);
        }
    }
}
