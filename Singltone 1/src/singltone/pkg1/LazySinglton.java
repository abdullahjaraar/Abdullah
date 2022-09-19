
package singltone.pkg1;



public class LazySinglton {
    private  static LazySinglton instance;
    
    public static LazySinglton getinstance(){
        if(instance==null){
            return instance = new LazySinglton();
            
            
        }else{
            return instance;
        }
    }
}
