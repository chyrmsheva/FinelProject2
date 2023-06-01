package company.model.wheatProducts;

import company.model.Product;

import java.time.LocalDate;

public class FLour extends Product {
    public FLour() {
    }

    public FLour(int id, String name, String companyName, LocalDate deadline) {
        super(id, name, companyName, deadline);
    }
}
