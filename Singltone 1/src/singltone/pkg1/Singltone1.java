
package singltone.pkg1;

public class Singltone1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hello");
        LazySinglton obj = new LazySinglton();
        System.out.println(obj.hashCode());
        EagerSinglton obj1= new EagerSinglton();
        System.out.println(obj1.hashCode());
        DoubelCheackinglazySinglton obj2 =new DoubelCheackinglazySinglton();
        System.out.println(obj2.hashCode());
        
        
        
    }
    
}
