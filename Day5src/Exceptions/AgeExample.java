package Exceptions;


public class AgeExample {

    public static void main(String[] args) {
        int age = 17;

        try {
            if (age < 18) {
                throw new AgeException("Age not valid for voting.");
            } else {
                System.out.println("You can vote after some years.");
            }
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
