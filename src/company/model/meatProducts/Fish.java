package company.model.meatProducts;

import company.model.Product;

import java.time.LocalDate;

public class Fish extends Product {


    public Fish(int id, String name, String companyName, LocalDate deadline) {
        super(id, name, companyName, deadline);
    }
}
