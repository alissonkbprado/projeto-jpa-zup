package br.com.zup.orange.teste;

import br.com.zup.orange.modelo.Avaliacao;
import br.com.zup.orange.modelo.Resposta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ConsultaResposta {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("zup-jpa");
        EntityManager em = emf.createEntityManager();

        String jpql = "select r from Resposta r";

        TypedQuery<Resposta> query = em.createQuery(jpql, Resposta.class);
//        query.setParameter("pAluno", aluno);
        List<Resposta> resultList = query.getResultList();

        for(Resposta res: resultList){
            System.out.println("Nome: " + res.getDescricao());
        }

        em.close();
    }
}
