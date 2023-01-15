package Builder;

public class Main {
    public static void main(String[] args) {
        Auto auto = new AutoBuilderIml().setModel("Audi").setPrice(100_000).build();
        Auto auto1 = new AutoBuilderIml().setModel("Mersedes").setPrice(100_000).setWeight(1500.5).build();

        System.out.println(auto);
        System.out.println(auto1);

    }
}
