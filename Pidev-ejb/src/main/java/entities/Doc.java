package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Doc database table.
 * 
 */
@Entity
public class Doc implements Serializable {
	private static final long serialVersionUID = 1L;

	private String doctorlastname;

	private String doctorname;
	@Id
	private int id;

	private String specialite;

	public Doc() {
	}

	public String getDoctorlastname() {
		return this.doctorlastname;
	}

	public void setDoctorlastname(String doctorlastname) {
		this.doctorlastname = doctorlastname;
	}

	public String getDoctorname() {
		return this.doctorname;
	}

	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSpecialite() {
		return this.specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

}