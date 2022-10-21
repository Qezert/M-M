public class Student extends Person{
    private String programme;
    
    public Student(int age, String name, String programme) {
        super(age, name);
        this.programme = programme;
    }
     
    public String getProgramme() {
        return programme;
    }
    
    public void display() {
        // super.display();
        System.out.println(programme + " student");
        super.display();
    }
}