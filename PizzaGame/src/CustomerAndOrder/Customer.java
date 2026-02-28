package CustomerAndOrder;

public class Customer extends Person implements Order {

    private String name;
    private String pizza;
    private int amount;

    @Override public void setName(String name){ this.name = name; }

    @Override public String getName(){ return name; }

    @Override public void setPizzaOrder(String pizza){ this.pizza = pizza; }

    @Override public String getPizzaOrder(){ return pizza; }

    @Override public void setPizzaAmount(int amount){ this.amount = amount; }

    @Override public int getPizzaAmount(){return amount; }

}
