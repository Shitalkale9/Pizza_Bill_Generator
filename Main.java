
public class Main {
    public static void main(String[] args) {
         Pizza basePizza = new Pizza(false);
        basePizza.addExtraToppings();//we can remove any of these extra material as we want
        basePizza.addExtraCheese();
        basePizza.takeAway();
        basePizza.getBill();
        //DeluxPizza dp = new DeluxPizza(true);
        // dp.addExtraCheese(); // we comment out all these becz we dont want to give access to user of adding any extra material on delux pizza
        // dp.addExtraToppings(); //although we off these comments and try to run it will not add any extra material on pizza becz using overriding we made these empty methods
        //dp.getBill();
    }
}
