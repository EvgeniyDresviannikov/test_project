package decorator;

public class StarbuzzCoffeeTest {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + ", cost = " + espresso.cost());
        espresso = new Mocha(espresso);
        espresso = new Whip(espresso);
        System.out.println(espresso.getDescription() + ", cost = " + espresso.cost());
    }
}
