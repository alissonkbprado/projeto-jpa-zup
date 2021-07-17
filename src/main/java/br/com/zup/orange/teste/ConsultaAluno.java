package br.com.zup.orange.teste;

import br.com.zup.orange.modelo.Aluno;
import br.com.zup.orange.modelo.Resposta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ConsultaAluno {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("zup-jpa");
        EntityManager em = emf.createEntityManager();

        Aluno aluno = new Aluno();
        aluno.setId(4L);

        String jpql = "select a from Aluno a";

        TypedQuery<Aluno> query = em.createQuery(jpql, Aluno.class);
//        query.setParameter("pAluno", aluno);
        List<Aluno> resultList = query.getResultList();

        for(Aluno al: resultList){
            System.out.println("Nome: " + al.getNome());
            for (Resposta resposta :al.getRespostasList()) {
                System.out.println("Respostas " + resposta.getDescricao());
            }

        }

        em.close();
    }
}
