package services;

import java.util.List;

import javax.ejb.Local;

import entities.Doctor;

@Local
public interface DoctorServiceLocal {
	public List<Doctor> consumeDoctors();
}
