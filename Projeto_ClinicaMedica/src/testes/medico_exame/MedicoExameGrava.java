package testes.medico_exame;

import persistencia.MedicoExameDAO;

public class MedicoExameGrava {

    public static void main(String[] args) throws Exception {
        System.out.println(MedicoExameDAO.grava("88888888888", 1));
    }
}