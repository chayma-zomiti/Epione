package services;

import java.util.List;

import entities.Appointment;
import entities.Reclamation;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoctorServiceImpl doctorServiceImpl = new DoctorServiceImpl();
		//doctorServiceImpl.consumeDoctorsfromJson();
		//DoctorServiceImpl appointementService= new DoctorServiceImpl();
	
		
		AppointementService appointementService = new AppointementService();
		
		
		appointementService.consumeAppointementsJson();
		
	}

}
