package rolehierarchy.addsubrole;

import rolehierarchy.RoleMain;

public class AddSubRoleView {
	AddSubRoleViewModel level2ViewModel;
	public AddSubRoleView()
	{
		level2ViewModel=new AddSubRoleViewModel();
	}
	public void start()
	{
		System.out.println("Enter subRole : ");
		String subRole=RoleMain.scanner.nextLine();
		System.out.println("Enter ReportingRole : ");
		String root=RoleMain.scanner.nextLine();
		level2ViewModel.addSubRole(RoleMain.rootRole,subRole,root);
	}

}
