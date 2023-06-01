package company.dao;

import company.model.Product;

import java.util.ArrayList;

public class ProductDao {

    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Product> discountProducts = new ArrayList<>();
    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getDiscountProducts() {
        return discountProducts;
    }

    public void setDiscountProducts(ArrayList<Product> discountProducts) {
        this.discountProducts = discountProducts;
    }
}
