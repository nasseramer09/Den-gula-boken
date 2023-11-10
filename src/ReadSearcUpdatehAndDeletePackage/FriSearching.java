package ReadSearcUpdatehAndDeletePackage;
import FactoryPackage.ContactInformation;

import java.util.ArrayList;
import java.util.List;
public class FriSearching implements SearchingSystem {
    private List<ContactInformation>SearchThatMatchsFriSearch=new ArrayList<>();

  public FriSearching(String wordToSearch, UserList userList){
      SearchThatMatchsFriSearch.clear();
      for (ContactInformation freeText : userList.getUsersList()
      ) {
          if (searchWordExistensController(freeText,wordToSearch)){
              SearchThatMatchsFriSearch.add(freeText);
          }
      }
  }
    private boolean searchWordExistensController(ContactInformation contactInformation, String wordToSearch){

        String firsName=contactInformation.getFirstName();
        String surName=contactInformation.getSurName();
        String age=String.valueOf(contactInformation.getAge());
        String mobileNumber=contactInformation.getPhoneNumber();
        String telefonNumber=contactInformation.getOptionalPhoneNumber();
        String address= contactInformation.getAddress();
        String city=contactInformation.getCityName();
        String zipCode=String.valueOf(contactInformation.getZipCode());

        return firsName.contains(wordToSearch)||surName.contains(wordToSearch)||age.contains(wordToSearch)||
                mobileNumber.contains(wordToSearch)||telefonNumber.contains(wordToSearch)||address.contains(wordToSearch)||
                city.contains(wordToSearch)||zipCode.contains(wordToSearch);
    }
    public void showStatementsThatMatchs(){

        if (SearchThatMatchsFriSearch.isEmpty()){
            System.out.println("Det finns inga träffar för sökningen");
        }else {
            System.out.println("Här är den eller de träffar som matchar sökningen");

          for(ContactInformation matchingSearch: SearchThatMatchsFriSearch) {
              System.out.println(matchingSearch);
          }
        }
    }
    @Override
    public void showResult() {
        showStatementsThatMatchs();
    }
}
