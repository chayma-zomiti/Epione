package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Analytics")
@NamedQuery(name="Analytics.findAll", query="SELECT u FROM Analytics u")
public class Analytics implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="StatId")
	private int StatId;
	
	@Column(name="StatDate")
	private int StatDate;

	@Column(name="NbPatients")
	private int NbPatients;
	
	@Column(name="CancelingRate")
	private float CancelingRate;
	

	
	@Column(name="DoctorId")
	private int DoctorId;

	public int getStatId() {
		return StatId;
	}

	public void setStatId(int statId) {
		StatId = statId;
	}

	public int getStatDate() {
		return StatDate;
	}

	public void setStatDate(int statDate) {
		StatDate = statDate;
	}

	public int getNbPatients() {
		return NbPatients;
	}

	public void setNbPatients(int nbPatients) {
		NbPatients = nbPatients;
	}

	public float getCancelingRate() {
		return CancelingRate;
	}

	public void setCancelingRate(float cancelingRate) {
		CancelingRate = cancelingRate;
	}

	
	public int getDoctorId() {
		return DoctorId;
	}

	public void setDoctorId(int doctorId) {
		DoctorId = doctorId;
	}

	public Analytics(int statId, int statDate, int nbPatients, float cancelingRate, 
			int doctorId) {
		
		StatId = statId;
		StatDate = statDate;
		NbPatients = nbPatients;
		CancelingRate = cancelingRate;
		
		DoctorId = doctorId;
	}

	public Analytics() {
		
	}
	
	
}
