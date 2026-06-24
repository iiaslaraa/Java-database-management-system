package testes.medico_exame;

import java.util.List;
import modelo.MedicoExame;
import persistencia.MedicoExameDAO;

public class MedicoExameLeTodosBetween {

    public static void main(String[] args) throws Exception {

        List<MedicoExame> lista = MedicoExameDAO.leTodosBetween(1, 5);

        for (MedicoExame me : lista) {
            System.out.println(me);
        }
    }
}
