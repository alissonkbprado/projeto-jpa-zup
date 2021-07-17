package br.com.zup.orange.teste;

import br.com.zup.orange.modelo.Aluno;
import br.com.zup.orange.modelo.Resposta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ConsultaAlunoERespostas {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("zup-jpa");
        EntityManager em = emf.createEntityManager();

        Aluno aluno = new Aluno();
        aluno.setId(1L);

        String jpql = "select a from Aluno a JOIN FETCH a.respostasList WHERE a = :pAluno";
//        @Query("SELECT p FROM Person p JOIN FETCH p.roles WHERE p.id = (:id)")

        TypedQuery<Aluno> query = em.createQuery(jpql, Aluno.class);
        query.setParameter("pAluno", aluno);
//        List<Aluno> resultList = query.getResultList();
        Aluno alunoResult = query.getSingleResult();

//        for(Aluno al: resultList){
//            System.out.println("Nome: " + al.getNome());
//            for (Resposta resposta :al.getRespostasList()) {
//                System.out.println("Respostas " + resposta.getDescricao());
//            }
//
//        }

        em.close();

        System.out.println("Aluno: " + alunoResult.getNome());

        for (Resposta res :alunoResult.getRespostasList()) {
            System.out.println("Resposta: " + res.getDescricao());
        }

    }
}
