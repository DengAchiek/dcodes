package motorcycle.bike;

public class bike {
    // declare the attributes
    private String name;
    private float price;

    // let's define the constructors, and they need to be public for access visibility of an object
    public bike() {
        // this.name = name;
        //this.price = price;
    }
    // constructor
    public bike( String name){
        this.name = name;
        //this.price = price;

    }
    // constructor
    public bike( String name, float price){
        this.name = name; // referencing
        this.price = price; // referencing

    }
    // SETTERS
    // create a setter and all setters are public and void by default


    public void setName(String name) {
        this.name = name; // referencing
    }
    // create a setter for a price
    public void setPrice(float price){
        this.price = price;
    }
    // GETTERS
    // by default getters are public
    // create a getter name


    public String getName() {
        return name;
    }

    // create a getter for price

    public float getPrice() {
        return price;
    }
    // show details
    public void showDetails(){
        System.out.print("the name is :" + name);
        System.out.print(" price is :" + price);
    }
    public static void main(String[] args){
        // initialize the bike using the constructor
        // create the bike object using the first constructor
        bike bike1 = new bike();
        bike1.setName("Boxer");
        bike1.setPrice(110000f);
        bike1.showDetails();

        // create the bike using second constructor

        bike bike2 = new bike("Senke");
        bike2.setPrice(80000f);
        bike2.showDetails();

        // create the bike using the third constructor
        bike bike3 = new bike("Bajaj", 100000);
        bike3.showDetails();

    }
}
