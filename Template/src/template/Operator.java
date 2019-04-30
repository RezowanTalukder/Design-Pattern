package template;


public abstract class Operator {
    public void getValue(){
        getCallRate() ;
        getCallCharge() ;
        
    }
    
    abstract void getCallCharge() ;
    abstract void getCallRate() ; 
}
