package br.com.zup.orange.teste;

import br.com.zup.orange.modelo.Avaliacao;
import br.com.zup.orange.modelo.CorrecaoRespostaAluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ConsultaAvaliacao {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("zup-jpa");
        EntityManager em = emf.createEntityManager();

        String jpql = "select a from Avaliacao a";

        TypedQuery<Avaliacao> query = em.createQuery(jpql, Avaliacao.class);
//        query.setParameter("pAluno", aluno);
        List<Avaliacao> resultList = query.getResultList();

        for(Avaliacao al: resultList){
            System.out.println("Nome: " + al.getTitulo());
        }

        em.close();
    }
}
