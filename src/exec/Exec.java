package exec;

import entities.Aluno;
import excepitions.SairException;
import service.AlunoService;

import java.util.Scanner;

public class Exec {
    private Scanner entrada = new Scanner(System.in);
    private SairException sairException = new SairException();

    private AlunoService alunoService = new AlunoService();

    public void execPrograma() {
        menu();
    }

    private void menu() throws SairException{
        try {
            boolean continuar = true;
                while (continuar) {
                    System.out.println("Bem vindo, por favor digite uma opção valida: ");
                    System.out.println("1 - Cadastrar aluno");
                    System.out.println("2 - Listar alunos");
                    System.out.println("3 - Buscar aluno por id");
                    System.out.println("4 - Sair");
                    String resposta = entrada.nextLine();
                    if ("4".equalsIgnoreCase(resposta)) {
                        throw sairException;
                    } else if ("1".equalsIgnoreCase(resposta)){
                        adicionarAluno();
                    }else if ("2".equalsIgnoreCase(resposta)){
                        System.out.println("Lista de alunos: ");
                        listarAlunos();
                        System.out.println();
                    }else if ("3".equalsIgnoreCase(resposta)){
                        System.out.print("Informe o id do Aluno: ");
                        String idBusca = entrada.nextLine();
                        buscarPorId(idBusca);
                        System.out.println();
                    }
                }
        } catch (SairException e) {
            System.out.println("Saindo do programa...");
        } finally {
            entrada.close();
        }
    }

    private void adicionarAluno() {
        Aluno aluno = new Aluno();
        System.out.println("Informe o nome do Aluno");
        String resposta = entrada.nextLine();
        aluno.setNome(resposta);
        alunoService.validaAluno(aluno);
    }

    private void listarAlunos(){
        System.out.println(alunoService.listaAlunos());
    }

    private void buscarPorId(String idBusca){
        System.out.println(alunoService.listaAlunoPorId(idBusca));
    }
}
