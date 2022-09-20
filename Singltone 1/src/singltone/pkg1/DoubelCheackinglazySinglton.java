/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singltone.pkg1;

/**
 *
 * @author ALMAS COMPUTER
 */
public class DoubelCheackinglazySinglton {
      private  static DoubelCheackinglazySinglton instance;
    
    public static DoubelCheackinglazySinglton getinstance(){
        if(instance==null){
            synchronized (DoubelCheackinglazySinglton.class){
             if(instance==null) 
                 return instance = new DoubelCheackinglazySinglton();
            }
           
            
            
        }else{
            return instance;
        }
          return null;
   
    }
}
