package ClientInteraction;
import FactoryPackage.UserProfileCreator;
import ReadSearcUpdatehAndDeletePackage.*;

import java.util.Scanner;

public class ClientPage {

    private boolean adminIsLoggedIn=false;
    private String adminPassword;
    public ClientPage(){
adminPassword="";
    }


    public void UserInteraction(){

        SearchingSystem searchingOperation;
        UserList userList = UserList.getInstance();
        Update update = new Update();
        ShowUsers showUsers = new ShowUsers();
        DeletingUser deletingUser = new DeletingUser(UserList.getInstance());
        Scanner sc = new Scanner(System.in);
        boolean programIsRuning=true;

        System.out.println("Om du loggar in som admin välj ett lösenord först\n Skriv ditt lösenord här");
        adminPassword=sc.nextLine();
        while (programIsRuning){

        System.out.println("Vara god och ange \n " +
                "[Admin] om du vill logga in som administrator\n" +
                " [Kontakter] om du vill se eller söka efter sparade kontakter \n" +
                " [Quit] om du vill avsluta programmet ");
                   String userType= sc.nextLine();
        //Admin
        if (userType!=null&&userType.equalsIgnoreCase("admin")){

            System.out.println("Ange lösenord");

               String newadminPassword=sc.nextLine();

               if (adminPassword.equalsIgnoreCase(newadminPassword)){
                    adminIsLoggedIn=true;

                    while (adminIsLoggedIn){
                System.out.println("Välkommen! \n Följ instruktionerna nedan\n" +
                        "Tryck [1] för att lägga till kontaktuppgifter\n" +
                        "Tryck [2] för att se sparade användaren i listan\n" +
                        "Tryck [3] för att söka efter en användaren i listan\n" +
                        "Tryck [4] för att redigera en användare \n" +
                        "Tryck [5] för att ta bort en användare från listan \n" +
                        "Tryck [6] för att se borttagna/ gamla användare från listan \n" +
                        "Tryck [7] för att återgå till huvudmenyn \n" +
                        "Tryck [8] för att avsluta programmet ");

                int adminChoice = sc.nextInt();
                    sc.nextLine();
                switch (adminChoice){
                    case 1:

                        if (adminIsLoggedIn){
                        System.out.println("Förnamn: ");
                        String firstname = sc.nextLine();
                        System.out.println("Efternamn: ");
                        String sureName=sc.nextLine();
                        System.out.println("Ålder: ");
                         int age=sc.nextInt();
                         sc.nextLine();
                        System.out.println("Mobilnummer: ");
                         String phoneNumber=sc.nextLine();
                        System.out.println("(Frivilligt) telefonnummer: ");
                        sc.nextLine();
                         String optionalPhoneNumber=" ";
                        System.out.println("Gatunamn: ");
                         String address=sc.nextLine();
                        System.out.println("Port nummer: ");
                         String buildingNumber=sc.nextLine();
                        System.out.println("Ort: ");
                         String cityName=sc.nextLine();
                        System.out.println("Postnummer: ");
                         int zipCode=sc.nextInt();
                        UserProfileCreator userProfileCreator = new UserProfileCreator(firstname, sureName , age,
                                phoneNumber, optionalPhoneNumber ,address, buildingNumber, cityName, zipCode);
                        UserList.getInstance().addUser(userProfileCreator);
                        sc.nextLine();
                        }
                        else {
                            System.out.println("Felaktig inmatning");
                            System.exit(0);
                        }
                        break;

                    case 2:
                        showUsers.showUsers();
                        break;

                    case 3:

                            System.out.println("Skriv in \n " +
                                               "[förnamn] om du vill söka på förnamn\n" +
                                               "[efternamn] om du vill söka på efternamn\n" +
                                               "[adress] om du vil söka på adress\n" +
                                               "[fri] om du vill söka på efternamn\n" );

                                   String name=sc.nextLine();
                                   SearchOperationCreator searchOperationCreator = new SearchOperationCreator(UserList.getInstance());
                                   searchingOperation = searchOperationCreator.createSearchingFacrtory(name);
                                    if (searchingOperation!=null){
                                        searchingOperation.showResult();
                                    }else {
                                        System.out.println("Fel! \n försök att följa instruktionerna \n " +
                                                "välj (förnamn , efternamn, adress eller fri)");
                                    }
                                    break;
                    case 4:



                        if (adminIsLoggedIn){
                            System.out.println("Skriv in profilens namn som ska redigeras här:  ");
                            String updateUsing= sc.nextLine();
                            update.doUpdate(updateUsing);

                          }
                        else {
                            System.out.println("Felaktig inmatning");
                            return;
                        }

                        break;

                    case 5:


                        if (adminIsLoggedIn){
                            System.out.println("Skriv profilens förnamn : ");
                            String personToDelete=sc.nextLine();

                            deletingUser.deletingProcess(personToDelete);
                            }
                        else {
                            System.out.println("Felaktig inmatning");
                            System.exit(0);
                        }

                        break;

                    case 6:
                        userList.showJunkList();

                        break;

                    case 7:

                        System.out.println("Du loggas ut från admin rollen");
                             adminIsLoggedIn=false;
                             break;
                    case 8:
                        System.out.println("Programmet avslutas");
                        adminIsLoggedIn=false;
                        programIsRuning=false;
                        break;
                    default:
                        System.out.println("Något gick fel");
                        break;
                }
        }}
        }



        //Gäst användare
        else if (userType != null && userType.equalsIgnoreCase("Kontakter")) {

            while (programIsRuning){
                System.out.println("Välj\n" +
                        "[1] för att se sparade användarna\n" +
                        "[2] för att söka efter en profile i listan\n" +
                        "[3] för att avsluta programmet");
                 int guestInput= sc.nextInt();
                  sc.nextLine();
                 switch (guestInput){
                    case 1:
                        showUsers.showUsers();
                        break;
                    case 2:
                        System.out.println("Skriv in \n " +
                                "[förnamn] om du vill söka på förnamn\n" +
                                "[efternamn] om du vill söka på efternamn\n" +
                                "[adress] om du vil söka på adress\n" +
                                "[fri] om du vill söka på efternamn\n" );

                        String name=sc.nextLine();
                        SearchOperationCreator searchOperationCreator = new SearchOperationCreator(UserList.getInstance());
                        searchingOperation = searchOperationCreator.createSearchingFacrtory(name);
                        if (searchingOperation!=null){
                            searchingOperation.showResult();
                        }else {
                            System.out.println("Fel! \n försök att följa instruktionerna \n " +
                                    "välj (förnamn , efternamn, adress eller fri)");
                        }

                        break;
                     case 3:
                         System.out.println("Programmer avslutas");
                         programIsRuning=false;
                         break;

                }

            }}else if (userType !=null && userType.equalsIgnoreCase("quit")){

                System.out.println(" Välkommen åter\n Programmet avslutas   ");
                programIsRuning=false;

            }else {
                System.out.println(" Felaktig inmatning\n  ");
            }
        }

        }


}
