import entities.Aluno;
import service.AlunoService;

import java.sql.SQLException;

public class StartApp {

    public static void main (String[] args) throws SQLException {
        Aluno aluno = new Aluno();
        AlunoService alunoService = new AlunoService();
        alunoService.validaAluno(aluno);
    }
}
