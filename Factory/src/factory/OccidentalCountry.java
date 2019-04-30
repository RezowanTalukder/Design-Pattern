
package factory;

/**
 *
 * @author rez1
 */
public class OccidentalCountry implements ICountry{
        @Override
    public IFlora createFlora() {
        IFlora ori = new OccedentalFlora();
        return ori ;
    }

    @Override
    public IFoana createFoana() {
        IFoana or = new OccidentalFoana();
        return or ;
    }
}
