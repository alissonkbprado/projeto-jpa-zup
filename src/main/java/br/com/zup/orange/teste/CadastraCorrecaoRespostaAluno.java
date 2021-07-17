package br.com.zup.orange.teste;

import br.com.zup.orange.modelo.Aluno;
import br.com.zup.orange.modelo.Avaliacao;
import br.com.zup.orange.modelo.CorrecaoRespostaAluno;
import br.com.zup.orange.modelo.Resposta;
import org.hibernate.internal.CoreLogging;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CadastraCorrecaoRespostaAluno {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("zup-jpa");
        EntityManager em = emf.createEntityManager();

        Aluno aluno = new Aluno();
        aluno.setId(1L);

        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setId(2L);

        CorrecaoRespostaAluno correcaoRespostaAluno = new CorrecaoRespostaAluno();
        correcaoRespostaAluno.setNota(8);
        correcaoRespostaAluno.setAluno(aluno);
        correcaoRespostaAluno.setAvaliacao(avaliacao);

        CorrecaoRespostaAluno correcaoRespostaAluno2 = new CorrecaoRespostaAluno();
        correcaoRespostaAluno2.setNota(6);
        correcaoRespostaAluno2.setAluno(aluno);
        correcaoRespostaAluno2.setAvaliacao(avaliacao);

        em.getTransaction().begin();
        em.persist(correcaoRespostaAluno);
        em.persist(correcaoRespostaAluno2);
        em.getTransaction().commit();

        em.close();
    }
}
