package Assignments;

import java.util.ArrayList;
import java.util.List;

    public class Trainer {
        private String name;
        private String department;
        private String email;
        private int id;

        public Trainer(String name, String department, String email, int id) {
            this.name = name;
            this.department = department;
            this.email = email;
            this.id = id;
        }

        public void teach() {
            if (department.equals("Selenium")) {
                System.out.println("Trainer can teach Selenium");
            } else if (department.equals("DevOps")) {
                System.out.println("Trainer can teach DevOps");
            } else if (department.equals("Web Development")) {
                System.out.println("Trainer can teach Web Development");
            } else {
                System.out.println("Trainer can teach unknown subject");
            }
        }

        public static void main(String[] args) {
            Trainer trainer1 = new Trainer("Mukesh", "Testing", "mukesh@gmail.com", 1);
            Trainer trainer2 = new Trainer("Hitesh", "Dev", "hitesh@gmail.com", 2);
            Trainer trainer3 = new Trainer("Mukesh", "DevOps", "mukesh@gmail.com", 3);

            Trainer[] trainers = { trainer1, trainer2, trainer3 };

            for (Trainer trainer : trainers) {
                System.out.println("Trainer Name: " + trainer.name);
                System.out.println("Department: " + trainer.department);
                System.out.println("Email: " + trainer.email);
                System.out.println("ID: " + trainer.id);
                trainer.teach();
                System.out.println();
            }
        }
    }
