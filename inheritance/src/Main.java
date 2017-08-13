public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden =new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
        
        Dog myDog = new Dog("jIMMY",1,2,3,4,5);
        
        
//        BankAc bankAccount1 = new BankAc();
//       // bankAccount1.setAccountNumber(1);
//   //     bankAccount1.setBalance(500);
////        bankAccount1.setCustomerName("Ahamed");
////        bankAccount1.setEmail("ifham38@gmail.com");
////        bankAccount1.setPhoneNumber("+94222222");
//        
//        bankAccount1.deposite(1000);
//        bankAccount1.withdraw(750);
//        bankAccount1.withdraw(2000);
        myDog.eat();
        myDog.walk();
    }
}
