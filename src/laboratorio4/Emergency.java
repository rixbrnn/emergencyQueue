package laboratorio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Emergency {
	private PatientComparator comparator = new PatientComparator();
	private LinkedList<Patient> patients = new LinkedList<>();
	private LinkedList<Patient> vaccinated =  new LinkedList<>();
	
	
	public Queue<Patient> getPatients() {
		return patients;
	}

	public Queue<Patient> getVaccinated() {
		return vaccinated;
	}

	public void addPatient(Patient patient) {
		patients.add(patient);
		Collections.sort(patients, comparator);
	}
	
	public boolean removePatient() {
		if(patients.isEmpty())
			return false;
		vaccinated.addLast(patients.remove());
		return true;
	}		

}
