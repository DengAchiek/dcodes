public class class_objects {
    String fName;
    String lName;
    int age;
    //int x ; // declaration and initialization of a variable x
    //int y ; // declaration and initialization of a variable y

    // this main method serves as the entry point for java application
    public static void main(String[] args){
        // for the main method to interact with the object we create an instance of the object myobj

        // create the object instances
        class_objects myObj = new class_objects();
        // then call the myObj object and then initialize it
        myObj.fName = "Dee";
        class_objects mObj = new class_objects();
        mObj. lName= "Cheq";
        class_objects ageObj = new class_objects();
        ageObj. age= 27;
        System.out.print("Name:"+myObj.fName +" "+mObj.lName +'\n'); // this accessing the attribute of a class by creating the object of a class using dot
        System.out.print("Age:"+ageObj.age);
    }


}
