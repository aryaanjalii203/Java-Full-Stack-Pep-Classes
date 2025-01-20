package ClassLists;

import java.util.ArrayList;
import java.util.ListIterator;

class Student {
    int id;
    String name;
    int age;
    String sec;

    public Student(int id, String name, int age, String sec) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sec = sec;
    }

}

public class ClassListsEx1 {
    public static void main(String[] args) {
        
        ArrayList<Student> st = new ArrayList<Student>();

       
        Student st1 = new Student(1, "Anjali Arya", 20, "K22DM");
        Student st2 = new Student(2, "Himanshi", 20, "K22ND");
        Student st3 = new Student(3, "Shreya", 20, "K22PA");
        Student st4 = new Student(4, "Shabnam", 20, "K22AE");
        Student st5 = new Student(5, "Bhumika", 20, "K22MM");

        
        st.add(st1);
        st.add(st2);
        st.add(st3);
        st.add(st4);
        st.add(st5);

        
        
        ListIterator<Student> litr = st.listIterator(); 
        while (litr.hasNext()) {
        	Student s=litr.next();
            System.out.println("Id of Student "+s.id+" Name of Student "+s.name+" Age of Student "+s.age+" Student's Section"+s.sec);
        }
    }
}
