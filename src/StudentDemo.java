public class StudentDemo {
    public static void main(String[] args) {

        // Senaryonun ilk kısmında default constructor yokmuş gibi davranıyoruz
        Student s1 = new Student();
        s1.printStudentInfo();

        // Extension sonrası default constructor devreye giriyor
        Student s2 = new Student();
        s2.printStudentInfo();

        // Parametreli constructor
        Student s3 = new Student("Umut", 20);
        s3.printStudentInfo();
    }
}
