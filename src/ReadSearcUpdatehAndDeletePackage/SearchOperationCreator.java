package ReadSearcUpdatehAndDeletePackage;

import java.util.Scanner;

public class SearchOperationCreator {
private UserList userList;
public SearchOperationCreator(UserList userList){
    this.userList=userList;
}
    Scanner sc =new Scanner(System.in);

    public SearchingSystem createSearchingFacrtory(String searchOperationTyp) {
        try {



                switch (searchOperationTyp) {

                    case "förnamn":
                        System.out.println("Skriv in förnamnet på den personen du söker efter");
                        String firstnameToSearch = sc.nextLine();
                        return new SearchingByFirstName(firstnameToSearch,userList);


                        case "efternamn":
                        System.out.println("Skriv in efternamn på de personen du söker efter");
                        String surnameToSearch = sc.nextLine();
                        return new SearchingBySurName(surnameToSearch, userList);


                    case "adress":
                        System.out.println("Skriv in adressen du söker after\n Det kan vara gatunamn ort eller post koden");
                        String addressToSearch = sc.nextLine();
                        return new SearchByAddress(addressToSearch, userList);

                    case "fri":
                        System.out.println("Skriv in fri text ");
                        String statementToSearch = sc.nextLine();
                        return new FriSearching(statementToSearch, userList);

                    case "tillbaka":

                           break;


                    default:
                        throw new IllegalStateException("Unexpected value: " + searchOperationTyp);
                }}catch (IllegalStateException e){
            System.out.println("Försök att följa instruktionerna" + e.getMessage());
        }

        return null;
    }
}
