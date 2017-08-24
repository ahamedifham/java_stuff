public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Galle");
        bank.addBranch("Colombo");
        bank.addCustomer("Galle", "iffi", 50.05);
        bank.addCustomer("Galle", "zakeel", 40.8);
        bank.addCustomer("Galle", "percy", 39.8);
        bank.addCustomer("Colombo", "tim", 39.8);

        bank.addCustomerTransaction("Galle", "iffi", 12.45);
        bank.addCustomerTransaction("Galle", "iffi", 16.45);

        bank.listCustomers("Galle", true);



    }
}
