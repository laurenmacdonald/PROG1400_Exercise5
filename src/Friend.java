//Friend class inherits from Person class.
public class Friend extends Person{

    //Declaring property of Friend
    private String foodToBring;

    //Default constructor
    public Friend() {
    }

    //Setter for foodToBring
    public void setFoodToBring(String foodToBring) {
        this.foodToBring = foodToBring;
    }

    //toString method to print full name (ref super class), food they're bringing (subclass) and if they're invited (superclass)
    @Override
    public String toString() {
        return getFullName() + " is bringing " + this.foodToBring + ". " + getIsInvited();
    }
}
