package laboratorio4;

public class EmergencyIU {
	
		private Emergency emergency;
		
		public EmergencyIU(Emergency emergency) {
			this.emergency=emergency;
		}
		
		public void printPatients() {
			System.out.println("Patients in the queue:");
			System.out.println("Name:   Age:");
			for(Patient patient: emergency.getPatients()) {
				System.out.printf("%s    %d\n",
						patient.getName(), patient.getAge());
			}
			System.out.println();
		}
		
		public void printVaccinated() {
			System.out.println("Patients vaccinated:");
			System.out.println("Name:   Age:");
			for(Patient patient: emergency.getVaccinated()) {
				System.out.printf("%s    %d\n",
						patient.getName(), patient.getAge());
			}
			System.out.println();
		}

}
