package dao;

import config.DataBase;
import entities.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
