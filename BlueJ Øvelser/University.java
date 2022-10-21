import java.util.List;
import java.util.ArrayList;

public class University {
    List<Person> persons;
    
    public University() {
        persons = new ArrayList<Person>();
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void show() {
        for (Person person : persons) {
            person.display();
            System.out.println();
        }
    }
    
    // UDen objektorientering - mega dum ting at gøre
    public static void display(Person p) {
        System.out.println(p.getName());
        System.out.println(p.getAge());
        if (p instanceof Student) {
            Student student = (Student) p;
            System.out.println(student.getProgramme());
        } else if (p instanceof Teacher) {
            Teacher teacher = (Teacher) p;
            System.out.println(teacher.getTeaching());
        } else {
            System.out.println("Wtf dude?");
        }
    }
    
    public static void demo() {
        University itu = new University();
        Teacher teacher1 = new Teacher(42, "Bob", "Groundlaying Programmeering");
        Student student1 = new Student(5, "Marley", "BSWU");
        itu.addPerson(teacher1);
        itu.addPerson(student1);
        itu.show();
    }
}