package br.com.zup.orange.teste;

import br.com.zup.orange.modelo.Aluno;
import br.com.zup.orange.modelo.Avaliacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CadastraAvaliacao {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("zup-jpa");
        EntityManager em = emf.createEntityManager();

        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setTitulo("Curso SQL");

        Avaliacao avaliacao2 = new Avaliacao();
        avaliacao2.setTitulo("Curso JPA");

        em.getTransaction().begin();
        em.persist(avaliacao);
        em.persist(avaliacao2);
        em.getTransaction().commit();

        em.close();
    }
}

