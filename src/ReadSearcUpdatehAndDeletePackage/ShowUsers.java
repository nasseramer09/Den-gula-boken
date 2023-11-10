package ReadSearcUpdatehAndDeletePackage;

import FactoryPackage.ContactInformation;
public class ShowUsers {
    UserList userList = UserList.getInstance();

    public void showUsers(){

        if (userList.getUsersList().isEmpty()){
            System.out.println("Det finns inga kontakter sparades i listan\n välkommen åter");
        } else {
            for (ContactInformation contacts: userList.getUsersList()
            ) {
                System.out.println(contacts);
            }
        }
    }
}
