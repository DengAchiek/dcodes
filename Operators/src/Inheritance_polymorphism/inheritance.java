package Inheritance_polymorphism;

public class inheritance {
    static class Vehicle{
        protected String brand = "Ford";
        public void honk(){
            System.out.print("Tuut, tuut");
        }

    }
    static class Car extends Vehicle{
        private final
        String modelName = "Mustang";
        public void main(String[] args){
            Car myCar = new Car();
            myCar.honk();
            
            System.out.print(myCar.brand + " " + myCar.modelName);
        }
        
        
    }
   
}
