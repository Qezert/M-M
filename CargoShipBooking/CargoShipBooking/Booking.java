public class Booking {
    private String bookingId;
    private int kg;
    private boolean flammableGoodsIncluded;
    private Container container;

    public Booking(String bookingId, int kg, boolean flammableGoodsIncluded, Container container) throws InvalidKgException {
        this.bookingId = bookingId;
        if (!(kg > 0)) {
            throw new InvalidKgException("Can't create booking without weight");
        }
        this.kg = kg;
        this.flammableGoodsIncluded = flammableGoodsIncluded;
        this.container = container;
    }

    public int getKgs() { 
        return kg; 
    }

    public boolean getFlammableGoodsIncluded() { 
        return flammableGoodsIncluded; 
    }
}
