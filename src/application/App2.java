package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

public class App2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();


        System.out.println("=== TEST 1: Department insert ===");
        Department department = new Department(null, "objetos");
        departmentDao.insert(department);
        System.out.println("Inserted! New id = " + department.getId());

        System.out.println("=== TEST 2: Department findById ===");
        department = departmentDao.findById(1);
        System.out.println(department);

        System.out.println("=== TEST 3: Department update ===");
        department = departmentDao.findById(1);
        department.setName("Pants");
        departmentDao.update(department);

        System.out.println("=== TEST 4: Department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department department2 : list) {
            System.out.println(department2);   
        }

        System.out.println("=== TEST 5: Department delete ===");
        System.out.println("Digite o id do departamento: ");
        int n = scanner.nextInt();
        departmentDao.deleteById(n);
        System.out.println("Delete completed");

    }    
}
