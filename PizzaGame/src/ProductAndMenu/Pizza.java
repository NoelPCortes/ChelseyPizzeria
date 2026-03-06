package ProductAndMenu;

abstract class Pizza {
    abstract void setPrice(double price);
    abstract double getPrice();
    abstract void setToppingPrice(double toppingPrice);
    abstract double getToppingPrice();
    abstract void setSize(int size);
    abstract int getSize();
    abstract void setTopping(String topping);
    abstract String getTopping();
}
