public class StudentTest {
    public static void main(String[] args) {
        Student p = new Student("José","R. Bolinha, 123","ABC",29, 555);
        System.out.println(p);
        p.setAddress("R. Quadrado, 312");
        System.out.println(p);
    }
}
