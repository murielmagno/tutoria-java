# Projeto de Java com JBDC

Esse projeto tem por finalidade exercitar conceitos de Java, Classes, Objetos e conexão com banco de dados com JDBC por meio da prática em programação. Ao final da realização das tarefas o aluno terá interagido com situações práticas no desenvolvimento de software com Java, tais como organização do projeto, tratamento de execeções, fluxo de dados numa aplicação, uso de bibliotecas e POO.

## Tarefa Prática
Nosso programa contém atualmente 4 funcionalidades com o seguinte menu:

```
1 - Cadastrar aluno
2 - Listar alunos
3 - Buscar aluno por id
4 - Sair
```
Onde as operações de "Cadastrar aluno", "Listar alunos" e "Buscar aluno por id" são performadas utilizando uma conexão com o banco de dados.

Sua tarefa é completar esse menu adicionando duas novas operações necessárias a concluir o CRUD para nossa aplicação. As novas operações são: **Atualizar aluno** e **Deletar aluno**. O programa deverá receber do usuário como entrada o **id** do aluno a ser atualizado ou deletado.

Sugestão de novo menu:
```
1 - Cadastrar aluno
2 - Listar alunos
3 - Buscar aluno por id
4 - Atualizar aluno
5 - Deletar aluno
6 - Sair
```

### Observações
- As funcionalidades novas devem seguir o mesmo **fluxo das operações** já implementadas. Ou seja, utilizar as camadas *Service* e *DAO* é mandatório.
- As operações devem ter **tratamento de exceção** para todos os casos. Em caso de erro, o programa deve apresentar a mensagem de erro adequada e retornar ao menu principal.
- Essa atividade prática vale até **2,0 pontos**.

### Bônus
O projeto contém ainda duas classes no pacote `entities` que não estão sendo utilizadas: **Turma** e **Professor**. Como tarefa bônus, modifique o programa para ser possível cadastrar essas duas entidades no banco de dados. O programa deve considerar as relações entre as classes na construção da solução. O banco de dados deverá ser modelado de acordo.

*Dica: uma turma contém 1 professor; uma turma contém 1 ou mais alunos.*

Essa tarefa bônus vale até **1,0 ponto extra**.

### Reference Documentation


