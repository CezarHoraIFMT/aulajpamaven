package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.RegistroVisitantes;

public class Programa {

	public static void main(String[] args) {
		RegistroVisitantes p1 = new RegistroVisitantes(null, "Carlos da Silva", "111111111", "carlos@gmail.com");
		RegistroVisitantes p2 = new RegistroVisitantes(null, "Joaquim Torres", "222222222", "joaquim@gmail.com");
		RegistroVisitantes p3 = new RegistroVisitantes(null, "Ana Maria", "333333333", "anamar@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		
		
		System.out.println("Pronto!");

	}

}
