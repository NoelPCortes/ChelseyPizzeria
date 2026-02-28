package CustomerAndOrder;

public class Customer extends Person implements Order {

    private String name;
    private String pizza;

    @Override public void setName(String name){ this.name = name; }

    @Override public String getName(){ return name; }

    @Override public void setPizzaOrder(String pizza){ this.pizza = pizza; }

    @Override public String getPizzaOrder(){ return pizza; }

}
