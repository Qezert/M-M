public class ContainerAlreadyBookedException extends Exception {
    private int coloumn;
    private int row;
    
    public ContainerAlreadyBookedException(int requestedColoumn, int requestedRow) {
        super("The requested placement is already booked");
        coloumn = requestedColoumn;
        row = requestedRow;
    }
    
    public String requestedContainer() {
        return "Requestedcontainer:  coloumn " + coloumn + ", row " + row;
    }
    
}