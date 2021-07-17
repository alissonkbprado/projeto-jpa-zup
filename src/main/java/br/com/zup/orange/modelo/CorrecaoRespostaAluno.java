package br.com.zup.orange.modelo;

import javax.persistence.*;

@Entity
@Table(name = "correcao_resposta_aluno")
public class CorrecaoRespostaAluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer nota;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Avaliacao avaliacao;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }
}
