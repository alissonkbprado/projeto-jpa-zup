package br.com.zup.orange.teste;

import br.com.zup.orange.modelo.CorrecaoRespostaAluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ConsultaAutocorrecao {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("zup-jpa");
        EntityManager em = emf.createEntityManager();

        String jpql = "select c from CorrecaoRespostaAluno c";

        TypedQuery<CorrecaoRespostaAluno> query = em.createQuery(jpql, CorrecaoRespostaAluno.class);
//        query.setParameter("pAluno", aluno);
        List<CorrecaoRespostaAluno> resultList = query.getResultList();

        for(CorrecaoRespostaAluno al: resultList){
            System.out.println("Nota: " + al.getNota());
            System.out.println("Nome Aluno" + al.getAluno().getNome());
        }

        em.close();
    }
}
