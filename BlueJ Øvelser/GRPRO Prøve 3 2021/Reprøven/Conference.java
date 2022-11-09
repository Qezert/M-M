public class Conference {
    protected String name;
    protected int registered;
    protected int attending;
    
    public Conference(String name) {
        this.name = name;
        int registered = 0;
        int attending = 0;
    }
    
    public void register(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("***  negative argument: " + n);
        }
        registered = registered + n;
    }
    
    public void showUp() {
        attending++;
    }
    
    public int percentage(int fraction, int total) {
        return ((fraction * 100) / total);
    }
    
    public void statistics() {
        try {
        System.out.println(name);
        System.out.println("* registered: " + registered);
        System.out.println("* attending: " + attending);
        System.out.println("* proportion: " + percentage(attending, registered) + "%");
        } catch (Exception e) {
            System.out.println("* no one registered yet");
        }
    }
    
    public void turnUp() throws CapacityExceededException {
        if (registered == attending) {
            throw new CapacityExceededException(attending + 1);
        }
        showUp();    
    }
    
}