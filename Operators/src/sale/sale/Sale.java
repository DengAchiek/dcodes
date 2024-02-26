package sale.sale;

//import com.sun.deploy.cache.CachedJarFile;
import patient.patient.Patient;

import java.util.Scanner;

public class Sale {
    private static String itemName;
    private static float itemPrice;
    private static String itemColor;
    
    // creating constructors 
    public Sale(){
        
    }
    public Sale(String itemName){
        Sale.itemName = itemName;
        
    }
    public Sale(String itemName, float itemPrice){
        this.itemPrice = itemPrice;
        
    }
    public Sale(String itemName, float itemPrice, String itemColor){
        this.itemColor = itemColor;
    }
    // create the set and get method
    
    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    public String getItemName(){
        return itemName;
    }
    public void setItemPrice(String itemPrice){
        this.itemPrice = Float.parseFloat(itemPrice);
    }
    public float getItemPrice(){
        return itemPrice;
    }
    public void setItemColor(String itemColor){
        this.itemColor = itemColor;
    }
    public String getItemColor(){
        return itemColor;
    }
    
    // create the display method

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter item's price: ");
        float itemPrice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter item's color: ");
        String itemColor = String.valueOf(Integer.parseInt(scanner.nextLine()));

       Sale saleInput = new Sale(itemName, itemPrice, itemColor);

        System.out.println("\nSale Information:" + '\n'+ "itemName:" + itemName + '\n'+ "itemPrice:" + itemPrice + '\n'+ "itemColor:" + itemColor);
        //  student.showDetails();

        scanner.close();
    }
    
}
