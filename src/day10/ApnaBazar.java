package day10;

public class ApnaBazar{
    public static void main(String[] args) {

        Admin admin=new Admin("adminUser", "admin@apnabazar.com","Product Manager");
        admin.displayInfo();
        admin.manageUsers();

        System.out.println();

        Customer customer=new Customer("regularUser", "user@apnabazar.com",150);
        customer.displayInfo();
        customer.placeOrder();

        System.out.println();

        Guest guest=new Guest("guestUser","guest@apnabazac.com");
        guest.displayInfo();
        guest.browserProducts();
    }
}
