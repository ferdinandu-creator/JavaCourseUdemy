package ExerciosAulas;

public class Student {

    int id;
    String name;
    String gender;
    int age;
   static int computeCount = 0;

    boolean international;
    double tuitionFees = 100 , internationalFees = tuitionFees + 5000.0;

    private void compute() {
        int nextId = id +1;

        computeCount = computeCount +1;
        if(international){
            tuitionFees = tuitionFees + internationalFees;
        }
        System.out.println("\nid: "+id);
        System.out.println("nextID " + nextId);
        System.out.println("age" + age);
        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
        System.out.println("computeCount = " + computeCount);

        System.out.println("tuitionFees = " + tuitionFees);

    }

    public static void main(String[] args) {
        Student student1= new Student();
        student1.id = 1000;
        student1.name = "John";
        student1.gender = "male";
        student1.age = 18;
        student1.international = false;
        student1.compute();

        Student student2= new Student();
        student2.id = 10001;
        student2.name = "Elton";
        student2.gender = "female";
        student2.age = 81;
        student2.international = true;
        student2.compute();

        Student student3= new Student();
        student3.id = 10002;
        student3.name = "Anita";
        student3.gender = "female";
        student3.age = 20;
        student3.international = true;
        student3.compute();

        System.out.println("Student computeCount = " + Student.computeCount);
    }
}
