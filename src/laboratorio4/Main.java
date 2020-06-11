package laboratorio4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Emergency emergency = new Emergency();
		EmergencyIU emergencyIU = new EmergencyIU(emergency);

		Scanner sc = new Scanner(System.in);
		int option = -1;
		do {
			System.out.println("\nOPTIONS:");
			System.out.println("1 - Add patient to queue:");
			System.out.println("2 - Call next patient:");
			System.out.println("3 - Remove from queue:");
			System.out.println("4 - See list of vaccinateds:");
			System.out.println("5 - See current queue:");
			System.out.println("0 - Close:");

			option = sc.nextInt();

			if (option == 1)
				emergencyIU.addPatient();

			else if (option == 2)
				emergencyIU.callPatient();

			else if (option == 3)
				emergencyIU.removePatient();

			else if (option == 4)
				emergencyIU.printVaccinated();

			else if (option == 5)
				emergencyIU.printPatients();
			
			else if(option!=0)
				System.out.printf("\nINVALID OPTION!\n");


		} while (option != 0);
		sc.close();
		System.out.println("Closing application...");

	}
}
