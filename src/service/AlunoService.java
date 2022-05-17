package service;

import dao.AlunoDAO;
import entities.Aluno;

public class AlunoService {

    public Aluno validaAluno(Aluno aluno){
        if(aluno.getNome() != null){
            AlunoDAO alunoDAO = new AlunoDAO();
            alunoDAO.adicionarBanco(aluno);
        }else {
            System.out.println("Aluno com nome vazio");
        }
        return null;
    }
}
