public class Main {

    public static void main(String[] args) {
	Fish f1 = new Fish(23,1500, "swag", 1001, "Alwyn", true, 23, true);
    Fish f2 = new Fish(250, 27, "jonas", 20, "Durg", false, 0, false);
        System.out.println(f1.powerLevel());
        System.out.println(f2.powerLevel());
        System.out.println(f1.isGoodCatch());
        System.out.println(f2.isGoodCatch());
    }
}
