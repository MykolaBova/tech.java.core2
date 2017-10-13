package udemy.interviewbyexample;

/**
 * Created by mbovalocal on 08.10.17.
 */
public class VariablePractice {

    public String messages() {
        String studentName="111";

        return studentName;
    }

    public static void main(String[] args) {
        // Prints "Hello, World" in the terminal window.

        VariablePractice var = new VariablePractice();

        System.out.println("Hello, VariablePractice "+var.messages());
    }

}
