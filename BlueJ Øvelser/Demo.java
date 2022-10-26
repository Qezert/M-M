public class Demo {
    
    public static void main(String[] args) {
    
    Klub minKlub = new Klub("SWU United");
    
    Atlet bob = new Atlet("Bob", "Swim", 500, 20);
    Atlet marley = new Atlet("marley", "Swim", 500, 20);
    Atlet mikkel = new Atlet("mikkel", "Swim", 500, 20);
    Atlet mag = new Atlet("mag", "Rocket League", 500, 20);
    Atlet jan = new Atlet("jan", "Swim", 500, 20);
    Atlet per = new Atlet("per", "Swim", 500, 20);
    
    minKlub.addAtlet(bob);
    minKlub.addAtlet(marley);
    minKlub.addAtlet(mikkel);
    minKlub.addAtlet(mag);
    minKlub.addAtlet(jan);
    minKlub.addAtlet(per);
    
    // minKlub.inflation(10);
    
    // minKlub.visAlleAtleter(true);
    
    minKlub.numSwim();
    
    for (Atlet atlet : minKlub.getSwimmers()) {
        atlet.display();
    }
    
    }
}