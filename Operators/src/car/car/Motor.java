package car.car;

public class Motor {
    // declare a private instance variables
    private String name;
    private float price;
    private String color;

    //create a constructor
    public Motor(){
        // leave it empty
    }
    public Motor(String name){
        this.name = name;

    }
    public Motor(String name, float price){
        this.price = price;

    }
    public Motor(String name, float price, String color){
        this.color = color;

    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setPrice(float price){
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
    public void showDetails(){
        System.out.print("name: " + name + '\n');
        System.out.print("color: " + color + '\n');
        System.out.print("price: " + price);
    }
    public static void main(String [] args){
        Motor motor1 = new Motor();
        motor1.setName("Vitz");
        motor1.setColor("white");
        motor1.setPrice(1500000);
        motor1.showDetails();
    }
}
