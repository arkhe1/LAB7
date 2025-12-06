public class Student {

    String name;
    int age;

    // İlk başta biz constructor yazmadığımız için Java kendi default constructor'ını oluşturuyor.

    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }

    /*
       Observation:
       name -> null
       age  -> 0
       Error almadım çünkü Java otomatik olarak default constructor veriyor.
    */

    // Extension kısmı
    // Explicit default constructor
    public Student() {
        name = "DefaultName";
        age = 18;
    }

    // Parametreli constructor (default constructor'ı silmeden)
    public Student(String n, int a) {
        name = n;
        age = a;
    }

    /*
        Extension Observation:
        Hata olmadı çünkü default constructor'ı kaldırmadım.
        Parametreli constructor sadece çağırınca çalışıyor, normal new Student() hala varsayılan değerleri veriyor.
    */
}
