package testes.medico_paciente;

import java.util.List;
import modelo.MedicoPaciente;
import persistencia.MedicoPacienteDAO;

public class MedicoPacienteLeTodosNotIn {

    public static void main(String[] args) throws Exception {

        List<MedicoPaciente> lista =
                MedicoPacienteDAO.leTodosNotIn("44444444444");

        for (MedicoPaciente mp : lista) {
            System.out.println(mp);
        }
    }
}
