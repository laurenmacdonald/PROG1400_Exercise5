public class Person {

    //Declaring properties of Person
    private String firstName;
    private String lastName;
    private int isInvited;

    //Default constructor
    public Person() {
    }


    //Setters for firstName, lastName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Getter and setter for isInvited
    public String getIsInvited() {
        if(this.isInvited == 0){
            return "They are invited to the party.";
        }else{
            return "They are NOT invited to the party.";
        }
    }

    public void setIsInvited(int invited) {
        isInvited = invited;
    }
    //Method to concat. first name and last name
    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }
}
