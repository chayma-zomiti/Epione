package services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import entities.Doc;
import entities.Reclamation;






@Stateless
@LocalBean
public class ReclamationImpl implements ReclamationServiceRemote {

@PersistenceContext(unitName = "Pidev-ejb")
EntityManager em;

public int ajouterReclamation(Reclamation e) {
	//Role r=null;
	//Employe e=new Employe("Mohamed","Ali","Med@esprit.tn",r.ADMINISTRATEUR);
	MailApplication m = new MailApplication();
	  try {
		m.sendEmail("makremzitoun242@gmail.com","chayma.zomiti@esprit.tn","aa","hola");
	} catch (MessagingException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	em.persist(e);
	return 1;
}

public List<Reclamation> getAllReclamation() {
	Query query =em.createQuery("Select e from Reclamation e");
	
return query.getResultList();
}





public void deleteDocById(int DocId)
{
	Doc e = em.find(Doc.class,0);

	em.remove(e);
}
}
