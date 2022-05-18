package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {

    private Integer id;
    private String nome;
    private String nomeMae;
    private String nomePai;
    private String dataNascimento;
    private String dataCadastro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataCadastro() {
        return setDataCadastro();
    }

    public String setDataCadastro() {
        String timeStamp = new SimpleDateFormat("dd.MM.yyyy").format(new Date());
        this.dataCadastro = timeStamp;
        return dataCadastro;
    }
}
