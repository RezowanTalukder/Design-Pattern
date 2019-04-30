package observer_pattern;



public class HexObserver extends Observer{
    Subject subject ;

    public HexObserver(Subject subject){
        this.subject = subject ;
        this.subject.attach(this);
    }
    
    
    @Override
    public void update() {
        System.out.println("Hex "+ Integer.toHexString(subject.getState()));
    }
    
}
