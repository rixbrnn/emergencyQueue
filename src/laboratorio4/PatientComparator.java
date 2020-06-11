package laboratorio4;

import java.util.Comparator;

public class PatientComparator implements Comparator<Patient> {

	@Override
	public int compare(Patient o1, Patient o2) {
		if (o1.getAge() < o2.getAge())
			return -1;
		if (o1.getAge() > o2.getAge())
			return 1;
		else
			return 0;
	}

}
