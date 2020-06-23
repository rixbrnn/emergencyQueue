package laboratorio4;

public class Patient implements Comparable<Patient>{
	private String name;
	private int age;
	
	public Patient(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}

	@Override
	public int compareTo(Patient o) {
		if (this.getAge() > o.getAge())
			return -1;
		if (this.getAge() < o.getAge())
			return 1;
		else
			return 0;
	}

}
