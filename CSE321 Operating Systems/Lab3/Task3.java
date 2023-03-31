
import java.util.*;
class T3thread extends Task3 implements Runnable{
    Scanner sin=new Scanner(System.in);
   static long first_odd_mean,first_even_mean,last_odd_mean,last_even_mean,c1,c2,c3,c4,sum1,sum2,sum3,sum4;




    public void run(){
        if (Thread.currentThread().getName().equals("First")){
        for(int i=0;i<(50/2);i++) {
            if (arr[i] % 2 != 0) {
               sum1  += arr[i];
                c1++;
            }
        }
            first_odd_mean=sum1/c1;
    }

        if (Thread.currentThread().getName().equals("Second")){
            for(int i=0;i<(50/2);i++) {
                if (arr[i] % 2 == 0) {
                   sum2  += arr[i];
                    c2++;
                }
            }
            first_even_mean=sum2/c2;
        }

        if (Thread.currentThread().getName().equals("Third")){
            for(int i=25;i<50;i++) {
                if (arr[i] % 2 != 0) {
                    sum3 += arr[i];
                    c3++;
                }
            }
            last_odd_mean=sum3/c3;
        }

        if (Thread.currentThread().getName().equals("Fourth")){
            for(int i=25;i<50;i++) {
                if (arr[i] % 2 == 0) {
                    sum4 += arr[i];
                    c4++;
                }
            }
            last_even_mean=sum4/c4;
        }

        if (Thread.currentThread().getName().equals("Finally")){
            long avg=(first_even_mean+first_odd_mean+last_even_mean+last_odd_mean)/4;
            System.out.println("pin "+avg);
        }


    }


        }





public class Task3 {

   public static int []arr;
    public  static void main(String[] args){
        find_fibbonacci(50);
        Thread obj1 = new Thread(new T3thread(),"First");
        Thread obj2 = new Thread(new T3thread(),"Second");
        Thread obj3 = new Thread(new T3thread(),"Third");
        Thread obj4 = new Thread(new T3thread(),"Fourth");
        Thread obj5 = new Thread(new T3thread(),"Finally");

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
        try {
            obj5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public static void find_fibbonacci(int num){
        arr=new int[num];
        int n1=0,n2=1,n3;
        arr[0]=n1;
        arr[1]=n2;


        for(int i=2;i<num;i++)
        {
            n3=n1+n2;
            arr[i]=n3;
            n1=n2;
            n2=n3;

        }

    }


}
