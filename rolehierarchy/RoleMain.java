package rolehierarchy;

import java.util.Scanner;

import rolehierarchy.addroot.AddRootView;
import rolehierarchy.addsubrole.AddSubRoleView;
import rolehierarchy.dto.RoleManagement;

public class RoleMain {
	public static RoleManagement rootRole;
	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		RoleMain main = new RoleMain();
		main.initialize();
	}

	public void initialize() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\t\t----------------------");
		System.out.println("\t\t RoleHierarchy..!");
		System.out.println("\t\t----------------------");
		boolean flag = true;
		while (flag) {
			System.out.println(
					" 1 == AddRoot \n 2 == AddSubRole \n 0 == Exit ");
			System.out.println("Enter Option : ");
			int choise = scanner.nextInt();

			switch (choise) {
			case 1:
				AddRootView addRootView = new AddRootView();
				addRootView.start();
				break;

			case 2:
				AddSubRoleView addSubRoleView = new AddSubRoleView();
				addSubRoleView.start();
				break;

			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 8.");
				break;
			}
		}
	}

}
