package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

public class Doctor {
	
	
	private String number;
    private String firstname;
    private String lastName;
    private String speciality;
    
    public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/*@OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
 	private List<DayOff> dayOffs = new ArrayList<>();
    
    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
 	private List<Analytics> analytics = new ArrayList<>();
    
    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
 	private List<VisitReason> visitReasons = new ArrayList<>();
    
    
    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
 	private List<Message> messages = new ArrayList<>();
    
    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
 	private List<Appointment> appointments = new ArrayList<>();
    
    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
 	private List<Treatment> treatments = new ArrayList<>();
    
    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
 	private List<Event> events = new ArrayList<>();

	*/



	

	

	public Doctor(String number, String firstname, String lastName, String speciality) {
		super();
		this.number = number;
		this.firstname = firstname;
		this.lastName = lastName;
		this.speciality = speciality;
	}

	public String getnumber() {
		return number;
	}

	public void setId(String number) {
		this.number = number;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public Doctor() {
		super();
	}
    
    
}
