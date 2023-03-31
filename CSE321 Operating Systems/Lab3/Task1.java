import java.util.*;
class mythread extends Thread {
    Scanner sin=new Scanner(System.in);
    public mythread(String name) {
        super(name);
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("add")) {
            System.out.println("Enter 2 numbers for addition");
            int n1=sin.nextInt();
            int n2=sin.nextInt();
            System.out.println("output:"+(n1+n2));
        }

        else if (Thread.currentThread().getName().equals("sub")) {
            System.out.println("Enter 2 numbers for subtraction");
            int n1=sin.nextInt();
            int n2=sin.nextInt();
            System.out.println("output:"+ (n1-n2));
        }

        else if (Thread.currentThread().getName().equals("mul")) {
            System.out.println("Enter 2 numbers for multiplication");
            int n1=sin.nextInt();
            int n2=sin.nextInt();
            System.out.println("output:"+(n1*n2));
        }

        else if (Thread.currentThread().getName().equals("div")) {
            System.out.println("Enter 2 numbers for division");
            int n1=sin.nextInt();
            int n2=sin.nextInt();
            System.out.println("output:"+(n1/n2));
        }

        else
            System.out.println( "No valid operation");

    }
}


public class Task1 {
    public  static  void main(String[]args){

        mythread obj1=new mythread("add");
        mythread obj2=new mythread("sub");
        mythread obj3=new mythread("mul");
        mythread obj4=new mythread("div");
        mythread obj5=new mythread("oth");

        obj1.start();
        try {
            obj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        obj2.start();
        try {
            obj2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        obj3.start();
        try {
            obj3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj4.start();
        try {
            obj4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        obj5.start();






    }
}
