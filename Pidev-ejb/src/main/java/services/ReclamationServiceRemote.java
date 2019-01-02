package services;

import java.util.List;

import javax.ejb.Remote;

import entities.Reclamation;

@Remote
public interface ReclamationServiceRemote {
	public int ajouterReclamation(Reclamation e);
	public List<Reclamation> getAllReclamation();
}
