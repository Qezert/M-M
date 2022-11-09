public class CapacityExceededException extends Exception{
    protected int excess;
    
    public CapacityExceededException(int excess) {
        super("***  capacity exceeded: " + excess);
        this.excess = excess;
    }
    
    
}