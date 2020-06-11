package laboratorio4;


public class Main {
	public static void main(String[]args) {
	Emergency emergency = new Emergency();
	EmergencyIU emergencyIU = new EmergencyIU(emergency);
	
	Patient p1 = new Patient("Richard",10);
	Patient p2 = new Patient("Gabriel",50);
	Patient p3 = new Patient("Marcos",30);
	Patient p4 = new Patient("Antonio",40);
	Patient p5 = new Patient("Fabiano",35);
	
	emergency.addPatient(p1);
	emergency.addPatient(p2);
	emergency.addPatient(p3);
	emergency.addPatient(p4);
	emergency.addPatient(p5);
	
	emergencyIU.printPatients();
	
	emergency.removePatient();
	emergency.removePatient();
	emergency.removePatient();
	
	emergencyIU.printVaccinated();
	
	
	

}
}
