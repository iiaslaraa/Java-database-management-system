package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.MedicoExame;

public class MedicoExameDAO {

    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    public static List<MedicoExame> leTodos() throws Exception {

        List<MedicoExame> lista = new ArrayList<MedicoExame>();

        try {
            String sql = "SELECT * FROM medico_exame";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                MedicoExame me = new MedicoExame();

                me.setMedicoCpfMedico(rs.getString("cpfMedico"));
                me.setExameIdExame(rs.getInt("idExame"));

                lista.add(me);
            }

            rs.close();
            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    public static List<MedicoExame> leTodosLike(String cpfMedico) throws Exception {

        List<MedicoExame> lista = new ArrayList<MedicoExame>();

        try {
            String sql = "SELECT * FROM medico_exame WHERE cpfMedico LIKE ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, "%" + cpfMedico + "%");
            rs = st.executeQuery();

            while (rs.next()) {
                MedicoExame me = new MedicoExame();

                me.setMedicoCpfMedico(rs.getString("cpfMedico"));
                me.setExameIdExame(rs.getInt("idExame"));

                lista.add(me);
            }

            rs.close();
            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    public static List<MedicoExame> leTodosNotIn(int idExame) throws Exception {

        List<MedicoExame> lista = new ArrayList<MedicoExame>();

        try {
            String sql = "SELECT * FROM medico_exame WHERE idExame NOT IN (?)";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idExame);
            rs = st.executeQuery();

            while (rs.next()) {
                MedicoExame me = new MedicoExame();

                me.setMedicoCpfMedico(rs.getString("cpfMedico"));
                me.setExameIdExame(rs.getInt("idExame"));

                lista.add(me);
            }

            rs.close();
            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    public static List<MedicoExame> leTodosBetween(int inicio, int fim) throws Exception {

        List<MedicoExame> lista = new ArrayList<MedicoExame>();

        try {
            String sql = "SELECT * FROM medico_exame WHERE idExame BETWEEN ? AND ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, inicio);
            st.setInt(2, fim);
            rs = st.executeQuery();

            while (rs.next()) {
                MedicoExame me = new MedicoExame();

                me.setMedicoCpfMedico(rs.getString("cpfMedico"));
                me.setExameIdExame(rs.getInt("idExame"));

                lista.add(me);
            }

            rs.close();
            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    public static MedicoExame leUm(String cpfMedico, int idExame) throws Exception {

        MedicoExame me = new MedicoExame();

        try {
            String sql = "SELECT * FROM medico_exame WHERE cpfMedico = ? AND idExame = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpfMedico);
            st.setInt(2, idExame);
            rs = st.executeQuery();

            if (rs.next()) {
                me.setMedicoCpfMedico(rs.getString("cpfMedico"));
                me.setExameIdExame(rs.getInt("idExame"));
            }

            rs.close();
            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return me;
    }

    public static int grava(String cpfMedico, int idExame) throws Exception {

        int ret = 0;

        try {
            String sql = "INSERT INTO medico_exame (cpfMedico, idExame) VALUES (?, ?)";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpfMedico);
            st.setInt(2, idExame);

            ret = st.executeUpdate();

            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }

    public static int altera(int novoIdExame, String cpfMedico, int idExameAtual) throws Exception {

        int ret = 0;

        try {
            String sql = "UPDATE medico_exame SET idExame = ? WHERE cpfMedico = ? AND idExame = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, novoIdExame);
            st.setString(2, cpfMedico);
            st.setInt(3, idExameAtual);

            ret = st.executeUpdate();

            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }

    public static int exclui(String cpfMedico, int idExame) throws Exception {

        int ret = 0;

        try {
            String sql = "DELETE FROM medico_exame WHERE cpfMedico = ? AND idExame = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpfMedico);
            st.setInt(2, idExame);

            ret = st.executeUpdate();

            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }
}