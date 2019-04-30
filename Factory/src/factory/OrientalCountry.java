
package factory;

/**
 *
 * @author rez1
 */
public class OrientalCountry implements ICountry{

    @Override
    public IFlora createFlora() {
        IFlora ori = new OrientalFlora() ;
        ori.getPlant() ;
        return ori ;
    }

    @Override
    public IFoana createFoana() {
        IFoana or = new OrientalFoana() ;
        return or ;
    }
    
    
}
