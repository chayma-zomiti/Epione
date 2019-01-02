package beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.Doc;
import entities.Reclamation;
import services.DoctorServiceImpl;
import services.ReclamationImpl;

@ManagedBean(name = "reclamationBean")
@SessionScoped
public class ServiceIIBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String lastName;
	private String name;
	static int recnumb = 1;
	private List<Reclamation> reclamations;
	@EJB
	ReclamationImpl reclamationService;
	@EJB
	DoctorServiceImpl doctorServiceImpl;
	
	@EJB
	ReclamationImpl reclamationImpl;

	public void addDoc() {
		Doc doc = new Doc();
		doc.setDoctorname("doc name");
		doc.setDoctorlastname("doc last name");
		doc.setSpecialite("Spec");

		doctorServiceImpl.ajouterDoc(doc);

	}

	public void SupprimeDoc() {

		reclamationImpl.deleteDocById(0);

	}

	public void addReclamation() {
		Reclamation e = new Reclamation();
		e.setDescription("reclam");
		reclamationImpl.ajouterReclamation(e);

	}

	public void removeReclamation() {

		reclamationImpl.deleteDocById(0);

	}

	
	
	
	public String logout() {

		return "/index.jsf";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Reclamation> getReclamations() {
		reclamations = reclamationService.getAllReclamation();
		return reclamations;
	}

	public void setReclamations(List<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}

	public ReclamationImpl getReclamationService() {
		return reclamationService;
	}

	public void setReclamationService(ReclamationImpl reclamationService) {
		this.reclamationService = reclamationService;
	}

}
