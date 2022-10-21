public class Teacher extends Person
{
    
    
    private String teaching;
    
    public Teacher(int age, String name, String teaching) {
        super(age, name);
        this.teaching = teaching;
    }
    
    public String getTeaching() {
        return teaching;
    }
    
    public void display() {
        // super.display();
        System.out.println("teaching: " + teaching);
        super.display();
    }
}