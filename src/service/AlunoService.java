package service;

import dao.AlunoDAO;
import entities.Aluno;

import java.util.List;

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

    public List<String> listaAlunos(){
        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.selectListaAlunos();
    }

    public List<String> listaAlunoPorId(String id){
        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.selectAlunoPorId(id);
    }
}
