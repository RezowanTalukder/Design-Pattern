
package factory;

import java.util.Scanner;

/**
 *
 * @author rez1
 */
public class Factory {


    public ICountry factory(int a){
        if(a==1){
            ICountry oc = (ICountry) new OrientalCountry() ;
            return oc ;
        }
        
        else{
            ICountry occ = (ICountry) new OccidentalCountry() ;
            return occ ;
        }
        
    }
    
}
