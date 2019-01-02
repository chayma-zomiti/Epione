package services;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import entities.Appointment;
import entities.Doctor;
import entities.Reclamation;

@Stateless
@LocalBean
public class AppointementService {
	@PersistenceContext
	EntityManager em;
	
	public int ajouterProject(Appointment p) {
		em.persist(p);
		/*Client client = ClientBuilder.newClient();
		WebTarget target =client.target("http://localhost:21514/Appointment/CreateJson");
		Invocation.Builder invocationBuilder=target.request(MediaType.APPLICATION_JSON);
		//Response reponse = target.request().get();
		Response response =invocationBuilder.post(Entity.entity(p, MediaType.APPLICATION_JSON));
		System.out.println("aaaaa");
		System.out.println(response.readEntity(String.class));*/
		return 0;
	}
	public List<Appointment> getAllProjects() {
		List<Appointment> emp = em.createQuery("Select e from Appointments e", Appointment.class).getResultList();
		for (Appointment appointment : emp) {
			System.out.println(appointment.getAppointmentId());
		}
		return emp;
		}
	public int ajouterReclamation(Reclamation p) {
		System.out.println("hahaha");
		em.persist(p);
		return p.getId();
		
		
	}

	public List<Appointment> consumeAppointementsJson() {
	 
			List<Appointment> appointments = new ArrayList<>();
			
			Client client = ClientBuilder.newClient();
			WebTarget target =client.target("http://localhost:21514/Appointment/GetAppJson");
			Response reponse = target.request().get();
			String value = reponse.readEntity(String.class);
			
				
		return appointments;
	}
	public List<Appointment> getAlldocs(){
		return null;
	}
}
