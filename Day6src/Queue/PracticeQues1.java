package Queue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;
    String std;

    public Student(int id, String name, int age, String std) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.std = std;
    }
}

public class PracticeQues1 {

    public static void main(String[] args) {
        ArrayList<Student> st = new ArrayList<>();
        st.add(new Student(1, "Anjali Arya", 20, "K22DM"));
        st.add(new Student(2, "Issar Singh", 21, "K22ND"));
        st.add(new Student(3, "Veerwati", 40, "K22PA"));
        st.add(new Student(4, "Sanjay", 23, "K22AE"));
        st.add(new Student(5, "Bhumika", 17, "K22MM"));

        LinkedList<Integer> ls = new LinkedList<>();
        ls.add(15);
        ls.add(75);
        ls.add(36);
        ls.add(23);

        HashSet<String> sh = new HashSet<>();
        sh.add("Radhika");
        sh.add("Anand");
        sh.add("Rahul");
        sh.add("Vanshika");

        Scanner sc = new Scanner(System.in);

        while (true) {
        	
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nArrayList:");
                    ListIterator<Student> litr = st.listIterator();
                    while (litr.hasNext()) {
                        Student s = litr.next();
                        System.out.println("Id: " + s.id + ", Name: " + s.name + ", Age: " + s.age + ", Section: " + s.std);
                    }
                    break;

                case 2:
                    System.out.println("\nLinkedList:");
                    for (int num : ls) {
                        System.out.println(num);
                    }
                    break;

                case 3:
                    System.out.println("\nHashSet:");
                    for (String str : sh) {
                        System.out.println(str);
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
