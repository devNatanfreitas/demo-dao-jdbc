package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

       /* Department newDepartment = new Department(null, "Josephson");
        departmentDao.insert(newDepartment);
        System.out.println(newDepartment.getId()); */

        System.out.println(); System.out.println();

        Department department = departmentDao.findById(2);
        System.out.println(department);

        department.setName("Dragon");
        departmentDao.update(department);

        System.out.println();  System.out.println();

        System.out.println(departmentDao.findAll());

    }
}
