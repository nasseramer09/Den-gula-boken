package ReadSearcUpdatehAndDeletePackage;
import FactoryPackage.ContactInformation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DeletingUser implements SearchingSystem {

    private UserList userList;
    public DeletingUser(UserList userList){
        this.userList=userList;
    }


    @Override
    public void showResult() {
showUserThatAreDeleted();
    }

    private List<ContactInformation> deletedUsersContainer =new ArrayList<>();


public void deletingProcess(String userNameToDelete){

    Iterator<ContactInformation>iterator= userList.getUsersList().listIterator();
    while (iterator.hasNext()){

        ContactInformation contactInformation = iterator.next();

        if (contactInformation.getFirstName().equalsIgnoreCase(userNameToDelete)){
            deletedUsersContainer.add(contactInformation);
            userList.addUsersToJunkList(contactInformation);
            iterator.remove();
            System.out.println("Användaren har nu tagits bort från listan");
        }


    }
}
    public void showUserThatAreDeleted(){
        if (deletedUsersContainer.isEmpty()){
            System.out.println("Det finns inga träffar för sökningen");
        }else {

            for(ContactInformation deletedUser: deletedUsersContainer){

                System.out.println("Användaren"+ deletedUser+ "\n har tagits bort från listan" );
            }

        }
    }
}
