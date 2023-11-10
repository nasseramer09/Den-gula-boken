package ReadSearcUpdatehAndDeletePackage;
import FactoryPackage.ContactInformation;
import java.util.ArrayList;
import java.util.List;
public class UserList {

    private static UserList instance;
    private List<ContactInformation>usersList;




public void addUsersToJunkList(ContactInformation contactInformation){
        junkList.add(contactInformation);
}

public void showJunkList(){
    for (ContactInformation junkProfiles:junkList
         ) {
        System.out.println("Här är användare som antingen har redigerats eller tagits bort från listan");
        System.out.println(junkProfiles);
    }
}
    private List<ContactInformation>junkList;

    public List<ContactInformation> getUsersList() {
        return usersList;
    }

    private   UserList(){

        usersList = new ArrayList<>();
        junkList=new ArrayList<>();
    }
    public static UserList getInstance(){
        if (instance==null){
            instance=new UserList();
        }
        return instance;
    }

    public void addUser(ContactInformation contactInformation){

        if (usersList.contains(contactInformation)){
            System.out.println("Profilen du tänker lägga till finns redan");
        }else {
            usersList.add(contactInformation);
        }


    }


}
