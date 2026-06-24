package testes.medico_exame;

import java.util.List;
import modelo.MedicoExame;
import persistencia.MedicoExameDAO;

public class MedicoExameLeTodosLike {

    public static void main(String[] args) throws Exception {

        List<MedicoExame> lista = MedicoExameDAO.leTodosLike("888");

        for (MedicoExame me : lista) {
            System.out.println(me);
        }
    }
}