package Java8Features;

@FunctionalInterface 
interface Test6 {
    void display(int n, String name);
}

public class LambdaWithParameters {

    public static void main(String[] args) {
        Test6 t = (n, name) -> {
            System.out.println((n * n)+" "+name);
        };

        t.display(99, "Alice");
        t.display(2, "Bob");
        t.display(56, "Charlie");
        t.display(12, "Diana");
    }
}
