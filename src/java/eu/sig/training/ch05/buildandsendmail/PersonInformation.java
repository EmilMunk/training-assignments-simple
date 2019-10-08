package eu.sig.training.ch05.buildandsendmail;

public class PersonInformation{
    @SuppressWarnings("unused")
    public String firstName;
    @SuppressWarnings("unused")
    public String lastName;

    PersonInformation(String firstname, String lastname){
        this.firstName = firstname;
        this.lastName = lastname;
    }

    @SuppressWarnings("unused")
    public void addFirstName(String name) {}

    @SuppressWarnings("unused")
    public void addLastName(String interest) {}
}