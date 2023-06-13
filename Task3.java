package Assignments;

import java.util.Scanner;

public class Task3 {


	    private String name;
	    private String email;
	    private String phone;
	    private String address;
	    private String status;

	    public Task3(String name, String email, String phone, String address, String status) {
	        this.name = name;
	        this.email = email;
	        this.phone = phone;
	        this.address = address;
	        this.status = status;
	    }

	    public String getName() {
	        return name;
	    }

	    public void printInformation() {
	        System.out.println("Name: " + name);
	        System.out.println("Email: " + email);
	        System.out.println("Phone: " + phone);
	        System.out.println("Address: " + address);
	        System.out.println("Status: " + status);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of students: ");
	        int numStudents = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character

	        Task3[] students = new Task3[numStudents];

	        for (int i = 0; i < numStudents; i++) {
	            System.out.println("Enter information for Student " + (i + 1) + ":");

	            System.out.print("Name: ");
	            String name = scanner.nextLine();

	            System.out.print("Email: ");
	            String email = scanner.nextLine();

	            System.out.print("Phone: ");
	            String phone = scanner.nextLine();

	            System.out.print("Address: ");
	            String address = scanner.nextLine();

	            System.out.print("Status: ");
	            String status = scanner.nextLine();

	            students[i] = new Task3(name, email, phone, address, status);
	            System.out.println();
	        }

	        System.out.print("Enter the index of the student to fetch information: ");
	        int index = scanner.nextInt();
	        scanner.close();

	        if (index >= 0 && index < numStudents) {
	            System.out.println("\nInformation for Student " + (index + 1) + ":");
	            students[index].printInformation();
	        } else {
	            System.out.println("Invalid index entered!");
	        }
	    }
	}