public class DeluxPizza extends Pizza{
    @Override//we override here to prevent access to user
    // of adding extra maetrial
    public void addExtraCheese() {

    }

    @Override
    public void addExtraToppings() {

    }

    public DeluxPizza(Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();

    }
}
