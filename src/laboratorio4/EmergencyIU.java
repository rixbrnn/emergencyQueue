package laboratorio4;
import java.util.Scanner;

public class EmergencyIU {

	private Emergency emergency;
	Scanner sc = new Scanner(System.in);

	public EmergencyIU(Emergency emergency) {
		this.emergency = emergency;
	}

	public void printPatients() {
		System.out.println("Patients in the queue:");
		System.out.printf("\n%-20s   Age:\n","Name:");
		for (Patient patient : emergency.getPatients()) {
			System.out.printf("%-20s    %d\n", patient.getName(), patient.getAge());
		}
		System.out.println();
	}

	public void printVaccinated() {
		System.out.println("Patients vaccinated:");
		System.out.printf("\n%-20s   Age:\n","Name:");
		for (Patient patient : emergency.getVaccinated()) {
			System.out.printf("%-20s    %d\n", patient.getName(), patient.getAge());
		}
		System.out.println();
	}

	private boolean checkValidName(String name) {
		if (name.matches(".*\\d.*"))
			return false;
		if (name.length() < 3 || name.length()>20)
			return false;
		return true;
	}

	private boolean checkValidAge(String age) {
		if(!age.matches("-?\\d+(\\.\\d+)?"))
			return false;
		Double ageValue = Double.parseDouble(age);
		if (ageValue > 0 && ageValue < 110)
			return true;
		else
			return false;
	}

	public void addPatient() {
		Patient patient;
		String name = null;
		Integer age = null;

		System.out.println("Patient's name: ");
		while (name == null) {
			if (sc.hasNextLine()) {
				String nextName = sc.nextLine();
				if (!checkValidName(nextName))
					System.out.println("Insert a valid name!");
				else
					name = nextName;
			}
		}

		System.out.println("Patient's age: ");
		while (age == null) {
			String nextAge = sc.nextLine();
			if(!checkValidAge(nextAge))
				System.out.println("Insert a valid age!");
			else
				age = Integer.parseInt(nextAge);
		}

		patient = new Patient(name, age);
		emergency.addPatient(patient);
		System.out.println("Patient successfully added to the queue!");
	}

	public void callPatient() {
		if (emergency.removePatient())
			System.out.println("Next patient called successfully!");
		else
			System.out.println("The queue is empty!");
	}

	public void removePatient() {
		if(!emergency.getPatients().isEmpty()) {
			System.out.println("Insert the name to remove:");
			String name = sc.nextLine();
			while (!checkValidName(name)) {
					System.out.println("Patient not found!");
					return;
			}
			if (emergency.removeFromQueue(name))
				System.out.println("Patient successfully removed from queue!");
			else
				System.out.println("Patient not found!");
		}else
			System.out.println("The queue is empty!");
	}
}
