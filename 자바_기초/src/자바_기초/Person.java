package 자바_기초;

public class Person {
	int no, age;
	String name;
	char gender;

	public Person(int no, int age, String name, char gender) {
		this.no = no;
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String toString() {
		return "Person[no="+this.no+", age="+this.age+", name="+this.name+", gender="+this.gender+"]";
	}
	public static void main(String[] args) {
		Person person = new Person(1,21,"Kim",'M');
		System.out.println(person.toString());
	}

}
