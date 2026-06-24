package testes.medico_exame;

import persistencia.MedicoExameDAO;

public class MedicoExameAltera {

    public static void main(String[] args) throws Exception {
        System.out.println(MedicoExameDAO.altera(2, "88888888888", 1));
    }
}
