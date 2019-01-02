package services;

import java.util.List;

import javax.ejb.Remote;

import entities.Doctor;

@Remote
public interface DoctorServiceRemote {
	public List<Doctor> consumeDoctors();
	

}
