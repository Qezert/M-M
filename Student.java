class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void birthday() {
        age = age + 1;
    }

    void display() {
        System.out.print(name);
        System.out.println(" (" + age + ")");
    }
}