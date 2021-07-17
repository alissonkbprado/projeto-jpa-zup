package br.com.zup.orange.teste;

import br.com.zup.orange.modelo.Aluno;
import br.com.zup.orange.modelo.Resposta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class CadastraAluno {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("zup-jpa");
        EntityManager em = emf.createEntityManager();

        Aluno aluno = new Aluno();
        aluno.setNome("Maria Prado");
        aluno.setIdade(40);
        aluno.setEmail("alisson.prado@zup.com");

        em.getTransaction().begin();
        em.persist(aluno);
        em.getTransaction().commit();

        em.close();
    }
}
