package observer_pattern;


public class OctalObserver extends Observer{
    Subject subject ;

    public OctalObserver(Subject subject){
        this.subject = subject ;
        this.subject.attach(this);
    }
    
    
    @Override
    public void update() {
        System.out.println("Octal "+ Integer.toOctalString(subject.getState()));
    }
}
