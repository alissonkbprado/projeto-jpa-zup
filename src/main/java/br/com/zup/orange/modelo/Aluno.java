package br.com.zup.orange.modelo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer idade;
    private String email;

    @OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY)
    private List<Resposta> respostasList;

    @OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY)
    private List<CorrecaoRespostaAluno> correcaoRespostasAlunoList;

    public List<Resposta> getRespostasList() {
        return respostasList;
    }

    public void setRespostasList(List<Resposta> respostasList) {
        this.respostasList = respostasList;
    }

    public List<CorrecaoRespostaAluno> getCorrecaoRespostasAlunoList() {
        return correcaoRespostasAlunoList;
    }

    public void setCorrecaoRespostasAlunoList(List<CorrecaoRespostaAluno> correcaoRespostasAlunoList) {
        this.correcaoRespostasAlunoList = correcaoRespostasAlunoList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
