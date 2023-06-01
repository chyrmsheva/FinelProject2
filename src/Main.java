import company.model.Product;
import company.model.meatProducts.Fish;
import company.model.meatProducts.Meat;
import company.model.meatProducts.Sausage;
import company.model.milkProducts.Kefir;
import company.model.milkProducts.Milk;
import company.model.milkProducts.Yogurt;
import company.model.wheatProducts.Bread;
import company.model.wheatProducts.FLour;
import company.model.wheatProducts.Pasta;
import company.service.impl.ProductServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ProductServiceImpl productService = new ProductServiceImpl();
        ArrayList<Product> ls = new ArrayList<>();
        ls.add(new Fish(1, "Forel", "NUR", LocalDate.of(2023, 5, 23)));
        ls.add(new Fish(2, "Forel", "BALYK", LocalDate.of(2023, 7, 10)));
        ls.add(new Meat(3, "Beef", "NUR", LocalDate.of(2023, 7, 11)));
        ls.add(new Meat(4, "Lamb", "NUR", LocalDate.of(2023, 5, 26)));
        ls.add(new Sausage(5, "Halal", "TOIBOS", LocalDate.of(2023, 5, 29)));
        ls.add(new Sausage(6, "Toibos", "TOIBOS", LocalDate.of(2023, 4, 30)));
        ls.add(new Kefir(7, "Kefir", "AYRAN", LocalDate.of(2023, 7, 5)));
        ls.add(new Kefir(8, "Ayran", "MILKA", LocalDate.of(2023, 6, 6)));
        ls.add(new Milk(9, "Moloko", "MILKA", LocalDate.of(2023, 6, 7)));
        ls.add(new Milk(10, "Sut", "NaktaAzyk", LocalDate.of(2023, 7, 4)));
        ls.add(new Yogurt(11, "Chudo", "MILKA", LocalDate.of(2023, 7, 5)));
        ls.add(new Yogurt(12, "Yogurt", "CHUDO", LocalDate.of(2023, 5, 15)));
        ls.add(new Bread(13, "Ak nan", "TOIBOS", LocalDate.of(2023, 6, 7)));
        ls.add(new Bread(14, "Leposhka", "TOIBOS", LocalDate.of(2023, 7, 7)));
        ls.add(new FLour(15, "MukaKG", "TOIBOS", LocalDate.of(2023, 7, 12)));
        ls.add(new FLour(16, "MukaKZ", "ТULPAR", LocalDate.of(2023, 4, 10)));
        ls.add(new Pasta(17, "Makarony", "NUR", LocalDate.of(2023, 5, 20)));
        ls.add(new Pasta(18, "Lapsha", "NUR", LocalDate.of(2023, 7, 3)));
        ls.add(new Pasta(18, "Lapsha", "NUR", LocalDate.of(2023, 6, 3)));
        ls.add(new Pasta(18, "Lapsha", "NUR", LocalDate.of(2023, 6, 4)));
        productService.sortByDate(ls);
        productService.addProducts(ls);
        productService.getAllProducts("Aksana", "12345");

    }


}