import java.util.*;

public class Election {
    
    protected String question;
    protected int yes;
    protected int no;
    
    public Election(String question) {
        if (question == null) {
            throw new IllegalArgumentException("***  Question missing!");
        }
        this.question = question;
        int yes = 0;
        int no = 0;
    }
    
    public void vote(char v) {
        if (v != 'y' && v != 'n' && v != ' ') {
            throw new IllegalVoteException(v);
        }
        
        if (v == 'y') {
            yes++;
        } else if (v == 'n') {
            no++;
        }
    }
    
    public int percentage(int fraction, int total) {
        return ((fraction * 100) / total);
    }
    
    public String visualize(int fraction, int total) throws NoVotesYetException {
        if (total == 0) {
            throw new NoVotesYetException();
        }
        
        String divide = fraction + "/" + total;
        return divide + " " + percentage(fraction, total) + "%";
    }
    
    public void display() {
        System.out.println(question);
        try {
        System.out.println("* " + visualize(yes, yes + no) + " yes");
        System.out.println("* " + visualize(no, yes + no) + " no");
        } catch (NoVotesYetException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
