package testes.medico_exame;

import java.util.List;
import modelo.MedicoExame;
import persistencia.MedicoExameDAO;

public class MedicoExameLeTodosNotIn {

    public static void main(String[] args) throws Exception {

        List<MedicoExame> lista = MedicoExameDAO.leTodosNotIn(4);

        for (MedicoExame me : lista) {
            System.out.println(me);
        }
    }
}
