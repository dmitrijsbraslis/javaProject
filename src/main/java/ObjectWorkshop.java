import model.Contact;

public class ObjectWorkshop {

    public static void main(String[] args) {
        Contact alisa = new Contact();
        alisa.setFirstName("Alisa");
        alisa.setLastName(null);
        alisa.setPhoneNumber(112);

        Contact hacker = new Contact("Hacker", null, "02");

        System.out.println(alisa.getFirstName() + " " +alisa.getLastName() + ": " + alisa.getPhoneNumber());
        System.out.println(hacker.getFullInfo());
    }
}
