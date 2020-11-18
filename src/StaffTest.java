public class StaffTest {
    public static void main(String[] args) {
        Staff p = new Staff("José","R. Bolinha, 123","CATSC",777.55);
        System.out.println(p);
        p.setAddress("R. Quadrado, 312");
        System.out.println(p);
    }
}
