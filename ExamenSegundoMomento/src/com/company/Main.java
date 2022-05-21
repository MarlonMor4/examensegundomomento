package com.company;
import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner inputData = new Scanner(System.in);
        int v1, v3, v4;
        String answer = "Yes";
        List<Watchman> watchmans = new ArrayList<>();
        List<Accountant> accountants = new ArrayList<>();
        List<Admin> admins = new ArrayList<>();
        List<Cleaning> cleanings = new ArrayList<>();

        while (answer.equals("Yes")) {


            System.out.println("    list of personnel");
            System.out.println("  1.     Watchman ");
            System.out.println("  2.     Accountant ");
            System.out.println("  3.     Admin ");
            System.out.println("  4.     Cleaning ");
            System.out.println("Enter the number of the staff you want to register");
            v1 = inputData.nextInt();

            if (v1 == 1) {
                Watchman person = new Watchman();
                System.out.println("Enter name: ");
                person.setName(inputData.next());
                System.out.println("Enter identification: ");
                person.setIdentification(inputData.next());
                System.out.println("Enter age: ");
                person.setAge(inputData.nextInt());
                System.out.println("Enter weapon");
                person.setWeapon((inputData.next()));
                System.out.println("Enter WorkDay");
                person.setWorkDay((inputData.next()));
                watchmans.add(person);


            } else if (v1 == 2) {
                Accountant person1 = new Accountant();
                System.out.println("Enter name: ");
                person1.setName(inputData.next());
                System.out.println("Enter identification: ");
                person1.setIdentification(inputData.next());
                System.out.println("Enter age: ");
                person1.setAge(inputData.nextInt());
                System.out.println("Enter Leader");
                person1.setLeader((inputData.next()));
                System.out.println("Enter parking");
                person1.setParking((inputData.next()));
                accountants.add(person1);
            } else if (v1 == 3) {
                Admin person1 = new Admin();
                System.out.println("Enter name: ");
                person1.setName(inputData.next());
                System.out.println("Enter identification: ");
                person1.setIdentification(inputData.next());
                System.out.println("Enter age: ");
                person1.setAge(inputData.nextInt());
                System.out.println("Enter Leader");
                person1.setLeader((inputData.next()));
                System.out.println("Enter parking");
                person1.setParking((inputData.next()));
                admins.add(person1);
            } else if (v1 == 4) {

                Cleaning person1 = new Cleaning();
                System.out.println("Enter name: ");
                person1.setName(inputData.next());
                System.out.println("Enter identification: ");
                person1.setIdentification(inputData.next());
                System.out.println("Enter age: ");
                person1.setAge(inputData.nextInt());
                System.out.println("Enter Dayoff");
                person1.setDayOff((inputData.next()));
                cleanings.add(person1);

            }


            System.out.println("¿you want to enter other personnel? Yes - NO");
            String stop = inputData.next();

            if (stop.equalsIgnoreCase("no")) {
                answer = "no"; //break; es otra forma de pararlo
            }
        }
        while (answer.equals("Yes")) {
            System.out.println("Identifique su funcion: ");
            System.out.println("1: Watchman");
            System.out.println("2: Accountant");
            System.out.println("3: Admin");
            System.out.println("4: Cleaning");
            int person = inputData.nextInt();
            switch (person) {
                case 1 -> {
                    for (int i = 0; i < watchmans.size(); i++) {

                        System.out.println("Name: " + watchmans.get(i).getName());
                        System.out.println("identification: " + watchmans.get(i).getIdentification());
                        System.out.println("age: " + watchmans.get(i).getIAge());
                        System.out.println("workday: " + watchmans.get(i).getWorkDay());
                        System.out.println("weapon: " + watchmans.get(i).getWeapon());
                        break;
                    }
                }
                case 2 -> {
                    for (int i = 0; i < accountants.size(); i++) {

                        System.out.println("Name: " + accountants.get(i).getName());
                        System.out.println("identification: " + accountants.get(i).getIdentification());
                        System.out.println("age: " + accountants.get(i).getIAge());
                        System.out.println("leader: " + accountants.get(i).getLeader());
                        System.out.println("parking: " + accountants.get(i).getParking());
                        break;
                    }
                }
                case 3 -> {
                    for (int i = 0; i < admins.size(); i++) {

                        System.out.println("Name: " + admins.get(i).getName());
                        System.out.println("identification: " + admins.get(i).getIdentification());
                        System.out.println("age: " + admins.get(i).getIAge());
                        System.out.println("workday: " + admins.get(i).getLeader());
                        System.out.println("weapon: " + admins.get(i).getParking());
                        break;
                    }
                }
                case 4 -> {
                    for (int i = 0; i < cleanings.size(); i++) {

                        System.out.println("Name: " + cleanings.get(i).getName());
                        System.out.println("identification: " +  cleanings.get(i).getIdentification());
                        System.out.println("age: " + cleanings.get(i).getIAge());
                        System.out.println("workday: " + cleanings.get(i).getDayOff());
                       break;
                    }
                }
            }



            System.out.println("¿you want to consult another base? Yes - NO");
            String stop = inputData.next();

            if (stop.equalsIgnoreCase("no")) {
                answer = "no"; //break; es otra forma de pararlo
            }

        }
    }
}