package br.com.zup.orange.teste;

import br.com.zup.orange.modelo.Aluno;
import br.com.zup.orange.modelo.Avaliacao;
import br.com.zup.orange.modelo.Resposta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CadastraResposta {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("zup-jpa");
        EntityManager em = emf.createEntityManager();

        Aluno aluno = new Aluno();
        aluno.setId(1L);

        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setId(1L);

        Resposta resposta = new Resposta();
        resposta.setDescricao("Resposta curso SQL");
        resposta.setAluno(aluno);
        resposta.setAvaliacao(avaliacao);
        Resposta resposta2 = new Resposta();
        resposta2.setDescricao("Resposta curso JPA");
        resposta2.setAluno(aluno);
        resposta2.setAvaliacao(avaliacao);

        em.getTransaction().begin();
        em.persist(resposta);
        em.persist(resposta2);
        em.getTransaction().commit();

        em.close();
    }
}
