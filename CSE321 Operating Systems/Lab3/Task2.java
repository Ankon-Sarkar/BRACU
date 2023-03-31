import java.util.Scanner;

class my_thread extends Thread {
    Scanner sin = new Scanner(System.in);

    public my_thread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("The house is "+Thread.currentThread().getName());
    }
}






public class Task2 {
    public static void main(String[]args){
        my_thread Stark=new my_thread("House Stark");
        my_thread Targaryen=new my_thread("House Targaryen");
        my_thread Lannister=new my_thread("House Lannister");
        my_thread  Bolton=new my_thread("House Bolton");
        my_thread Tyrell=new my_thread("House Tyrell");

        Stark.setPriority(Thread.MIN_PRIORITY);
        Bolton.setPriority(Thread.MIN_PRIORITY);
        Stark.run();
        Targaryen.run();
        Lannister.run();
        Bolton.run();

        Stark.start();
        Tyrell.start();
        Lannister.start();
        Bolton.start();

        if (Stark.isAlive()){
            System.out.println("Not Today");
        }

        if (Bolton.isAlive()){
            System.out.println("You know nothing!");
        }



    }
}
