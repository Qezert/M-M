import java.util.*;

public class Klub {
    
    private String navn;
    private ArrayList<Atlet> atleter;
    
    public Klub(String navn) {
        this.navn = navn;
        atleter = new ArrayList<>();
    }
    
    public void addAtlet(Atlet atlet) {
        atleter.add(atlet);
    }
    
    public void visAlleAtleter() {
        for (Atlet atlet : atleter) {
            atlet.display();
        }
    }
    
    public void visAlleAtleter(boolean samletValue) {
        double samletPris = 0;
        if (samletValue == false) {
            for (Atlet atlet : atleter) {
            atlet.display();
            }
        } else {
            for (Atlet atlet : atleter) {
            atlet.display();
            samletPris = samletPris + atlet.getPris();
            }
        }
        System.out.println(samletPris);
    }
    
    public void inflation(double pct) {
        for (Atlet atlet : atleter) {
            atlet.opdaterPris(atlet.getPris() + (pct/100 * atlet.getPris()));
            }
    }
    
    public int numSwim() {
        int swimmers = 0;
        for (Atlet atlet : atleter){
            if (atlet.isSwimmer() == true) {
                swimmers = swimmers + 1;
            }
        }
        return swimmers;
    }
    
    public Atlet[] getSwimmers() {
        Atlet[] swimAtleter = new Atlet[numSwim()];
        int swimmers = 0;
        for (Atlet atlet : atleter){
            if (atlet.isSwimmer()) {
                swimAtleter[swimmers] = atlet;
                swimmers = swimmers + 1;
            }
        }
        return swimAtleter;
    }
    
}