import com.sun.org.glassfish.external.probe.provider.annotations.Probe;
// this encapsulation
import java.util.Scanner;
public class person {
    private String name;
    private int age;

    public static void main(String[] args) {
        //person myObj = new person();
        Scanner myObj1 = new Scanner(System.in);
        System.out.print("Please Enter Your name");
        String mObj = myObj1.nextLine();
        //myObj.name = "John";  // error
        System.out.println("my name is :" + mObj); // error
    }
}