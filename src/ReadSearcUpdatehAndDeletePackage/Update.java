package ReadSearcUpdatehAndDeletePackage;

import FactoryPackage.ContactInformation;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Update {
    Scanner sc = new Scanner(System.in);
    private List<ContactInformation>newUpdatedUserList = new ArrayList<>();
    UserList userList=UserList.getInstance();
    public List<ContactInformation>doUpdate(String upadateUsing){
        newUpdatedUserList.clear();
        for (ContactInformation profiles:userList.getUsersList()
        ) {

            if (profiles.getFirstName().equalsIgnoreCase(upadateUsing)){
                List<ContactInformation>newUpdatedUserList=findIdenticalUsers(upadateUsing);
                if (newUpdatedUserList.isEmpty()){
                    System.out.println("Inga användare hittades med detta namn");
                } else if (newUpdatedUserList.size()==1) {
                    ContactInformation userToUpdate = newUpdatedUserList.get(0);
                    userList.addUsersToJunkList(userToUpdate);

                    System.out.println("Välj\n " +
                            "[1] för att redigera förnamn\n" +
                            "[2] för att redigera efternamnet\n" +
                            "[3] för att redigera ålder\n" +
                            "[4] för att redigera mobilnummer\n" +
                            "[5] för att redigera telefonnummer\n" +
                            "[6] för att redigera gatunamn\n" +
                            "[7] för att redigera portnummer\n" +
                            "[8] för att redigera ort\n" +
                            "[9] för att redigera postnummer\n");

                    int userCaseNumber= sc.nextInt();
                    sc.nextLine();
                    switch (userCaseNumber){
                        case 1:
                            System.out.println("Skriv in nya eller omredigerat förnamn här: ");
                            String updatedFirstName=sc.nextLine();
                            userToUpdate.setFirstName(updatedFirstName);
                            break;
                        case 2:
                            System.out.println("Skriv in nya eller omredigerat efternamn här: ");
                            String updatedSurName=sc.nextLine();
                            userToUpdate.setSurName(updatedSurName);
                            break;
                        case 3:
                            System.out.println("Skriv in nya eller omredigerat ålder här: ");
                            int updatedage=sc.nextInt();
                            userToUpdate.setAge(updatedage);
                            break;
                        case 4:
                            System.out.println("Skriv in nya eller omredigerat mobilnummer här: ");
                            String updatedMobileNumber=sc.nextLine();
                            userToUpdate.setPhoneNumber(updatedMobileNumber);
                            break;

                        case 5:
                            System.out.println("Skriv in nya eller omredigerat telefonnummer/ extra mobilnummer här: ");
                            String updatedOptionalNumber=sc.nextLine();
                            userToUpdate.setOptionalPhoneNumber(updatedOptionalNumber);
                            break;

                        case 6:
                            System.out.println("Skriv in nya eller omredigerat gatunamn här: ");
                            String updatedStreetName=sc.nextLine();
                            userToUpdate.setAddress(updatedStreetName);
                            break;
                        case 7:
                            System.out.println("Skriv in nya eller omredigerat portnummer här: ");
                            String updatedBuildingNumber=sc.nextLine();
                            userToUpdate.setBuildingNumber(updatedBuildingNumber);
                            break;
                        case 8:
                            System.out.println("Skriv in nya eller omredigerat ort här: ");
                            String updatedCityName=sc.nextLine();
                            userToUpdate.setCityName(updatedCityName);
                            break;
                        case 9:
                            System.out.println("Skriv in nya eller omredigerat postkod här: ");
                            int updatedZipCod=sc.nextInt();
                            userToUpdate.setZipCode(updatedZipCod);

                            break;

                    }


                } else {
                    System.out.println("Fler användare som har samma beskrivning hittades! \n" +
                            "Var god och ange den specifike användaren du försöker ändra uppgifter oms efternamn  ");
                    String moreInfoEfternamn= sc.nextLine();
                    for (ContactInformation filteredNames:newUpdatedUserList
                    ) {
                        if (filteredNames.getSurName().equalsIgnoreCase(moreInfoEfternamn)){
                            newUpdatedUserList.clear();
                            newUpdatedUserList.add(filteredNames);

                            System.out.println("Välj ett alternativ\n " +
                                    "[1] för att redigera förnamn\n" +
                                    "[2] för att redigera efternamnet\n" +
                                    "[3] för att redigera ålder\n" +
                                    "[4] för att redigera mobilnummer\n" +
                                    "[5] för att redigera telefonnummer\n" +
                                    "[6] för att redigera gatunamn\n" +
                                    "[7] för att redigera portnummer\n" +
                                    "[8] för att redigera ort\n" +
                                    "[9] för att redigera postnummer\n");
                            int userCaseNumber= sc.nextInt();
                            sc.nextLine();
                            switch (userCaseNumber){
                                case 1:
                                    System.out.println("Skriv in nya eller omredigerat förnamn här: ");
                                    String updatedFirstName=sc.nextLine();
                                    filteredNames.setFirstName(updatedFirstName);
                                    break;
                                case 2:
                                    System.out.println("Skriv in nya eller omredigerat efternamn här: ");
                                    String updatedSurName=sc.nextLine();
                                    filteredNames.setSurName(updatedSurName);
                                    break;
                                case 3:
                                    System.out.println("Skriv in nya eller omredigerat ålder här: ");
                                    int updatedage=sc.nextInt();
                                    filteredNames.setAge(updatedage);
                                    break;
                                case 4:
                                    System.out.println("Skriv in nya eller omredigerat mobilnummer här: ");
                                    String updatedMobileNumber=sc.nextLine();
                                    filteredNames.setPhoneNumber(updatedMobileNumber);
                                    break;

                                case 5:
                                    System.out.println("Skriv in nya eller omredigerat telefonnummer/ extra mobilnummer här: ");
                                    String updatedOptionalNumber=sc.nextLine();
                                    filteredNames.setOptionalPhoneNumber(updatedOptionalNumber);
                                    break;

                                case 6:
                                    System.out.println("Skriv in nya eller omredigerat gatunamn här: ");
                                    String updatedStreetName=sc.nextLine();
                                    filteredNames.setAddress(updatedStreetName);
                                    break;
                                case 7:
                                    System.out.println("Skriv in nya eller omredigerat portnummer här: ");
                                    String updatedBuildingNumber=sc.nextLine();
                                    filteredNames.setBuildingNumber(updatedBuildingNumber);
                                    break;
                                case 8:
                                    System.out.println("Skriv in nya eller omredigerat ort här: ");
                                    String updatedCityName=sc.nextLine();
                                    filteredNames.setCityName(updatedCityName);
                                    break;
                                case 9:
                                    System.out.println("Skriv in nya eller omredigerat postkod här: ");
                                    int updatedZipCod=sc.nextInt();
                                    filteredNames.setZipCode(updatedZipCod);
                                    break;

                            }

                        }
                    }


                }

            }}

        return newUpdatedUserList;
    }

    private List<ContactInformation>findIdenticalUsers(String name){

        List<ContactInformation> matchingUsersWithTheSameDetails = new ArrayList<>();
        for (ContactInformation fornamn: UserList.getInstance().getUsersList()
        ) {
            if (fornamn.getFirstName().equalsIgnoreCase(name)){
                matchingUsersWithTheSameDetails.add(fornamn);
            }
        }
        return matchingUsersWithTheSameDetails;
    }

}

