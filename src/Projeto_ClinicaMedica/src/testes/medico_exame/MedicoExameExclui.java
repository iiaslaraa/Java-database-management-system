package testes.medico_exame;

import persistencia.MedicoExameDAO;

public class MedicoExameExclui {

    public static void main(String[] args) throws Exception {
        System.out.println(MedicoExameDAO.exclui("88888888888", 2));
    }
}
