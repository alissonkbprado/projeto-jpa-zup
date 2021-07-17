package br.com.zup.orange.teste;

import br.com.zup.orange.modelo.CorrecaoRespostaAluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ConsultaAutocorrecaoPorId {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("zup-jpa");
        EntityManager em = emf.createEntityManager();

        String jpql = "select c from CorrecaoRespostaAluno c WHERE c.id = :pId";

        TypedQuery<CorrecaoRespostaAluno> query = em.createQuery(jpql, CorrecaoRespostaAluno.class);
        query.setParameter("pId", 1L);
        CorrecaoRespostaAluno resultado = query.getSingleResult();

        System.out.println("Nome Aluno: " + resultado.getAluno().getNome());


        em.close();
    }
}
