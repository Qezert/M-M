import java.util.ArrayList;

public class CargoShip {
    private String model;
    private Container[][] containers;
    private ArrayList<Booking> bookings;

    public CargoShip(String model, int coloumns, int rowsPerColoumn) {
        this.model = model;
        containers = buildCargoShip(coloumns, rowsPerColoumn);
        bookings = new ArrayList<>();
    }

    /* Tilføjer en ny booking til listen bookings. */
    public void addBooking(String bookingId, int kg, boolean flammableGoods, int requestedColoumn, int requestedRowNo) {
        try {
            Container requestedContainer = containers[requestedColoumn][requestedRowNo];
            bookings.add(new Booking(bookingId, kg, flammableGoods, requestedContainer));
            requestedContainer.setBooked();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("*** Booking error - coloumn and row error");
        } catch (InvalidKgException e) {
            System.out.println(e.getMessage());
        }
    }

    /* Udregner det gennemsnitlige antal kilo per booking. */
    public double avgKg() {
        try {
            int sum = 0; 
            for (Booking b : bookings) {
                sum += b.getKgs();
            }
            return sum / bookings.size();
        } catch (ArithmeticException e) {
            System.out.println("***  There are no bookings");
        }
        return 0;
    }

    /* Hjælpemetode til constructoren.
    Opretter Container-objekter, som den tilføjer til containers. */
    private Container[][] buildCargoShip(int coloumns, int rowsPerColoumn) {
        Container[][] cargoShip = new Container[coloumns][rowsPerColoumn];
        for (int i = 0; i < cargoShip.length; i++) {
            for (int j = 0; j < cargoShip[i].length; j++) {
                cargoShip[i][j] = new Container(i, j);
            }
        }
        return cargoShip;
    }

    public void checkAddBooking(String bookingId, int kg, boolean flammableGoods, int requestedColoumn, int requestedRowNo) throws ContainerAlreadyBookedException {
        if (containers[requestedColoumn][requestedRowNo].getBooked() == true) {
            throw new ContainerAlreadyBookedException(requestedColoumn, requestedRowNo);
        } else {
            addBooking(bookingId, kg, flammableGoods, requestedColoumn, requestedRowNo);
        }
    }
}
