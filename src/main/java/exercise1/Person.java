package exercise1;

class Person
{
	private int age;
	private String name;

	 Person(String name, int age)
	{
		this.name = name;
		this.age = age;
		/*name=myname;
		age=myage;
		si on met ca on doit mettre public Person(String myname, int myage)
		*/

	}// constructeur

	public void Set_name(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void SetAge(int age)
	{
		this.age=age;
	}

	public int getAge()
	{
		return age;
	}


}
