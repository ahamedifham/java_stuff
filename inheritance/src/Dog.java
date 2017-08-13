
public class Dog extends Animal {
    
    private int eyes;
    private int legs;
    private int tail;
    
    public Dog(String name, int size, int weight,int eyes, int legs, int tail){
        super(name,1,1,size,weight);
        this.eyes = eyes;
        this.legs= legs;
        this.tail = tail;
        
    }
    
    public void eat(){
        
        System.out.println("Dog eats food");
        super.eat();
    }
    
    public void walk(){
        System.out.println("Dog is walking");
        move(5);
    }
    
    public void run(){
         System.out.println("Dog is running");
        move(10);
    }
    
    public void move(int speed){
        System.out.println("Dog.move() is called");
        moveLegs(speed);
        super.move(speed);
    }
    
    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() is called");
    }
}
