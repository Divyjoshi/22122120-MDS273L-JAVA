// Creating the menu-driven program that has the following menu options:
    // 1. Enter a Name
    // 2. Search for a Name
    // 3. Remove a name
    // 4. Show all names

    import java.util.*;
    public class lab2{
        /**
         * @param args
         */
        public static void main(String[] args) {
          ArrayList<String> names = new ArrayList<>();  // Creating the array
          try (Scanner scan = new Scanner(System.in)) {
            int choice;
              do {

                // Creating and displayig a menu for user to choose

                System.out.println("***************** MENU *******************");
                System.out.println("1. Enter a Name");
                System.out.println("2. Search for a Name");
                System.out.println("3. Remove a Name");
                System.out.println("4. Show all Names");
                System.out.println("5. Exit");
                System.out.println("******************************************");

                System.out.print("Enter your choice: ");  // Choice option for an user

                choice = scan.nextInt();

                // Switch Case for choice outputs
                
     switch (choice) {

        // 1. Enter a Name

            case 1:
              System.out.print("Enter the Name : ");
              String name = scan.next();
              if (names.contains(name)) {
                System.out.println("Name already exists. Please enter a different name.");
              } else {
                names.add(name);
                System.out.println("Name added successfully.");
              }
              break;

        // 2. Search for a Name

              case 2:
              System.out.print("Enter the Name you want to search : ");
              String searchName = scan.next();
              if (names.contains(searchName)) {
                System.out.println( "Name Found which is - " + searchName);
              } else {
                System.out.println(searchName + "Name not Found");
              }
              break;

        // 3. Remove a Name

            case 3:
              System.out.print("Enter the Name you want to remove : ");
              String removeName = scan.next();
              if (names.contains(removeName)) {
                names.remove(removeName);
                System.out.println("Removed Name which is : " + removeName);
              } else {
                System.out.println(removeName + " Name not found");
              }
              break;

        // 4. Show all Names

            case 4:
              System.out.println("All the Entered Names are : ");
              for (String name1 : names) {
                System.out.println(" " + name1);
              }
              break;

        // 5. Exit Option for user to Exit from the choice form menu

            case 5:
              System.out.println("---------- Menu Exiting ----------");
              break;

        // If wrong option selected then this message will show

            default:
              System.out.println(" ***************** NVALID CHOICE ****************\n *******************  TRY AGAIN **********************");
     }
   } while (choice != 5);
        }
  }
}
