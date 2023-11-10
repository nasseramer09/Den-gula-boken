package ReadSearcUpdatehAndDeletePackage;
import FactoryPackage.ContactInformation;
import java.util.ArrayList;
import java.util.List;
public class SearchingByFirstName implements SearchingSystem {
    private List<ContactInformation> UsersThatMatchsByFirstName =new ArrayList<>();
    public SearchingByFirstName(String firstnameToSearch, UserList userList) {
        UsersThatMatchsByFirstName.clear();
        for (ContactInformation name:userList.getUsersList()
        ) {
            if (name.getFirstName().equalsIgnoreCase(firstnameToSearch)) {
                UsersThatMatchsByFirstName.add(name);
            }
        }

    }
    public void showUserThatMatchsByFirstName(){

        if (UsersThatMatchsByFirstName.isEmpty()){
            System.out.println("Det finns inga träffar för sökningen");
        }else {
            System.out.println("Här är den eller de träffar som matchar sökningen");

            for(ContactInformation matchUser: UsersThatMatchsByFirstName){
                System.out.println(matchUser);
            }
        }
    }

    @Override
    public void showResult() {


        showUserThatMatchsByFirstName();
    }
}



