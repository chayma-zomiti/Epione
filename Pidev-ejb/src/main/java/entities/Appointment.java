package entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;


/**
 * The persistent class for the Appointments database table.
 * 
 */
@Entity
@Table(name="Appointments")
@NamedQuery(name="Appointment.findAll", query="SELECT a FROM Appointment a")
public class Appointment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AppointmentId")
	private int appointmentId;

	@Column(name="AppDate")
	private Date appDate;

	@Column(name="AppRate")
	private int appRate;

	@Column(name="DoctorId")
	private int doctorId;

	@Column(name="PatientId")
	private int patientId;

	@Column(name="StepId")
	private int stepId;

	@Column(name="VisitReason")
	private String visitReason;

	public Appointment() {
	}

	public int getAppointmentId() {
		return this.appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Date getAppDate() {
		return this.appDate;
	}

	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}

	public int getAppRate() {
		return this.appRate;
	}

	public void setAppRate(int appRate) {
		this.appRate = appRate;
	}

	public int getDoctorId() {
		return this.doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public int getPatientId() {
		return this.patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getStepId() {
		return this.stepId;
	}

	public void setStepId(int stepId) {
		this.stepId = stepId;
	}

	public String getVisitReason() {
		return this.visitReason;
	}

	public void setVisitReason(String visitReason) {
		this.visitReason = visitReason;
	}

	public Appointment(int appointmentId, Date appDate, int patientId, String visitReason) {
		
		this.appointmentId = appointmentId;
		this.appDate = appDate;
		this.patientId = patientId;
		this.visitReason = visitReason;
	}

}