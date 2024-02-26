public class seas_methods {
    static void myMethod(String fname){

        System.out.print("Deng");
    }
    // define two methods to do operation in java
    static int plusMethodInt(int x, int y){
        return x + y;

    }
    static double plusMethodDouble(Double x, Double y){
        return x + y;
    }

    public static void main(String[] args){
        int myNum = plusMethodInt(6,9);
        Double myNumber = plusMethodDouble(4.5, 8.9);
        System.out.print("int :" + myNum);
        System.out.print("Double :" + myNumber);
        myMethod("");
    }



}
