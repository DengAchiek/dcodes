package patient.patient;

import motorcycle.bike.bike;

import java.util.Scanner;

public class Patient {
    private String name;
    private char gender;
    private int id;
    private int age;
    // create class call patient
    // char gender
    // string name
    // int age

    // create the constructor empty
    public Patient(){

    }
    // create the second constructor
    public Patient(int id){
        this.id = id;
    }
    public Patient(String name){
        this.name = name;


    }
    public Patient(String name, int id, int age){
        this.id = id;
        this.name = name;
        this.age = age;

    }
    // setters

    public void setName(String name) {
        this.name = name;
    }
    // set for id
    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }
    // set for gender

    public void setAge(int age) {
        this.age = age;
    }
    // getters

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // get the user inputs
   // public void showDetails(){
      //  Scanner name = new Scanner(System.in);
      //  System.out.print("Please enter your name  :" + name);
      //  Scanner age = new Scanner(System.in);
      //  System.out.print(" Age :" + age);
     //   Scanner id = new Scanner(System.in);
      //  System.out.print(" ID :" + id);
   // }

    // define the main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter patient's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter patient's age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter your patient's number: ");
        int id = Integer.parseInt(scanner.nextLine());

        Patient student = new Patient(name, age, id);

        System.out.println("\nStudent Information:" + '\n'+ "name:" + name + '\n'+ "age:" + age + '\n'+ "id:" + id);
      //  student.showDetails();

        scanner.close();
    }
}

    //initialize a patient objects using different constructs
    // first con is empty
    // second constructor is id only
    // third con is name only
    // fourth con is both name, id, age

    // get user inputs using scanner



