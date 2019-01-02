package beans;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import entities.Appointment;
import entities.Doc;
import entities.Doctor;
import entities.Reclamation;
import entities.User;
import services.AppointementService;
import services.DoctorServiceImpl;


@ManagedBean(name = "dtDoctorsDoctolib")
@ViewScoped
public class ServiceBean {
	
	
	@EJB
	DoctorServiceImpl doctorServiceImpl;
	
	private List<Doctor> doctors;
	
	private List<Appointment> appointement;
	
	
	@EJB
	AppointementService appointementService;


	
	
	
	public List<Appointment> getAppointement() {
		appointement = appointementService.getAlldocs(); 
		return appointement;
	}
	public void setAppointement(List<Appointment> appointement) {
		this.appointement = appointement;
	}





	
	
	
	
	public List<Doctor> getDoctors() {
		
		return doctors;
	}
	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	
	
	
	
	
	






	private List<Doctor> doctors2 = new ArrayList<>();
	
	public List<Doctor> getDoctors2() {
		return doctors2;
	}

	public void setDoctors2(List<Doctor> doctors2) {
		this.doctors2 = doctors2;
	}

	public void addReclamation() {
		User doctor= new User();
		
		
	
	}
	
	
	
	@PostConstruct
	public void init() { 

		Doctor doctor = new Doctor(	"1","2018/12/3","chaima","angine");
		Doctor doctor2 = new Doctor(	"2","2018/11/4","pren2","grippe");
		Doctor doctor3 = new Doctor(	"3","2017/11/4","oree","grippe");
		
		
		
		doctors2.add(doctor);
		doctors2.add(doctor2);
		doctors2.add(doctor3);

		
		doctors = doctorServiceImpl.consumeDoctors();
		
		
	}

}
