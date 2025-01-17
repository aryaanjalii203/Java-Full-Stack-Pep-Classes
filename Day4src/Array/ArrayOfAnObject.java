package Array;

class Student{
	int sid;
	String name;
	int age;
	String std;
	
	public Student(int sid, String name, int age, String std) {
		this.sid=sid;
		this.name=name;
		this.age=age;
		this.std=std;
	}
	public void display() {
		System.out.println(sid+name+age+std);
	}
}

public class ArrayOfAnObject {
	
public static void main(String[] args) {
		Student s[]=new Student[5];//Array of an object
		s[0]=new Student(101,"Anjali",20,"TE");
		s[1]=new Student(102,"Issar",21,"AE");
		s[2]=new Student(103,"Shabnam",20,"FE");
		s[3]=new Student(104,"Radhika",18,"BE");
		s[4]=new Student(105,"Veerwati",40,"ME");
		
		s[0].display();
		s[1].display();
		s[2].display();
		s[3].display();
		s[4].display();
	}

}
