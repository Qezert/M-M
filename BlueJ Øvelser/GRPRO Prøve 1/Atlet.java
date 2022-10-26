public class Atlet {
    
    private String navn;
    private String sportsgren;
    private double pris;
    private int alder;
    
    // constructor
    public Atlet(String navn, String sportsgren, double pris, int alder) {
        this.navn = navn;
        this.sportsgren = sportsgren;
        this.pris = pris;
        this.alder = alder;
    }
    
    public void opdaterPris(double nyPris){
        pris = nyPris;
    }
    
    public double getPris() {
        return pris;
    }
    
    public double predPris() {
        double predPris = pris -0.95*Math.abs(25-alder);
        return predPris;
    }
    
    public void display() {
        System.out.println(navn + " (" + alder + ") - " + sportsgren + ": " + pris + " kr " + "(" + predPris() + "kr)");
    }
    
    public boolean isSwimmer() {
        if (sportsgren.equals("Swim")) {
            return true;
        } else {
            return false;
        }
    }
    
}