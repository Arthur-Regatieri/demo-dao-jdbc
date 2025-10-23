package application;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
public class App {
    public static void main(String[] args) throws Exception {
        Department obj = new Department(1, "Books");

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse("14/12/2000", fmt);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = new Seller(21, "bob", "bob@gmail.com", date, 3000.0, obj);
        
        System.out.println(seller);
    }
}
