package ReadSearcUpdatehAndDeletePackage;
import FactoryPackage.ContactInformation;
import java.util.ArrayList;
import java.util.List;

public class SearchByAddress implements SearchingSystem{


    private List<ContactInformation>UsersThatMatchsByAddress= new ArrayList<>();
    public SearchByAddress(String addressToSearch, UserList userList){

        UsersThatMatchsByAddress.clear();

        for (ContactInformation address:userList.getUsersList()
        ) {
            if (address.getAddress().equalsIgnoreCase(addressToSearch)||
                    address.getCityName().equalsIgnoreCase(addressToSearch)||
                    address.getBuildingNumber().equalsIgnoreCase(addressToSearch)||
                    String.valueOf(address.getZipCode()).equalsIgnoreCase(addressToSearch)){
                UsersThatMatchsByAddress.add(address);
            }else {
                System.out.println("Dubbelkolla att du har skrivit adressen rätt ");
            }
        }
    }
    public void showUsersThatMatchsByAddress(){
        if (UsersThatMatchsByAddress.isEmpty()){

            System.out.println("Det finns inga träffar för sökningen");
        }else {
            System.out.println("Här är de n eller de träffar som matchar sökningen ");

            for (ContactInformation matchAddress:UsersThatMatchsByAddress
                 ) {
                System.out.println(matchAddress);
            }
        }
    }
    @Override
    public void showResult() {
        showUsersThatMatchsByAddress();
    }
}
