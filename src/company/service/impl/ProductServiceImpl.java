package company.service.impl;

import company.dao.ProductDao;
import company.model.Manager;
import company.model.Product;
import company.service.ProductService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImpl implements ProductService {
    private ProductDao productDao = new ProductDao();

    @Override
    public void addProducts(List<Product> products) {
        ArrayList<Product> products1 = new ArrayList<>();

        products.stream().filter(product -> product.getCompanyName().equalsIgnoreCase("MILKA")
                        || product.getCompanyName().equalsIgnoreCase("NUR")
                        || product.getCompanyName().equalsIgnoreCase("TOIBOS"))
                .forEach(products1::add);
        products1.stream().filter(product -> product.getDeadline().minusMonths(1).isAfter(LocalDate.now()))
                .forEach(productDao.getProducts()::add);

    }
    @Override
    public void sortByDate(List<Product> products) {

        LinkedList<Product> linkedList = new LinkedList<>(products);
        products.stream().filter(product -> product.getDeadline().isBefore(LocalDate.now()))
                .forEach(linkedList::remove);
        linkedList.stream().filter(product -> LocalDate.now().plusDays(7).isEqual(product.getDeadline())
                        || LocalDate.now().plusDays(6).isEqual(product.getDeadline())
                        || LocalDate.now().plusDays(5).isEqual(product.getDeadline())
                        || LocalDate.now().plusDays(4).isEqual(product.getDeadline())
                        || LocalDate.now().plusDays(3).isEqual(product.getDeadline())
                        || LocalDate.now().plusDays(2).isEqual(product.getDeadline())
                        || LocalDate.now().plusDays(1).isEqual(product.getDeadline()))
                .forEach(productDao.getDiscountProducts()::add);

    }
    @Override
    public void getAllProducts(String username, String password) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a login");
        username = scanner.nextLine();
        System.out.println("Write a password");
        password = scanner.nextLine();
        if (username.equals(manager.getUsername()) && password.equals(manager.getPassword())) {
//            System.out.println(getProductDao().getProducts());
            System.out.println("discount products " + getProductDao().getDiscountProducts());

        } else {

            System.out.println("Неправильный логин и пароль");
        }
    }
    public ProductDao getProductDao() {
        return productDao;
    }

}

