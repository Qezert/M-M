class Person {
    private int age;
    private String name;
    
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void birthday() {
        age = age + 1;
    }
    
    public String getName() {
        return name;
    }
    
    public void display() {
        System.out.println(name);
        System.out.println("(" + age + " year(s) old)");
        
    }
    
}