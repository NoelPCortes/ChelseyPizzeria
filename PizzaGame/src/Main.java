import CustomerAndOrder.Customer;
import ProductAndMenu.Menu;
import ShopAndPayment.Payment;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.##");

        Customer customer = new Customer();

        Payment payment = new Payment();
        payment.setDecoration("Painting Of a Dog", 1.1f);

        Menu menu = new Menu();


        Map<String, Double> availablePizzas = new HashMap<>();
        availablePizzas.put("cheese", 299.99);
        availablePizzas.put("sausage", 349.99);
        availablePizzas.put("pepperoni", 399.99);

        Map<String, Double> availableToppings = new HashMap<>();
        availableToppings.put("cheese", 20.50);
        availableToppings.put("sausage", 50.99);
        availableToppings.put("pepperoni", 75.75);


        System.out.print("Enter name for Order: ");
        customer.setName(sc.nextLine());

        System.out.println();
        System.out.println("Available Pizzas:");
        System.out.println("Cheese = 299.99");
        System.out.println("Sausage = 349.99");
        System.out.println("Pepperoni = 399.99");
        System.out.print("Enter pizza: ");
        customer.setPizzaOrder(sc.nextLine().toLowerCase());

        if(!availablePizzas.containsKey(customer.getPizzaOrder())){
            System.out.println("Pizza not available!");
            return;
        }

        System.out.println();
        System.out.print("Amount of Pizza: ");
        customer.setPizzaAmount(sc.nextInt());
        sc.nextLine();

        System.out.println();
        System.out.print("Would you like to add a topping?[Y/N]: ");
        char topping = sc.next().charAt(0);
        sc.nextLine();
        if(Character.toLowerCase(topping) == 'y'){
            System.out.println("Available toppings: ");
            System.out.println("Cheese = 20.50");
            System.out.println("Sausage = 50.99");
            System.out.println("Pepperoni = 75.75");
            System.out.print("Choose which topping: ");
            menu.setTopping(sc.nextLine().toLowerCase());
            menu.setToppingPrice(availableToppings.getOrDefault(menu.getTopping(), 0.0));
        }

        System.out.print("Which Size[1 = Small : 9 inch, 2 = Medium : 12 inch, 3 = Large: 15 inch: ");
        menu.setSize(sc.nextInt());
        sc.nextLine();

        menu.setPrice(availablePizzas.getOrDefault(customer.getPizzaOrder(), 0.0) * menu.getSize());
        payment.setPayment(menu.getPrice(), menu.getToppingPrice(), customer.getPizzaAmount());

        System.out.println();
        System.out.println("Printing Receipt...");
        System.out.println("Customer: " + customer.getName() + " = " + availablePizzas.get(customer.getPizzaOrder()));
        System.out.println("Ordered: " + customer.getPizzaOrder());
        System.out.println("Amount: " + customer.getPizzaAmount() + " = " + availableToppings.get(menu.getTopping()));
        System.out.println("Toppings: " + menu.getTopping());
        System.out.println("Size: " + menu.getSize());
        System.out.printf("Shop Multiplier: %.1fx\n", payment.getMultiplier());
        System.out.println("Total: Php " + df.format(payment.getPayment()));

    }
}
