package service;

import dao.AlunoDAO;
import entities.Aluno;

import java.util.List;

public class AlunoService {

    private AlunoDAO alunoDAO = new AlunoDAO();
    public Aluno validaAluno(Aluno aluno){
        if(aluno.getNome() != null  && !aluno.getNome().isEmpty()
        && aluno.getNomeMae() != null  && !aluno.getNomeMae().isEmpty()
        && aluno.getDataNascimento() != null  && !aluno.getDataNascimento().isEmpty()){
            alunoDAO.adicionarBanco(aluno);
        }else {
            System.out.println("Verifique os dados cadastrados, o Nome do aluno, nome da mãe do aluno e data de nascimento são obrigatorios!!");
            System.out.println();
        }
        return null;
    }

    public List<String> listaAlunos(){
        return alunoDAO.selectListaAlunos();
    }

    public List<String> listaAlunoPorId(String id){
        return alunoDAO.selectAlunoPorId(id);
    }
}
