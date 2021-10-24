package msimao;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger ("Basic", "pork", 3.56, "white");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger() + " $");

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger() + " $");

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();
        db.addHamburgerAddition3("onions", 50.53);




    }
}
