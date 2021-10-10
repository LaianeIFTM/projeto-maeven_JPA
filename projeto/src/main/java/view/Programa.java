package view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Categoria;
import model.Inscricao;
import model.Profissional;

public class Programa {
	public static void main(String[] args) {
		
		Categoria c1 = new Categoria(null, "workshop");
		Categoria c2 = new Categoria(null, "semana");
		Categoria c3 = new Categoria(null, "congresso");
		Categoria c4 = new Categoria(null, "simposio");
		
		//Inscricao i1 = new Inscricao(null, "2020/11/26",119);
		//Inscricao i2 = new Inscricao(null, "2020/11/26",119);
	   //Inscricao i3 = new Inscricao(null, "2020/11/26",119);
	 	
		Profissional p1 = new Profissional(null, "http://lattes.cnpq.br/0862517163998584", "Atualmente é aluna do curso de Ciências Biológicas com Ênfase em Ecologia e Recursos Naturais, no Centro Universitário Norte do Espírito Santo (CEUNES/UFES).");
		Profissional p2 = new Profissional(null, "http://lattes.cnpq.br/6255712955632877", "Possui graduação em Letras - Licenciatura dupla em Português e Alemão pela Universidade Federal de Minas Gerais - Brasil (2015), com um ano de intercâmbio acadêmico na Universität zu Köln - Alemanha (2013/14).");
		Profissional p3 = new Profissional(null, "http://lattes.cnpq.br/7439420384885456", "Atualmente é PROFESSORA da ESCOLA MUNICIPAL MAUD WILFER DIAS"); 	
			
		
				
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction() .begin() ; 		

		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.persist(c4);
		//em.persist(i1);
		//em.persist(i2);
		//em.persist(i3);
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		em.getTransaction(). commit ();
		
		
		
		
		
		
		em.close();
		emf.close();
	}
}
