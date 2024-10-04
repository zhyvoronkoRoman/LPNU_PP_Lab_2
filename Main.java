package Main;
import Patient.Patient;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;
        System.out.print("If you want fill array by yourself press 1 or if you want program do it press 2:");
        option = scan.nextInt();
        System.out.println("Enter a number of patients: ");
        int Pnum = scan.nextInt();//number of patients
        Patient[] patients = new Patient[Pnum];
        switch (option) {
            case 1:
                int pid, medcardnum, pnum;
                String surname, name, midName, address, diagnosis;
                // Filling the array of objects
                for (int i = 0; i < patients.length; i++) {
                    System.out.println("Enter patient info:");
                    System.out.println("Enter patient id:");
                    pid = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter patient surname:");
                    surname = scan.nextLine();
                    System.out.println("Enter patient name:");
                    name = scan.nextLine();
                    System.out.println("Enter patient midname:");
                    midName = scan.nextLine();
                    System.out.println("Enter patient address:");
                    address = scan.nextLine();
                    System.out.println("Enter patient phone number:");
                    pnum = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter patient med card num:");
                    medcardnum = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter patient diagnosis:");
                    diagnosis = scan.nextLine();
                    patients[i] = new Patient(pid, surname, name, midName, address, pnum, medcardnum, diagnosis);
                }
                break;
            case 2:
                for (int j = 0; j < patients.length; j++) {
                    patients[j] = new Patient(
                            j + 1,                      // Patient.Patient ID
                            "Surname" + (j + 1),        // Patient.Patient Surname
                            "Name" + (j + 1),           // Patient.Patient Name
                            "MidName" + (j + 1),        // Patient.Patient Midlename
                            "Address " + (j + 1),       // Patient.Patient Address
                            1234567 + j,                // Patient.Patient Phone Number
                            1000 + j,                   // Patient.Patient Med. Card Number
                            "Diagnosis" + (j + 1)       // Patient.Patient Diagnosis
                    );
                }
                break;
            default: System.out.println("wrong option!");

        }
        int choise;
        //MENU
        while (true) {
            System.out.println("\t\tMENU");
            System.out.println("1.Find patients by med card interval");
            System.out.println("2.Find patients by diagnosis");
            System.out.println("3.Find patients by first dig of phone number");
            System.out.println("4.Print all patients");
            System.out.println("5.EXIT");
            System.out.print("Enter option:");
            choise = scan.nextInt();
            if(choise<0 || choise>5){
                System.out.println("Wrong option");}
            switch (choise) {
                case 4:
                    for (int j = 0; j < patients.length; j++) {
                        System.out.println(patients[j]);
                        System.out.println("\n-------------------\n");
                    };
                    break;
                case 1:
                    medCard_interval(patients);
                    break;
                case 2:
                    diagnosis_check(patients);
                    break;
                case 3:
                    phone_num_found(patients);
                    break;
                case 5:
                    scan.close();
                    return;
            }

        }
    }
    //Method to find patient by diagnosis
    public static void diagnosis_check(Patient[] patients){
        System.out.println("What diagnosis do you want to find: ");
        Scanner scan = new Scanner(System.in);
        String diagnosis = scan.nextLine();
        for (int i = 0;i< patients.length;i++) {
            if(diagnosis.equalsIgnoreCase(patients[i].getDiagnosis())){
                System.out.println(patients[i]);
                System.out.println("\n-------------------\n");
            }
            else System.out.println("No matches found");
        }
        scan.close();
    }
    //Method to find patients by interval of med cards
    public static void medCard_interval(Patient[] patients) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Set first med card interval: ");
        int interval1 = scan.nextInt();
        System.out.println("Set second med card interval: ");
        int interval2 = scan.nextInt();
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].getMedCardNum() >= interval1 && patients[i].getMedCardNum() <= interval2) {
                System.out.println(patients[i]);
                System.out.println("\n-------------------\n");
            }
        }
        scan.close();
    }
    //Method to find patient by first dig of phone number
    public static void phone_num_found(Patient[] patients){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first digit:");
        int dig = scan.nextInt(), firstDig, count = 0;
        String pNumString;
        for(int i = 0;i< patients.length;i++) {
            pNumString = Integer.toString(patients[i].getpNumber());//integet to string
            firstDig = Character.getNumericValue(pNumString.charAt(0));//geting first digit
            if (dig == firstDig){
                System.out.println(patients[i].toString());
                System.out.println("\n-------------------\n");
                count++;
            }
        }
        System.out.println("Number of patients whith this hone number"+count);
        scan.close();
    }
}