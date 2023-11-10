package ReadSearcUpdatehAndDeletePackage;
import FactoryPackage.ContactInformation;

import java.util.ArrayList;
import java.util.List;

public class SearchingBySurName implements SearchingSystem {
    private List<ContactInformation> UsersThatMatchsBySureName =new ArrayList<>();
    public SearchingBySurName(String surnameToSearch, UserList userList){

        UsersThatMatchsBySureName.clear();
        for (ContactInformation name:userList.getUsersList()
        ) {
            if (name.getSurName().equalsIgnoreCase(surnameToSearch)) {
                UsersThatMatchsBySureName.add(name);
            }
        }
    }

    public void showUserThatMatchsBySurName(){

        if (UsersThatMatchsBySureName.isEmpty()){
            System.out.println("Det finns inga träffar för sökningen");
        }else {
            System.out.println("Här är den eller de träffar som matchar sökningen");

            for(ContactInformation matchUser: UsersThatMatchsBySureName){
                System.out.println(matchUser);
            }
        }
    }

    @Override
    public void showResult() {
showUserThatMatchsBySurName();
    }
}
