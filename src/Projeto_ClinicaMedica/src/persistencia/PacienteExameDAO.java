package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.PacienteExame;

public class PacienteExameDAO {

    protected static Connection connection;
    protected static PreparedStatement st;
    protected static ResultSet rs;

    public static List<PacienteExame> leTodos() throws Exception {

        List<PacienteExame> lista = new ArrayList<PacienteExame>();

        try {
            String sql = "SELECT * FROM paciente_exame";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();

            while (rs.next()) {
                PacienteExame pe = new PacienteExame();

                pe.setPacienteCpfPaciente(rs.getString("cpfPaciente"));
                pe.setExameIdExame(rs.getInt("idExame"));

                lista.add(pe);
            }

            rs.close();
            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    public static List<PacienteExame> leTodosLike(String cpf) throws Exception {

        List<PacienteExame> lista = new ArrayList<PacienteExame>();

        try {
            String sql = "SELECT * FROM paciente_exame WHERE cpfPaciente LIKE ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, "%" + cpf + "%");
            rs = st.executeQuery();

            while (rs.next()) {
                PacienteExame pe = new PacienteExame();

                pe.setPacienteCpfPaciente(rs.getString("cpfPaciente"));
                pe.setExameIdExame(rs.getInt("idExame"));

                lista.add(pe);
            }

            rs.close();
            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    public static List<PacienteExame> leTodosNotIn(int idExame) throws Exception {

        List<PacienteExame> lista = new ArrayList<PacienteExame>();

        try {
            String sql = "SELECT * FROM paciente_exame WHERE idExame NOT IN (?)";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, idExame);
            rs = st.executeQuery();

            while (rs.next()) {
                PacienteExame pe = new PacienteExame();

                pe.setPacienteCpfPaciente(rs.getString("cpfPaciente"));
                pe.setExameIdExame(rs.getInt("idExame"));

                lista.add(pe);
            }

            rs.close();
            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    public static List<PacienteExame> leTodosBetween(int inicio, int fim) throws Exception {

        List<PacienteExame> lista = new ArrayList<PacienteExame>();

        try {
            String sql = "SELECT * FROM paciente_exame WHERE idExame BETWEEN ? AND ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, inicio);
            st.setInt(2, fim);
            rs = st.executeQuery();

            while (rs.next()) {
                PacienteExame pe = new PacienteExame();

                pe.setPacienteCpfPaciente(rs.getString("cpfPaciente"));
                pe.setExameIdExame(rs.getInt("idExame"));

                lista.add(pe);
            }

            rs.close();
            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    public static PacienteExame leUm(String cpfPaciente, int idExame) throws Exception {

        PacienteExame pe = new PacienteExame();

        try {
            String sql = "SELECT * FROM paciente_exame WHERE cpfPaciente = ? AND idExame = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpfPaciente);
            st.setInt(2, idExame);
            rs = st.executeQuery();

            if (rs.next()) {
                pe.setPacienteCpfPaciente(rs.getString("cpfPaciente"));
                pe.setExameIdExame(rs.getInt("idExame"));
            }

            rs.close();
            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return pe;
    }

    public static int grava(String cpfPaciente, int idExame) throws Exception {

        int ret = 0;

        try {
            String sql = "INSERT INTO paciente_exame (cpfPaciente, idExame) VALUES (?, ?)";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpfPaciente);
            st.setInt(2, idExame);

            ret = st.executeUpdate();

            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }

    public static int altera(int novoIdExame, String cpfPaciente, int idExameAtual) throws Exception {

        int ret = 0;

        try {
            String sql = "UPDATE paciente_exame SET idExame = ? WHERE cpfPaciente = ? AND idExame = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setInt(1, novoIdExame);
            st.setString(2, cpfPaciente);
            st.setInt(3, idExameAtual);

            ret = st.executeUpdate();

            st.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return ret;
    }

    public static int exclui(String cpfPaciente, int idExame) throws Exception {

        int ret = 0;

        try {
            String sql = "DELETE FROM paciente_exame WHERE cpfPaciente = ? AND idExame = ?";

            connection = GerenteDeConexao.getConnection();
            st = connection.prepareStatement(sql);
            st.setString(1, cpfPaciente);
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