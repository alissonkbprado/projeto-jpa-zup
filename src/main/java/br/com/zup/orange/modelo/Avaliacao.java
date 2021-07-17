package br.com.zup.orange.modelo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private String respostaMentor;

    @OneToMany(mappedBy = "avaliacao", fetch = FetchType.LAZY)
    private List<Resposta> respostas;

    @OneToMany(mappedBy = "avaliacao", fetch = FetchType.LAZY)
    private List<CorrecaoRespostaAluno> correcaoRespostasAluno;

    public List<Resposta> getRespostas() {
        return respostas;
    }

    public void setRespostas(List<Resposta> respostas) {
        this.respostas = respostas;
    }

    public List<CorrecaoRespostaAluno> getCorrecaoRespostasAluno() {
        return correcaoRespostasAluno;
    }

    public void setCorrecaoRespostasAluno(List<CorrecaoRespostaAluno> correcaoRespostasAluno) {
        this.correcaoRespostasAluno = correcaoRespostasAluno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRespostaMentor() {
        return respostaMentor;
    }

    public void setRespostaMentor(String respostaMentor) {
        this.respostaMentor = respostaMentor;
    }
}
