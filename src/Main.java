//Importing ArrayList class, javax.swing
import java.util.ArrayList;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //ArrayList created to hold friends objects
        ArrayList<Friend> friends = new ArrayList<Friend>();

        //Start of program. Using showMessageDialog method from the JOptionPane class to present welcome message and instructions in pop-up window
        JOptionPane.showMessageDialog(null, "Welcome to the Party Picker.\nEnter person's name and the type of food they're likely " +
                "to bring, then indicate whether they are actually invited or not.");

        //do while loop to continue prompting for user input until user selects "No" from "Enter another guest?" prompt
        int userContinue;       //userContinue variable initialized here to be used in the while part of the do-while
        do{
            //Create a new friend object
            Friend friend = new Friend();

            //Set methods for the new friend object, referencing methods in Friend subclass/Person superclass
            //Methods will take user input and store it in associated variables.
            friend.setFirstName(JOptionPane.showInputDialog("Enter first name"));
            friend.setLastName(JOptionPane.showInputDialog("Enter last name"));
            friend.setFoodToBring(JOptionPane.showInputDialog("Enter food they usually bring"));
            //Setting options for whether invited, corresponds with isInvited set methods (0 = invited)
            Object[] myButtons = {"Invited", "Not Invited"};
            friend.setIsInvited(JOptionPane.showOptionDialog(null,
                    "Choose if this guest is Invited or Not Invited", "Party Picker", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                    null, myButtons, myButtons[1]));

            //Adding newly instantiated Friend object to friends ArrayList
            friends.add(friend);

            //Prompt to continue
            userContinue = JOptionPane.showConfirmDialog(null, "Enter another guest?", //message presented
                    "Party Picker", //title of popup
                    JOptionPane.YES_NO_OPTION); //yes or no presented as options
        }while(userContinue == 0);

        //Create the guests report:
        //creating guestReport String variable to store the friend.toString() output as one 'paragraph'
        String guestReport = " ";
        for(Friend friend : friends){   //enhanced/for-each loop to iterate through each friend object in the friends ArrayList
            guestReport += friend.toString() + "\n"; //adding each friend.toString() return and a new line to the guestReport String variable.
            }
        JOptionPane.showMessageDialog(null, guestReport); //Printing final guest report String variable to JOptionPane

        }

    }