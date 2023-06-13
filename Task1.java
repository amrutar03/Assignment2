package Assignments;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    private String name;
    private String department;
    private String email;
    private int id;

    public Task1(String name, String department, String email, int id) {
        this.name = name;
        this.department = department;
        this.email = email;
        this.id = id;
    }

    public void teach() {
        if (department.equals("Selenium")) {
            System.out.println("Trainer " + name + " can teach Selenium");
        } else if (department.equals("Web Development")) {
            System.out.println("Trainer " + name + " can teach Web Development");
        } else if (department.equals("DevOps")) {
            System.out.println("Trainer " + name + " can teach DevOps");
        } else {
            System.out.println("Trainer " + name + " can teach an unknown subject");
        }
    }
        public static void main(String[] args) {
        	Task1 trainer1 = new Task1("Mukesh", "Testing", "mukesh@gmail.com", 1);
        	Task1 trainer2 = new Task1("Hitesh", "Dev", "hitesh@gmail.com", 2);
        	Task1 trainer3 = new Task1("Mukesh", "DevOps", "mukesh@gmail.com", 3);

            trainer1.teach();
            trainer2.teach();
            trainer3.teach();
        }
    }
