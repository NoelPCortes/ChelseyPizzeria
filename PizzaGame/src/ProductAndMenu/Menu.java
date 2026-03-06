package ProductAndMenu;

public class Menu extends Pizza implements Ingredient{
    private double price;
    private int size;
    private String topping;
    private double toppingPrice;
    
    public Menu() {
        price = 0;
        size = 0;
        topping = "None";
        toppingPrice = 0;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setToppingPrice(double toppingPrice) {
        this.toppingPrice = toppingPrice;
    }

    @Override
    public double getToppingPrice() {
        return toppingPrice;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override 
    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public String getTopping() {
        return topping;
    }

    @Override
    public void showIngredient() {
        System.out.println("WIP");
    }
}
