package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY):");
        Date birthDate = sdf.parse(sc.next());

        //INSTANCIANDO O OBJETO CLIENT
        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");

        //INSTANCIANDO O OBJETO ORDERSTATUS
        OrderStatus status = OrderStatus.valueOf(sc.next());

        //INSTANCIANDO O OBJETO ORDER
        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order?");
        int qntItems = sc.nextInt();

        for (int i=0; i<qntItems; i++) {
            sc.nextLine();
            System.out.println("Enter #" + (i+1) + " item data:");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            sc.nextLine();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();

            //INSTANCIANDO O OBJETO PRODUTO
            Product product = new Product(productName, productPrice);

            //INSTANCIANDO O OBJETO ORDERITEM
            OrderItem it  = new OrderItem(quantity, productPrice, product);

            //ADICIONANDO AO PEDIDO
            order.addItem(it);

        }

        //IMPRESSÃO DO PEDIDO NA TELA
        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
