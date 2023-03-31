class thread extends Thread {

    public thread(String name) {
        super(name);
    }

    @Override
    public void run() {


            if (Thread.currentThread().getName().equals("House Stark") || Thread.currentThread().getName().equals("House Targaryen")) {
                System.out.println("The house is " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else if (Thread.currentThread().getName().equals("House Lannister") || Thread.currentThread().getName().equals("House Bolton")) {

                System.out.println("The house is " + Thread.currentThread().getName());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else {

                System.out.println("The house is " + Thread.currentThread().getName());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

}









public class Task2_bonus {
    public static void main(String[] args) {
        thread Stark=new thread("House Stark");
        thread Targaryen=new thread("House Targaryen");
        thread Lannister=new thread("House Lannister");
        thread  Bolton=new thread("House Bolton");
        thread Tyrell=new thread("House Tyrell");

        Stark.start();
        try {
            Stark.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Targaryen.start();
        try {
            Targaryen.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Tyrell.start();
        try {
            Tyrell.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Lannister.start();
        try {
            Lannister.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Bolton.start();
        try {
            Bolton.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
