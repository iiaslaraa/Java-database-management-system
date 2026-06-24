package testes.medico_exame;

import persistencia.MedicoExameDAO;

public class MedicoExameLeUm {

    public static void main(String[] args) throws Exception {
        System.out.println(MedicoExameDAO.leUm("88888888888", 1));
    }
}