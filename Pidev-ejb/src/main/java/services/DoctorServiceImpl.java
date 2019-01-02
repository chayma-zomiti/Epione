package services;

import java.util.ArrayList;  
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.mail.MessagingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import entities.Doc;
import entities.Appointment;
import entities.Doctor;
import entities.Reclamation;
import entities.User;
@Stateless
@LocalBean
public class DoctorServiceImpl implements DoctorServiceRemote{

	@PersistenceContext(unitName = "Pidev-ejb")
	EntityManager em;
	@EJB
	DoctorServiceRemote doctorServiceRemote;
	@Override
	public List<Doctor> consumeDoctors() {
		List<Doctor> doctors = new ArrayList<>();
		Doctor doctor = new Doctor(	"1","Dr Fabienne BENOIT ","ROLLAND","Médecin généraliste");
		Doctor doctor2 = new Doctor(	"2","Dr Thomas ","KLOTZ","Médecin généraliste");
		Doctor doctor3 = new Doctor(	"3","Dr Marc ","Breton","Médecin généraliste");
		Doctor doctor4 = new Doctor(	"4","Dr Désiré ","LEUNG","Médecin généraliste");
		Doctor doctor5 = new Doctor(	"5","Dr Michel  ","BAUX","Médecin généraliste");
		Doctor doctor6 = new Doctor(	"6","Dr Thierry  ","LAROCHE","Médecin généraliste");
		Doctor doctor7 = new Doctor(	"7","Dr Géraldine  ","LIEM-ZEISSLOFF","Médecin généraliste");

		
		
		doctors.add(doctor);
		doctors.add(doctor2);
		doctors.add(doctor3);
		doctors.add(doctor4);
		doctors.add(doctor5);
		doctors.add(doctor6);
		doctors.add(doctor7);
		
		
		
		
		return doctors;
		
	
		/*List<Doctor> doctors = new ArrayList<>();

			Client client = ClientBuilder.newClient();
			WebTarget target =client.target("http://localhost:21514/Admin/RecupDocJson");
			Response reponse = target.request().get();
			String value = reponse.readEntity(String.class);
			try {
				JSONArray jsonarray = new JSONArray(value);
				
				for (int i = 0; i < jsonarray.length(); i++) {
					JSONObject jsonobject = jsonarray.getJSONObject(i);
					Doctor doctor = new Doctor(
							jsonobject.getString("doctolibSPC").toString(),
							jsonobject.getString("doctolibAdress").toString(),
							null,
							null,
							null,
							null,
							null,
							null,
							null,
							null);
				    doctor.setFirstName(jsonobject.getString("doctolibName").toString());
				   
				    doctors.add(doctor);
				   
				}
				
				for (Doctor doctor : doctors) {
					System.out.println(doctor.getFirstName());
					
				}
				
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			reponse.close(); 
	
	*/
	}
	public List<Doctor> getAlldocs(){
		return null;
	}
	/*public List<Doctor> consumeDoctorsfromJson() {
		List<Doctor> doctors = new ArrayList<>();
			Client client = ClientBuilder.newClient();
			WebTarget target =client.target("http://localhost:21514/Admin/RecupDocJson");
			Response reponse = target.request().get();
			String value = reponse.readEntity(String.class);
			try {
				JSONArray jsonarray = new JSONArray(value);
				
				for (int i = 0; i < jsonarray.length(); i++) {
					JSONObject jsonobject = jsonarray.getJSONObject(i);
					
					Doctor doctor3 = new Doctor();
					doctor3.setFirstname(jsonobject.getString("doctolibName").toString());
					doctor3.setSpeciality(jsonobject.getString("doctolibSPC").toString());
					doctor3.setLastName(jsonobject.getString("doctolibAdress").toString());
					
				   
				    doctors.add(doctor3);
				   
				}
				
				for (Doctor doc : doctors) {
					
					System.out.println(" First Name "+doc.getFirstname() + "Last Name "+doc.getLastName() +"speciality "+doc.getSpeciality());
					
				}
				
				
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			reponse.close(); 
			
	return doctors;
	
	
	

}*/
	public int ajouterDoc(Doc e) {
		MailApplication m = new MailApplication();
		  try {
			m.sendEmail("makremzitoun242@gmail.com","hela.mejri2103@gmail.com","aa","hola");
		} catch (MessagingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		em.persist(e);
		return 1;
	}
	
	
	public void deleteReclById(int DocId)
	{
		Query query =em.createQuery("Select e from Reclamation WHERE DESCRIPTION = aaa");
		query.executeUpdate();
	}
}
