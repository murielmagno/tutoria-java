package dao;

import config.DataBase;
import entities.Aluno;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    private Connection connection;

    public AlunoDAO(){
        this.connection = new DataBase().conect();
    }
    public void adicionarBanco(Aluno aluno){
        String sql = "INSERT INTO aluno(nome,nomeMae,nomePai,dataNascimento,dataCadastro) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getNomeMae());
            stmt.setString(3, aluno.getNomePai());
            stmt.setString(4, aluno.getDataNascimento());
            stmt.setString(5, aluno.getDataCadastro());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> selectListaAlunos(){
        String sql = "SELECT * FROM ALUNO";
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            return getStrings(stmt, rs);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> selectAlunoPorId(String idAluno){
        String sql = "SELECT * FROM ALUNO WHERE id = " + idAluno;
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            return getStrings(stmt, rs);
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private List<String> getStrings(Statement stmt, ResultSet rs) throws SQLException {
        List<String> list = new ArrayList<>();
        while (rs.next()){
            String id = String.valueOf(rs.getString("Id"));
            String nome = rs.getString("Nome");
            String nomeMae = rs.getString("nomemae");
            String nomePai = rs.getString("nomepai");
            String dataNascimento = rs.getString("datanascimento");
            String dataCadastro = rs.getString("datacadastro");
            list.add("Aluno{" +
                    "id=" + id +
                    ", nome='" + nome + '\'' +
                    ", nomeMae='" + nomeMae + '\'' +
                    ", nomePai='" + nomePai + '\'' +
                    ", dataNascimento='" + dataNascimento + '\'' +
                    ", dataCadastro='" + dataCadastro + '\'' +
                    '}');
        }
        stmt.close();
        return list;
    }
}
