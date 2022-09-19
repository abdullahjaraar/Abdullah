
package singltone.pkg1;

/**
 *
 * @author ALMAS COMPUTER
 */
public class EagerSinglton {
    private EagerSinglton(){}
    private static final EagerSinglton instance = new EagerSinglton();
    public static EagerSinglton getinstance(){
        return instance;
    }
    }
