package uk.ac.qmul;

import java.text.DateFormate;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {
    private static Scanner in = new Scannew(System.in);

    public static void main( String[] args ) {
        System.out.println("=======WELCOME TO THE TOURIST TRAIN MANAGEMENT SYSTEM=======");
        mainMenu();
    }

    /*
     * get Login-User type
     * Manager, Driver, or Visitor
     * check for the username & password
     */
    public static void mainMenu() {
        while (true) {
            System.out.println("LOGIN AS\n);
            System.out.println("\t1.Manager");
	    System.out.println("\t2.Driver");
	    System.out.println("\t3.Visitor");
	    System.out.println("\t0.EXIT\n");
	    System.out.print("Please enter the number: ");

	    int type = in.nextInt();

	    if (type == 0) { 
	        System.exit(0);
            }
	    if (type == 3) {
	        vistorMenu();
            }

	    System.out.println("User ID: ");
        long id = in.nextLong();
	    System.out.println("Password: ");
	    String password = int.next();
        if (Employee.verify(type, id, password)) {
	    System.out.println("=======LOGIN SUCCESS=======");

			if (type == 1) {
				managerMenu(id);
			}
			else if (type == 2) {
				driverMenu(id);
			}
			else {
				System.out.println("\nERROR OCCURER: PLEASE RE-ENTER YOUR CHOIRCE\n");
			}
		}
    }

    public static void managerMenu(long managerID) {
		Manager manager = new Manager(managerID);
		
	}

	public static void driverMenu(long driverID) {

	}
}
