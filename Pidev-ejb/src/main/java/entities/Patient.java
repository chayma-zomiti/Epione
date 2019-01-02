package entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;


public class Patient extends User {
 	private String Allergies;
 	private String Profession;
 	private String SpecialReq;
    
    
   
	public String getAllergies() {
		return Allergies;
	}

	public void setAllergies(String allergies) {
		Allergies = allergies;
	}

	public String getProfession() {
		return Profession;
	}

	public void setProfession(String profession) {
		Profession = profession;
	}

	public String getSpecialReq() {
		return SpecialReq;
	}

	public void setSpecialReq(String specialReq) {
		SpecialReq = specialReq;
	}

	
	
    

}
