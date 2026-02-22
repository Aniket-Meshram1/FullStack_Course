package com.employee_management_system.zoho;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

/**
 * Hello world!
 */
public class App {
	public static Scanner sc;
	static Configuration conf = null;

	static SessionFactory sf = null;
	static Session s = null;
	static Transaction t = null;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		sf = conf.buildSessionFactory();
		s = sf.openSession();
		t = s.beginTransaction();

		boolean istrue = true;
		while (istrue) {
			System.out.println("1. Get Employee Details :");
			System.out.println("2. Create Employee :");
			System.out.println("3. Delete Employee");
			System.out.println("4. Update Employee");
			System.out.println("5. Exit");
			int ch = sc.nextInt();
			sc.nextLine();

			switch (ch) {
			case 1:
				System.out.println(get());
				t.commit();
				break;
			case 2:
				insert();
				t.commit();
				break;
			case 3:
				delete();
				t.commit();
				break;
			case 4:
				update();
				break;
			case 5:
				istrue = false;
				break;
			default:
				System.out.println("Enter Valid choice..........");

			}
		}

		sf.close();
		s.close();

	}

	public static Employee get() {
		System.out.println("Enter Employee Id :");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("----------Employee Details-------------");
		Employee e = s.get(Employee.class, id);
		return e;

	}

	public static void insert() {
		System.out.println("Enter the Name Of Employee :");
		String name = sc.nextLine();
		System.out.println("Enter Salary : ");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Phone Number : ");
		String phoneNumber = sc.nextLine();
		System.out.println("Enter Email : ");
		String email = sc.nextLine();
		System.out.println("Enter type of Employee : ");
		String type = sc.nextLine();
		Employee emp = new Employee(name, salary, phoneNumber, email, type);
		s.persist(emp);
		System.out.println("Data inserted Successfully!!!!!!!!!!!!!");
	}

	public static void delete() {
		System.out.println("Enter Employee id to delete : ");
		int empid = sc.nextInt();
		Employee e1 = s.get(Employee.class, empid);
		if (e1 != null) {
			s.remove(e1);
			System.out.println("Empoyee Deleted....");
		} else {
			System.out.println();
		}

	}

	public static void update() {
		System.out.println("Enter Employee Id : ");
		int id = sc.nextInt();
		Employee e = s.get(Employee.class, id);
		if (e != null) {
			System.out.println("Enter the Name Of Employee :");
			String name = sc.nextLine();
			System.out.println("Enter Salary : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Phone Number : ");
			String phoneNumber = sc.nextLine();
			System.out.println("Enter Email : ");
			String email = sc.nextLine();
			System.out.println("Enter type of Employee : ");
			String type = sc.nextLine();
			e.setName(name);
			e.setSalary(salary);
			e.setPhoneNo(phoneNumber);
			e.setEmail(email);
			e.setType(type);
		}
	}
}
